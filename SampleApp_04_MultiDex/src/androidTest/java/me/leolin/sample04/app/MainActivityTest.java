package me.leolin.sample04.app;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.LargeTest;

import androidx.test.espresso.matcher.ViewMatchers;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * @author leolin
 */
@LargeTest
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    public void testTextViewAdviced() throws Exception {
        onView(ViewMatchers.withId(R.id.textView))
                .check(matches(isDisplayed()))
                .check(matches(withText("Hello AspectJ!")));
    }
}