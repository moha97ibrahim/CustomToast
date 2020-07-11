package com.flatplay.mi.flattoast;

import android.content.Context;
import android.widget.Toast;

public class FlatToast {
    public static void normalToast(Context context,String message,int duration) {
        Toast.makeText(context,message,duration).show();
    }
}
