package com.example.mahadi.frgmtandrcycle;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.hamcrest.Description;
import org.hamcrest.Matcher;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.matcher.BoundedMatcher;
import androidx.test.internal.util.Checks;

/* Samples.
 */
public class RecyclerViewMatchers {

    public static Matcher<View> hasDrawable() {
        return new BoundedMatcher<View, ImageView>(ImageView.class) {

            @Override
            protected boolean matchesSafely(ImageView imageView) {
                return imageView.getDrawable() != null;
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("has drawable");
            }
        };
    }

    public static Matcher<RecyclerView.ViewHolder> withContactName(final String contactName) {
        Checks.checkNotNull(contactName);

        return new BoundedMatcher<RecyclerView.ViewHolder, RecycleViewAdapter.MyViewHolder>(
                RecycleViewAdapter.MyViewHolder.class) {
            @Override
            protected boolean matchesSafely(RecycleViewAdapter.MyViewHolder holder) {
                final TextView contactNameDisplayed = (TextView) holder.itemView.findViewById(R.id.name_contact);
                return contactNameDisplayed.getText().equals(contactName);
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("with contact name: " + contactName);
            }
        };
    }

    /**
     * Matches EditText hint by specific text color.
     * @param expectedColor - expected color code
     * @return {@link Matcher<View>}
     */
    public static Matcher<View> withHintColor(final int expectedColor) {
        return new BoundedMatcher<View, EditText>(EditText.class) {

            @Override
            protected boolean matchesSafely(EditText editText) {
                return expectedColor == editText.getCurrentHintTextColor();
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("expected with hint color: " + expectedColor);
            }
        };
    }

    public static Matcher<View> withName(final String name) {
        return new BoundedMatcher<View, LinearLayout>(LinearLayout.class) {

            @Override
            protected boolean matchesSafely(LinearLayout layout) {
                final TextView contactNameDisplayed = (TextView) layout.findViewById(R.id.name_contact);
                return contactNameDisplayed.getText().equals(name);
            }

            @Override
            public void describeTo(Description description) {
                description.appendText("expected with hint color: " + name);
            }
        };
    }
}
