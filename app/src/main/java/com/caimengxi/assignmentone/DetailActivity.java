package com.caimengxi.assignmentone;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Shows the information for one CampusLife service area.  Parts G and H fill the
 * header and the body with the data that MainActivity passes in the Intent.
 */
public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
    }
}
