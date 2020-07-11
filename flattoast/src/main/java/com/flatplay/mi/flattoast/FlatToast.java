package com.flatplay.mi.flattoast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.content.res.AppCompatResources;

public class FlatToast {

    public static void normalToast(Context context, String message, int duration) {
        Toast.makeText(context, message, duration).show();
    }


    public static Toast info(Context context, String message, int duration) {
        return customToast(context, message, duration);
    }

    public static Toast customToast(Context context, String message, int duration) {
        Toast toast = Toast.makeText(context, "", duration);
        View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.toast_layout, null);
        TextView toastMessage = toastLayout.findViewById(R.id.text);
        Drawable drawable;
        drawable = AppCompatResources.getDrawable(context,R.drawable.layout_frame);
        toastLayout.setBackground(drawable);
        toastMessage.setText(message);
        toast.setView(toastLayout);
        toast.show();
        return toast;
    }
}
