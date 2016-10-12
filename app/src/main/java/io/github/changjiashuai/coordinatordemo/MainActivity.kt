package io.github.changjiashuai.coordinatordemo

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.main_coordinator_textview -> SimpleCoordinatorActivity.start(this)
            R.id.main_ioexample_textview -> ""
            R.id.main_space_textview -> ""
            R.id.main_materialup_textview -> ""
            R.id.main_swipebehavior_textview -> ""
            else -> ""
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar:Toolbar = findViewById(R.id.main_toolbar) as Toolbar
        toolbar.inflateMenu(R.menu.main)
        toolbar.setOnMenuItemClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/changjiashuai/CoordinatorDemo"))
            startActivity(intent)
            true
        }

        findViewById(R.id.main_coordinator_textview).setOnClickListener(this)
        findViewById(R.id.main_materialup_textview).setOnClickListener(this)
        findViewById(R.id.main_ioexample_textview).setOnClickListener(this)
        findViewById(R.id.main_space_textview).setOnClickListener(this)
        findViewById(R.id.main_swipebehavior_textview).setOnClickListener(this)
    }
}
