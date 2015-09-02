package br.com.androidpro.robolectric;

import android.app.Activity;
import android.app.Application;
import android.test.ApplicationTestCase;
import android.widget.Button;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class MainActivityTest {

    @Test
    public void clickOnButton() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);

        Button button = (Button) activity.findViewById(R.id.button);
        button.performClick();
        button.performClick();

        assertEquals("Clicado 2 vezes!",button.getText());
    }
}