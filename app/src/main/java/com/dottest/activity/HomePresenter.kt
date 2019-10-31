package com.dottest.activity

import com.dottest.api.ApiManager
import com.dottest.api.ErrorResponseHandler
import com.dottest.mvp.BaseMvpPresenterImpl
import rx.functions.Action1

class HomePresenter: BaseMvpPresenterImpl<HomeContract.View>(), HomeContract.Presenter{
    override fun loadList() {
        ApiManager.getListData()
            .doOnError { mView?.showMessage(it.toString()) }
            .subscribe(
                Action1 { mView?.showList(it) },
                ErrorResponseHandler(mView, true) {_, _, _ -> mView?.showReload()}
            )
    }
}