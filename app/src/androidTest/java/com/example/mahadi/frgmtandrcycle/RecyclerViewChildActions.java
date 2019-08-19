package com.example.mahadi.frgmtandrcycle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.hamcrest.Matcher;

import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;

public class RecyclerViewChildActions {

    public static ViewAction actionOnChild(final ViewAction action, final int id) {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return null;
            }

            @Override
            public String getDescription() {
                return "actions on a child view with specified id.";
            }

            @Override
            public void perform(UiController uiController, View view) {
                View v = view.findViewById(id);
                action.perform(uiController, v);
            }
        };
    }

}
