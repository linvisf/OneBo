package com.linvisf.onebo.ui.activity;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

import com.linvisf.onebo.R;
import com.linvisf.onebo.base.BaseActivity;
import com.linvisf.onebo.base.BaseFragment;
import com.linvisf.onebo.ui.fragment.BeautyFragment;
import com.linvisf.onebo.ui.fragment.ChoiceFragment;
import com.linvisf.onebo.ui.fragment.JokeFragment;
import com.linvisf.onebo.util.FragmentUtil;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    private SparseArray<BaseFragment> mFragments;

    private TextView tv_beauty;
    private TextView tv_choice;
    private TextView tv_joke;

    private BeautyFragment mBeautyFragment;
    private ChoiceFragment mChoiceFragment;
    private JokeFragment mJokeFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initEvent();
        initFragment();
        initData();
    }

    private void initView() {
        tv_beauty = xFindViewById(R.id.tv_beauty);
        tv_choice = xFindViewById(R.id.tv_choice);
        tv_joke = xFindViewById(R.id.tv_joke);
    }

    private void initEvent() {
        tv_beauty.setOnClickListener(this);
        tv_choice.setOnClickListener(this);
        tv_joke.setOnClickListener(this);
    }

    private void initFragment() {
        mBeautyFragment = new BeautyFragment();
        mChoiceFragment = new ChoiceFragment();
        mJokeFragment = new JokeFragment();

        mFragments = new SparseArray<>();
        mFragments.put(R.id.tv_beauty, mBeautyFragment);
        mFragments.put(R.id.tv_choice, mChoiceFragment);
        mFragments.put(R.id.tv_joke, mJokeFragment);
    }

    private void showFragment(int index) {
        FragmentUtil.showFragment(this, mFragments.get(index).getClass().getName(), null, R.id.layout_content);
    }

    private void initData() {
        showFragment(R.id.tv_beauty);
    }

    @Override
    public void onClick(View v) {
        showFragment(v.getId());
    }
}
