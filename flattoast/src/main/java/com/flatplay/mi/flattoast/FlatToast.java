package com.flatplay.mi.flattoast;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.CheckResult;
import androidx.appcompat.content.res.AppCompatResources;


public class FlatToast {

    private static final String INFO = "info";
    private static final String SUCCESS = "success";
    private static final String WARNING = "warning";
    private static final String ERROR = "error";
    private static final String CUSTOM = "custom";


    @CheckResult
    public static Toast info(Context context, String message, int duration, boolean icon, int position) {
        return customToast(context, message, duration, INFO, true, position, 0);
    }

    @CheckResult
    public static Toast success(Context context, String message, int duration, boolean icon, int position) {
        return customToast(context, message, duration, SUCCESS, true, position, 0);
    }

    @CheckResult
    public static Toast warning(Context context, String message, int duration, boolean icon, int position) {
        return customToast(context, message, duration, WARNING, true, position, 0);
    }

    @CheckResult
    public static Toast error(Context context, String message, int duration, boolean icon, int position) {
        return customToast(context, message, duration, ERROR, true, position, 0);
    }

    @CheckResult
    public static Toast custom(Context context, String message, int duration, boolean withIcon, int position, int iconResource) {
        return customToast(context, message, duration, CUSTOM, withIcon, position, iconResource);
    }

    @CheckResult
    private static Toast customToast(Context context, String message, int duration, String type, boolean withIcon, int position, int iconResource) {
        Toast toast = Toast.makeText(context, "", duration);
        View toastLayout = ((LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE))
                .inflate(R.layout.toast_layout, null);
        TextView toastMessage = toastLayout.findViewById(R.id.text);
        ImageView toastIcon = toastLayout.findViewById(R.id.icon);
        Drawable drawable;
        drawable = AppCompatResources.getDrawable(context, getFrame(type));
        toastLayout.setBackground(drawable);
        if (position != 0)
            setToastGravity(position, toast);
        toastMessage.setText(message);
        if (withIcon) {
            if (iconResource == 0) {
                toastIcon.setBackgroundResource(getIcon(type));
            } else {
                toastIcon.setBackgroundResource(iconResource);
            }
        } else {
            toastIcon.setVisibility(View.GONE);
        }
        toast.setView(toastLayout);
        toast.show();
        return toast;
    }

    private static void setToastGravity(int position, Toast toast) {
        switch (position) {
            case Gravity.TOP:
                toast.setGravity(Gravity.TOP, 0, 200);
                break;
            case Gravity.CENTER:
                toast.setGravity(Gravity.CENTER, 0, 0);
                break;
            case Gravity.BOTTOM:
                toast.setGravity(Gravity.BOTTOM, 0, 0);
                break;
            default:
                break;
        }
    }

    private static int getIcon(String type) {
        switch (type) {
            case INFO:
                return R.drawable.ic_action_info;
            case SUCCESS:
                return R.drawable.ic_action_success;
            case WARNING:
                return R.drawable.ic_action_warning;
            case ERROR:
                return R.drawable.ic_action_error;
            default:
                return R.drawable.ic_action_success;
        }
    }

    private static int getFrame(String type) {
        switch (type) {
            case INFO:
                return R.drawable.layout_info;
            case SUCCESS:
                return R.drawable.layout_success;
            case WARNING:
                return R.drawable.layout_warning;
            case ERROR:
                return R.drawable.layout_error;
            default:
                return R.drawable.layout_frame;
        }
    }


}
