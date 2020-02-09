package com.asokk.loadingimagesdatabinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.asokk.loadingimagesdatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setUser(new User("Princess Diana", "USA"));
        binding.setImageUrl("https://androidwave.com/wp-content/uploads/2019/01/profile_pic.jpg");

    }
}
