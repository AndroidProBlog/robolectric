package br.com.androidpro.robolectric;

import android.test.ActivityInstrumentationTestCase2;
import android.test.UiThreadTest;
import android.widget.Button;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    private MainActivity mainActivity;
    private Button button;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        mainActivity = getActivity();
        button = (Button) mainActivity.findViewById(R.id.button);
    }

    public void testPreconditions() {
        assertNotNull("mainActivity is null", mainActivity);
        assertNotNull("button is null",button);
    }

    @UiThreadTest
    public void testButtonClick() {
        button.performClick();
        button.performClick();

        assertEquals("Clicado 2 vezes!",button.getText());
    }
}