package com.example.chapter03.utils;

import android.content.Context;

public class Utils {

    public static int dp2px(Context context, int dpValue) {

        float scale = context.getResources().getDisplayMetrics().density;
        return (int)(dpValue * scale + 0.5f);
    }
}
