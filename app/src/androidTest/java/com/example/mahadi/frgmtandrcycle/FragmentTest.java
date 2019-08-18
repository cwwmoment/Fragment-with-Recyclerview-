package com.example.mahadi.frgmtandrcycle;


import android.content.Intent;

import com.example.mahadi.frgmtandrcycle.Screens.MainActivityScreen;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
}
