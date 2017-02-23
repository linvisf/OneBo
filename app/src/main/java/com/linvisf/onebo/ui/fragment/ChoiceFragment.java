package com.linvisf.onebo.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.linvisf.onebo.R;
import com.linvisf.onebo.base.BaseFragment;

/**
 * Created by linhong on 2016/12/23.
 * <p>
 * 描述：精选界面
 */

public class ChoiceFragment extends BaseFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_choice, container, false);
    }
}
