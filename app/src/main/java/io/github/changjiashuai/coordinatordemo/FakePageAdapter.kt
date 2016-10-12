package io.github.changjiashuai.coordinatordemo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Email: changjiashuai@gmail.com
 *
 * Created by CJS on 2016/10/12 17:35.
 */
class FakePageAdapter: RecyclerView.Adapter<FakePageAdapter.FakePageVH> {

    private var numItems = 0

    constructor(numItems: Int){
        this.numItems = numItems
    }

    override fun onBindViewHolder(holder: FakePageVH?, position: Int) {

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): FakePageVH {
        val itemView:View = LayoutInflater.from(parent?.context).inflate(R.layout.list_item_card, parent, false)
        return FakePageVH(itemView)
    }

    override fun getItemCount(): Int {
        return numItems
    }

    class FakePageVH(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    }
}