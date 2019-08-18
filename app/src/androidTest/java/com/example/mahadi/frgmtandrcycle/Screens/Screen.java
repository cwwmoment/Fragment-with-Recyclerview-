package com.example.mahadi.frgmtandrcycle.Screens;

import android.app.Activity;
import android.content.Intent;

import androidx.test.rule.ActivityTestRule;

public class Screen {
    private ActivityTestRule<? extends Activity> currentRule;

    public Screen(ActivityTestRule<? extends Activity> activityRule, Intent intent) {
        currentRule = activityRule;
        activityRule.launchActivity(intent);
    }

    public void finish() {
        currentRule.finishActivity();
    }

}
