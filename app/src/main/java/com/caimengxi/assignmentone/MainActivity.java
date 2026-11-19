package com.caimengxi.assignmentone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Main screen of CampusLife.  Every image button reports which service area the
 * user selected and then opens {@link DetailActivity} with the index of that
 * area; the click handlers are referenced from activity_main.xml with the
 * android:onClick attribute (in both the portrait and the landscape layout).
 *
 * <p>The TOPIC_* constants below must stay in the same order as the entries of
 * the arrays in res/values/arrays.xml, because DetailActivity uses the index it
 * receives to read those arrays.</p>
 */
public class MainActivity extends AppCompatActivity {

    /** Index of each service area inside the arrays defined in arrays.xml. */
    private static final int TOPIC_FACILITIES = 0;
    private static final int TOPIC_EVENTS = 1;
    private static final int TOPIC_CLUBS = 2;
    private static final int TOPIC_SUPPORT = 3;

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
        openDetail(TOPIC_FACILITIES, R.string.toast_facilities_clicked);
    }

    /**
     * Handles a tap on the Events image button.
     *
     * @param view the ImageButton that was clicked
     */
    public void onEventsClick(View view) {
        openDetail(TOPIC_EVENTS, R.string.toast_events_clicked);
    }

    /**
     * Handles a tap on the Clubs image button.
     *
     * @param view the ImageButton that was clicked
     */
    public void onClubsClick(View view) {
        openDetail(TOPIC_CLUBS, R.string.toast_clubs_clicked);
    }

    /**
     * Handles a tap on the Support image button.
     *
     * @param view the ImageButton that was clicked
     */
    public void onSupportClick(View view) {
        openDetail(TOPIC_SUPPORT, R.string.toast_support_clicked);
    }

    /**
     * Confirms the tap with a Toast and starts {@link DetailActivity} through an
     * explicit Intent.  The index of the selected service area travels with the
     * Intent so that the detail screen knows which content to display.
     *
     * @param topicIndex   index of the selected service area
     * @param toastMessage string resource shown in the confirmation Toast
     */
    private void openDetail(int topicIndex, int toastMessage) {
        Toast.makeText(this, toastMessage, Toast.LENGTH_SHORT).show();

        Intent openDetail = new Intent(this, DetailActivity.class);
        openDetail.putExtra(DetailActivity.EXTRA_TOPIC_INDEX, topicIndex);
        startActivity(openDetail);
    }
}
