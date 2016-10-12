package io.github.changjiashuai.coordinatordemo

import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.v4.view.ViewCompat
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View

class FlexibleSpaceExampleActivity : AppCompatActivity(), AppBarLayout.OnOffsetChangedListener {

    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        if (mMaxScrollSize == 0) {
            mMaxScrollSize = appBarLayout?.totalScrollRange as Int
        }
        val currentScrollPercentage = Math.abs(verticalOffset) * 100 / mMaxScrollSize
        if (currentScrollPercentage >= PERCENTAGE_TO_SHOW_IMAGE) {
            if (!mIsImageHidden) {
                mIsImageHidden = true
                ViewCompat.animate(mFab).scaleY(0f).scaleX(0f).start()
            }
        }

        if (currentScrollPercentage < PERCENTAGE_TO_SHOW_IMAGE) {
            if (mIsImageHidden){
                mIsImageHidden = false
                ViewCompat.animate(mFab).scaleX(1.0f).scaleY(1.0f).start()
            }
        }
    }

    companion object {
        val PERCENTAGE_TO_SHOW_IMAGE = 20
    }

    private var mFab: View? = null
    private var mMaxScrollSize: Int = 0
    private var mIsImageHidden: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flexible_space_example)

        mFab = findViewById(R.id.flexible_example_fab)
        val toolbar: Toolbar = findViewById(R.id.flexible_example_toolbar) as Toolbar
        toolbar.setNavigationOnClickListener { onBackPressed() }

        val appbar: AppBarLayout = findViewById(R.id.flexible_example_appbar) as AppBarLayout
        appbar.addOnOffsetChangedListener(this)
    }
}
