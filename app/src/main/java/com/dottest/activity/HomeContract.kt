package com.dottest.activity

import com.dottest.model.ListData
import com.dottest.mvp.BaseMvpPresenter
import com.dottest.mvp.BaseMvpView

interface HomeContract {
    interface View: BaseMvpView{
        fun showList(response: ListData.ListDataResponse)

        fun showReload()
    }

    interface Presenter:BaseMvpPresenter<View>{
        fun loadList()
    }
}