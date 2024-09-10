package com.example.activitylifecycle;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/**
 * An example dialog activity using the Android Theme.AppCompat.Dialog
 */
public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_layout);
    }
}
