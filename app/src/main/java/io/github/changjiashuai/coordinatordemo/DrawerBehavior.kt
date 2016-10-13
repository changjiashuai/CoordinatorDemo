package io.github.changjiashuai.coordinatordemo

import android.content.Context
import android.support.design.widget.CoordinatorLayout
import android.support.v7.widget.Toolbar
import android.util.AttributeSet
import android.view.View
import android.widget.TextView

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2016/10/13 14:33.
 */
class DrawerBehavior(context: Context?, attrs: AttributeSet?) : CoordinatorLayout.Behavior<TextView>(context, attrs) {
    private val mFrameMaxHeight = 100
    private var mStartY = 0

    override fun layoutDependsOn(parent: CoordinatorLayout?, child: TextView?, dependency: View?): Boolean {
        return dependency is Toolbar
    }

    override fun onDependentViewChanged(parent: CoordinatorLayout?, child: TextView?, dependency: View?): Boolean {
        if (mStartY == 0) {
            mStartY = dependency!!.y.toInt()
        }
        val percent = dependency!!.y.div(mStartY)
        child?.y = (1 - percent) * child!!.height - child!!.height
        return true
    }
}