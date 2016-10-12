package io.github.changjiashuai.coordinatordemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

class CollapsingToolbarExampleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collapsing_toolbar_example)
        val toolbar:Toolbar = findViewById(R.id.ioexample_toolbar) as Toolbar
        toolbar.setNavigationOnClickListener { onBackPressed() }
    }
}
