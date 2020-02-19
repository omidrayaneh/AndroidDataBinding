package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private MainActivityClickHandler handlers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityMainBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        activityMainBinding.setUser(getCurrentUser());

        handlers=new MainActivityClickHandler(this);
        activityMainBinding.setClickHandler(handlers);
    }

    private User getCurrentUser(){
        User user=new User();
        user.setUserName("omid");
        user.setUserEmail("omidrayaneh@gmail.com");
        return user;
    }

    public class MainActivityClickHandler {

        Context context;

        public MainActivityClickHandler(Context context) {
            this.context = context;
        }

        public void AllowButtonCliked(View view){
            Toast.makeText(context,"Allow button clicked!",Toast.LENGTH_LONG ).show();
        }
        public void CancelButtonCliked(View view){
            Toast.makeText(context,"Cancel button clicked!",Toast.LENGTH_LONG ).show();
        }
    }
}
