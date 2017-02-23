package com.linvisf.onebo.util;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.TextUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by linhong on 2016/12/23.
 * <p>
 * 描述：
 */

public class FragmentUtil {

    protected static List<String> mFragmentTags = new ArrayList<>(10);

    private static void hideAllFragments(FragmentTransaction ft, FragmentManager manager) {
        if (ft == null) return;
        if (manager == null) return;
        for (String tag : mFragmentTags) {
            Fragment fragment = manager.findFragmentByTag(tag);
            if (fragment != null) {
                ft.hide(fragment);
            }
        }
    }

    public static Fragment showFragment(FragmentActivity activity, String fragmentClass, Bundle args, int parentLayoutId) {
        if (activity == null || TextUtils.isEmpty(fragmentClass)) return null;

        FragmentManager manager = activity.getSupportFragmentManager();
        FragmentTransaction ft = manager.beginTransaction();
        Fragment fragment = manager.findFragmentByTag(fragmentClass);
        if (fragment == null) {
            if (args == null) {
                args = new Bundle();
            }
            fragment = Fragment.instantiate(activity, fragmentClass, args);

            hideAllFragments(ft, manager);
            ft.add(parentLayoutId, fragment, fragmentClass);
            mFragmentTags.add(fragmentClass);
        } else {
            hideAllFragments(ft, manager);
            ft.show(fragment);
        }
        ft.commitAllowingStateLoss();
        return fragment;
    }
}
