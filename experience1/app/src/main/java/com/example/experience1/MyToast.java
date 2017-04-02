package com.example.experience1;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by apple1 on 2017/4/2.
 */

public  class MyToast {
        private static Toast toast;
        public static void showToast(Context context, String content) {
            if (toast == null) {
                toast = Toast.makeText(context, content, Toast.LENGTH_SHORT);
            } else {
                toast.setText(content);
            }
            toast.show();
        }
}
