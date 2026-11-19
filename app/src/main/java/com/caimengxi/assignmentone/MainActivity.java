package com.caimengxi.assignmentone;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Main screen of CampusLife.  Every image button reports which service area the
 * user selected; the click handlers are referenced from activity_main.xml with
 * the android:onClick attribute (in both the portrait and the landscape layout).
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Handles a tap on the Facilities image button.
     *
     * @param view the ImageButton that was clicked
     */
    public void onFacilitiesClick(View view) {
        Toast.makeText(this, R.string.toast_facilities_clicked, Toast.LENGTH_SHORT).show();
    }

    /**
     * Handles a tap on the Events image button.
     *
     * @param view the ImageButton that was clicked
     */
    public void onEventsClick(View view) {
        Toast.makeText(this, R.string.toast_events_clicked, Toast.LENGTH_SHORT).show();
    }

    /**
     * Handles a tap on the Clubs image button.
     *
     * @param view the ImageButton that was clicked
     */
    public void onClubsClick(View view) {
        Toast.makeText(this, R.string.toast_clubs_clicked, Toast.LENGTH_SHORT).show();
    }

    /**
     * Handles a tap on the Support image button.
     *
     * @param view the ImageButton that was clicked
     */
    public void onSupportClick(View view) {
        Toast.makeText(this, R.string.toast_support_clicked, Toast.LENGTH_SHORT).show();
    }
}
