package io.github.changjiashuai.coordinatordemo

import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.SwipeDismissBehavior
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.CardView
import android.view.View
import android.widget.Toast

class SwipeBehaviorExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_swipe_behavior_example)

        val cardView:CardView = findViewById(R.id.swype_card) as CardView
        val swipe = SwipeDismissBehavior<View>()
        swipe.setSwipeDirection(SwipeDismissBehavior.SWIPE_DIRECTION_ANY)
        swipe.setListener(object : SwipeDismissBehavior.OnDismissListener {
            override fun onDragStateChanged(state: Int) {

            }

            override fun onDismiss(view: View?) {
                Toast.makeText(applicationContext, "Card swiped !!", Toast.LENGTH_SHORT).show()
            }
        })
        val coordinatorParams:CoordinatorLayout.LayoutParams = cardView.layoutParams as CoordinatorLayout.LayoutParams
        coordinatorParams.behavior = swipe
    }
}
