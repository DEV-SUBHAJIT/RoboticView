package com.roy.roboticview;

import android.os.Bundle;
import android.view.LayoutInflater;

import androidx.appcompat.app.AppCompatActivity;

import com.roy.roboticview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(LayoutInflater.from(MainActivity.this));
        setContentView(binding.getRoot());

        RoboticText.setTextRoboticStyle(binding.tvText, "If view binding is enabled for a module, a binding class is generated for each XML layout file that the module contains. Each binding class contains references to the root view and all views that have an ID. The name of the binding class is generated by converting the name of the XML file to Pascal case and adding the word \"Binding\" to the end.", 50);
        RoboticText.setTextRoboticStyle(binding.tvNumber, 100,50);
    }

    @Override
    public void onBackPressed() {
        RoboticText.setTextRoboticStyle(binding.tvText, "If view binding is enabled for a module, a binding class is generated for each XML layout file that the module contains. Each binding class contains references to the root view and all views that have an ID. The name of the binding class is generated by converting the name of the XML file to Pascal case and adding the word \"Binding\" to the end.");
        RoboticText.setTextRoboticStyle(binding.tvNumber, 100);
    }
}