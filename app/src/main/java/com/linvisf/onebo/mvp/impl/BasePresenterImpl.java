package com.linvisf.onebo.mvp.impl;

import com.linvisf.onebo.base.BasePresenter;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by linhong on 2016/12/23.
 * <p>
 * 描述：
 */

public class BasePresenterImpl implements BasePresenter {

    private CompositeSubscription mSubscription;

    protected void addSubscription(Subscription s) {
        if (this.mSubscription == null) {
            this.mSubscription = new CompositeSubscription();
        }
        this.mSubscription.add(s);
    }

    @Override
    public void onDestroy() {
        if (this.mSubscription != null) {
            this.mSubscription.unsubscribe();
        }
    }
}
