package com.dottest.activity

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.dottest.R
import com.dottest.model.ListData
import com.dottest.mvp.BaseMvpActivity
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseMvpActivity<HomeContract.View, HomeContract.Presenter>(), HomeContract.View {

    override var mPresenter: HomeContract.Presenter = HomePresenter()

    private lateinit var homeAdapter: HomeAdapter
    private val listData: MutableList<ListData.Data> = mutableListOf()

    override fun showList(response: ListData.ListDataResponse) {
        recyclerview_home.visibility = View.VISIBLE
        progress_home.visibility = View.GONE

        listData.clear()
        listData.addAll(response.data)

        homeAdapter.addList(listData)
        homeAdapter.notifyDataSetChanged()
    }

    override fun showReload() {
        button_home_reload.visibility = View.VISIBLE
        progress_home.visibility = View.GONE
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setupRecyler()
        mPresenter.loadList()
    }

    private fun setupRecyler() {
        homeAdapter = HomeAdapter()
        recyclerview_home.adapter = homeAdapter
        recyclerview_home.layoutManager = LinearLayoutManager(this)
    }
}
