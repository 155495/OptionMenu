package com.bivin.optionmenu;

import android.app.ActionBar;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ActivityMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
    }

    @Nullable
    @Override
    public ActionBar getActionBar() {
        getActionBar().hide();
        return super.getActionBar();
    }
}
