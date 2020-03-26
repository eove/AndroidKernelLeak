package com.eove.androidkernelleak;

import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.setTitle("Hello");
        dialog.setMessage("World");
        Handler handler = new Handler();
        scheduleVisibilityToggle(handler, dialog,true);
    }

    private void scheduleVisibilityToggle(Handler handler, AlertDialog dialog, boolean visible) {
        if (visible) {
            dialog.hide();
        } else {
            dialog.show();
        }
        handler.postDelayed(() -> scheduleVisibilityToggle(handler, dialog, !visible), 100);
    }
}
