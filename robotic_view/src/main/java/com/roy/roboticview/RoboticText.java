package com.roy.roboticview;

import android.os.Handler;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class RoboticText {

    public static void setTextRoboticStyle(@NotNull TextView textView, @NotNull String text) {
        List<String> finalText = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            finalText.add(text.substring(0, i + 1));
        }

        final Handler handler = new Handler();
        int delay = 100;

        for (final String s : finalText) {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    textView.setText(s);
                }
            }, delay);
            delay += 150; // increment the delay for each iteration
        }
    }

    public static void setTextRoboticStyle(@NotNull TextView textView, @NotNull String text, int delay) {
        List<String> finalText = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            finalText.add(text.substring(0, i + 1));
        }

        final Handler handler = new Handler();
        int mDelay = 100;

        for (final String s : finalText) {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    textView.setText(s);
                }
            }, mDelay);
            mDelay += delay; // increment the delay for each iteration
        }
    }

    public static void setTextRoboticStyle(@NotNull TextView textView, int integer) {
        List<String> finalText = new ArrayList<>();
        for (int i = 0; i <= integer; i++) {
            finalText.add(String.valueOf(i));
        }

        final Handler handler = new Handler();
        int delay = 0;

        for (final String s : finalText) {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    textView.setText(s);
                }
            }, delay);
            delay += 100; // increment the delay for each iteration
        }
    }

    public static void setTextRoboticStyle(@NotNull TextView textView, int integer, int delay) {
        List<String> finalText = new ArrayList<>();
        for (int i = 0; i <= integer; i++) {
            finalText.add(String.valueOf(i));
        }

        final Handler handler = new Handler();
        int mDelay = 0;

        for (final String s : finalText) {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    textView.setText(s);
                }
            }, mDelay);
            mDelay += delay; // increment the delay for each iteration
        }
    }

}
