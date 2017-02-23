package com.linvisf.onebo.util;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by linhong on 2016/12/23.
 * <p>
 * 描述：
 */

public class ActivityUtils {

    public static void addFragmentToActivity(@NonNull FragmentManager fragmentManager,
                                             @NonNull Fragment fragment, int viewId) {
        if (fragmentManager == null) return;
        if (fragment == null) return;
        FragmentTransaction ft = fragmentManager.beginTransaction();
        ft.add(viewId, fragment);
        ft.commit();
    }
}
