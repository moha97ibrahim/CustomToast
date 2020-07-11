package com.flatplay.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.flatplay.mi.flattoast.FlatToast;

public class MainActivity extends AppCompatActivity {

    FlatToast flatToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//
//        LayoutInflater layoutInflater = getLayoutInflater();
//        View view = layoutInflater.inflate(R.layout.coustom_toast_layout, (ViewGroup) findViewById(R.id.cus));
//
//        Toast toast = new Toast(getApplicationContext());
//        toast.setDuration(Toast.LENGTH_LONG);
//        toast.setGravity(Gravity.BOTTOM,0,0);
//        toast.setView(view);
//        toast.show();

        flatToast.normalToast(getApplicationContext(),"hello",Toast.LENGTH_LONG);
    }

}
