package io.github.changjiashuai.coordinatordemo

import android.os.Bundle
import android.support.design.widget.AppBarLayout
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.support.v4.view.ViewPager
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.widget.ImageView

class MaterialUpConceptActivity : AppCompatActivity(), AppBarLayout.OnOffsetChangedListener {
    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        if (mMaxScrollSize == 0) {
            mMaxScrollSize = appBarLayout?.totalScrollRange as Int
        }
        val percentage = Math.abs(verticalOffset) * 100 / mMaxScrollSize

        if (percentage >= PERCENTAGE_TO_ANIMATE_AVATAR && mIsAvatarShwon) {
            mIsAvatarShwon = false
            mProfileImage!!.animate().scaleX(0f).scaleY(0f).setDuration(200).start()
        }

        if (percentage <= PERCENTAGE_TO_ANIMATE_AVATAR && !mIsAvatarShwon){
            mIsAvatarShwon = true
            mProfileImage!!.animate().scaleY(1.0f).scaleX(1.0f).start()
        }
    }

    companion object {
        val PERCENTAGE_TO_ANIMATE_AVATAR = 20
    }

    private var mIsAvatarShwon = true
    private var mMaxScrollSize = 0
    private var mProfileImage: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_material_up_concept)

        val tabLayout: TabLayout = findViewById(R.id.materialup_tabs) as TabLayout
        val viewPager: ViewPager = findViewById(R.id.materialup_viewpager) as ViewPager
        val appbarLayout: AppBarLayout = findViewById(R.id.materialup_appbar) as AppBarLayout
        mProfileImage = findViewById(R.id.materialup_profile_image) as ImageView
        val toolbar: Toolbar = findViewById(R.id.materialup_toolbar) as Toolbar
        toolbar.setNavigationOnClickListener { onBackPressed() }
        appbarLayout.addOnOffsetChangedListener(this)
        mMaxScrollSize = appbarLayout.totalScrollRange
        viewPager.adapter = TabsAdapter(supportFragmentManager)
        tabLayout.setupWithViewPager(viewPager)
    }

    class TabsAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm) {

        override fun getItem(position: Int): Fragment? {
            when (position) {
                0 -> return MaterialUpConceptFakePage.newInstance()
                1 -> return MaterialUpConceptFakePage.newInstance()
            }
            return null
        }

        override fun getPageTitle(position: Int): CharSequence {
            when (position) {
                0 -> return "Tab 1"
                1 -> return "Tab 2"
            }
            return ""
        }

        override fun getCount(): Int {
            return 2
        }

    }
}
