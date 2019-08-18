package com.example.mahadi.frgmtandrcycle;

import android.Manifest;

import com.schibsted.spain.barista.interaction.PermissionGranter;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.RuleChain;
import org.junit.rules.TestName;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;

import java.io.IOException;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.rule.GrantPermissionRule;
import androidx.test.uiautomator.UiDevice;

@RunWith(AndroidJUnit4.class)
public class BaseTest {


    protected ActivityTestRule mainActivityRule =
            new ActivityTestRule(MainActivity.class, true, false);

    protected TestName nameRule = new TestName();

    @Rule
    public RuleChain baseRules = RuleChain.outerRule(
//            GrantPermissionRule.grant(
//            Manifest.permission.WRITE_EXTERNAL_STORAGE,
//            Manifest.permission.READ_EXTERNAL_STORAGE,
//            Manifest.permission.CAMERA)
            nameRule);

    @Before
    public void setUp() {
        PermissionGranter.allowPermissionsIfNeeded(Manifest.permission.GET_ACCOUNTS);
        // System animation properties.
        UiDevice uiDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        try {
            uiDevice.executeShellCommand("settings put global animator_duration_scale 0.0");
            uiDevice.executeShellCommand("settings put global transition_animation_scale 0.0");
            uiDevice.executeShellCommand("settings put global window_animation_scale 0.0");

            // Touch & hold delay property.
            uiDevice.executeShellCommand("settings put secure long_press_timeout 1500");

            // Virtual keyboard appearance property.
            uiDevice.executeShellCommand("settings put secure show_ime_with_hard_keyboard 0");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @After
    public void finish() {

    }
}
