package io.github.changjiashuai.coordinatordemo

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2016/10/12 17:31.
 */
class MaterialUpConceptFakePage : Fragment() {

    private var mRootView: RecyclerView? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        mRootView = inflater?.inflate(R.layout.fragment_page, container, false) as RecyclerView?
        return mRootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        initRecyclerView()
    }

    fun initRecyclerView() {
        mRootView?.adapter = FakePageAdapter(20)
    }

    companion object {
        fun newInstance(): Fragment {
            return MaterialUpConceptFakePage()
        }
    }
}