package com.caimengxi.assignmentone;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Shows the information for one CampusLife service area.  The index of that area
 * arrives in the Intent from MainActivity and is used to read the matching entry
 * of the arrays defined in arrays.xml.
 */
public class DetailActivity extends AppCompatActivity {

    /** Key of the Intent extra that identifies the selected service area. */
    public static final String EXTRA_TOPIC_INDEX =
            "com.caimengxi.assignmentone.extra.TOPIC_INDEX";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int topicIndex = getIntent().getIntExtra(EXTRA_TOPIC_INDEX, 0);
        populateFromResources(topicIndex);
    }

    /**
     * Fills the header and the body of the screen with the data stored in
     * arrays.xml.  Every array is indexed with the same value, therefore no
     * if statement or switch case is needed to pick the right content.
     *
     * @param topicIndex index of the selected service area
     */
    private void populateFromResources(int topicIndex) {
        Resources resources = getResources();

        String[] labels = resources.getStringArray(R.array.string_array_labels);
        String[] titles = resources.getStringArray(R.array.string_array_titles);
        String[] contents = resources.getStringArray(R.array.string_array_content);
        String[] imageNames = resources.getStringArray(R.array.string_array_images);

        TextView header = findViewById(R.id.tvDetailHeader);
        header.setText(labels[topicIndex]);

        ImageView icon = findViewById(R.id.ivDetailIcon);
        icon.setImageResource(getDrawableId(resources, imageNames[topicIndex]));

        TextView title = findViewById(R.id.tvDetailTitle);
        title.setText(titles[topicIndex]);

        TextView content = findViewById(R.id.tvDetailContent);
        content.setText(contents[topicIndex]);
    }

    /**
     * Resolves a name stored in string_array_images (for example
     * "img_btn_facilities") to the identifier of the matching drawable.
     *
     * @param resources the resources of this application
     * @param imageName name of the drawable, without a file extension
     * @return the drawable resource identifier
     */
    private int getDrawableId(Resources resources, String imageName) {
        return resources.getIdentifier(imageName.trim(), "drawable", getPackageName());
    }
}
