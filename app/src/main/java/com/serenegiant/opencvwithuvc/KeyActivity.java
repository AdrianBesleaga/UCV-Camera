package com.serenegiant.opencvwithuvc;

import android.app.Activity;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

import static android.content.ContentValues.TAG;

public class KeyActivity extends Activity implements View.OnKeyListener {
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.w(TAG, "button pressed");
        return false;
    }

    @Override
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        Log.w(TAG, "button pressed");
        return false;
    }
}
