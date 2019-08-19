package com.example.mahadi.frgmtandrcycle;


import android.content.Intent;

import com.example.mahadi.frgmtandrcycle.Screens.MainActivityScreen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import androidx.test.espresso.ViewAction;
import androidx.test.espresso.contrib.RecyclerViewActions;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.assertEquals;

public class FragmentTest extends BaseTest {

    MainActivityScreen mainActivityScreen;

    @Before
    public void setUp() {
        super.setUp();
        mainActivityScreen = new MainActivityScreen(mainActivityRule, new Intent());
    }

    @After
    public void finish() {
        super.finish();
        mainActivityScreen.finish();
    }

    @Test
    public void testFragmentContact() {
        assertEquals(nameRule.getMethodName(), "testFragmentContact");
        mainActivityScreen.goToContactFragment()
                .scrollOnRecyclerView()
                .verifyRecycleViewItem();
    }

    @Test
    public void testRecyclerViewActions() {
        // no child
//        onView(withId(R.id.contact_recycleView))
//                .perform(RecyclerViewActions.actionOnItemAtPosition(3, click()));

        // action on child
//        ViewAction childClick = RecyclerViewChildActions.actionOnChild(click(), R.id.img);
//        onView(withId(R.id.contact_recycleView)).perform(
//                RecyclerViewActions.<RecycleViewAdapter.MyViewHolder>actionOnItemAtPosition(5, childClick));
    }
}
