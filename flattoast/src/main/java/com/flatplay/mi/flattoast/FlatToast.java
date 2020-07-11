package com.flatplay.mi.flattoast;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Toast;

public class FlatToast  {

    public static void normalToast(Context context,String message,int duration) {
        Toast.makeText(context,message,duration).show();
    }

    public static void rainbowToast(Context context,String message,int duration){

        Toast toast = Toast.makeText(context,message,duration);
        View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.toast_layout,null);
        toast.setView(toastLayout);
        toast.show();
    }
}
