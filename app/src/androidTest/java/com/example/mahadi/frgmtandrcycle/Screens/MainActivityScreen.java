package com.example.mahadi.frgmtandrcycle.Screens;

import android.app.Activity;
import android.content.Intent;

import com.example.mahadi.frgmtandrcycle.R;
import com.example.mahadi.frgmtandrcycle.RecyclerViewMatchers;

import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static com.schibsted.spain.barista.assertion.BaristaListAssertions.assertCustomAssertionAtPosition;
import static com.schibsted.spain.barista.interaction.BaristaListInteractions.scrollListToPosition;
import static com.schibsted.spain.barista.interaction.BaristaViewPagerInteractions.swipeViewPagerForward;


public class MainActivityScreen extends Screen {

    public MainActivityScreen(ActivityTestRule<? extends Activity> activityRule, Intent intent) {
        super(activityRule, intent);
    }

    public MainActivityScreen goToContactFragment() {
        swipeViewPagerForward();
        return this;
    }

    public MainActivityScreen scrollOnRecyclerView() {
        scrollListToPosition(R.id.contact_recycleView, 5);
        return this;
    }

    public MainActivityScreen verifyRecycleViewItem() {
        assertCustomAssertionAtPosition(R.id.contact_recycleView, 7, R.id.name_contact, matches(withText("Smart Caiwei")));
        assertCustomAssertionAtPosition(R.id.contact_recycleView, 7, R.id.img_view, matches(RecyclerViewMatchers.hasDrawable()));
        return this;
    }

}
