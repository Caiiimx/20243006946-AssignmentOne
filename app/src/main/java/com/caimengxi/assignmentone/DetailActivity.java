package com.caimengxi.assignmentone;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Shows the information for one CampusLife service area.  The area is identified
 * by the index that MainActivity passes in the Intent; Part H uses that index to
 * fill the screen with the data stored in arrays.xml.
 */
public class DetailActivity extends AppCompatActivity {

    /** Key of the Intent extra that identifies the selected service area. */
    public static final String EXTRA_TOPIC_INDEX =
            "com.caimengxi.assignmentone.extra.TOPIC_INDEX";

    /** Index of the selected service area, received from MainActivity. */
    private int topicIndex;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        topicIndex = getIntent().getIntExtra(EXTRA_TOPIC_INDEX, 0);
    }
}
