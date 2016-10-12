package io.github.changjiashuai.coordinatordemo

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SimpleCoordinatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_coordinator)
//        val collapsingToolbarLayout:CollapsingToolbarLayout = findViewById(R.id.main_collapsing) as CollapsingToolbarLayout
//        collapsingToolbarLayout.title = getString(R.string.app_name)
    }

    companion object {
        fun start(c: Context) {
            val intent = Intent(c, SimpleCoordinatorActivity::class.java)
            c.startActivity(intent)
        }
    }
}