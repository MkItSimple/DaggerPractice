package com.example.daggerpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.RequestManager;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {

//    private static final String TAG = "AuthActivity";
//
//    @Inject
//    String someString;
//
//    @Inject
//    Drawable logo;
//
//    @Inject
//    RequestManager requestManager;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_auth);
//
//        Log.d(TAG, "onCreate: " + someString);
//        setLogo();
//    }
//
//    private void setLogo(){
//        requestManager
//                .load(logo)
//                .into((ImageView)findViewById(R.id.login_logo));
//    }
}
