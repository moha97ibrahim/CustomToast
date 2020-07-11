package com.flatplay.customtoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.flatplay.mi.flattoast.FlatToast;

public class MainActivity extends AppCompatActivity {



    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FlatToast.custom(getApplicationContext(),"Unable to load" +
                "Unable to load" +
                "Unable to load",0,true,0,R.drawable.ic_action_success);

    }

}
