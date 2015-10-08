package com.example.piotr.citest;

import android.test.AndroidTestCase;

/**
 * Created by piotr on 08/10/15.
 */
public class SampleTest extends AndroidTestCase {

    public void testFail() {
        assertEquals(false, true);
    }

    public void testSuccess() {
        assertEquals(true, true);
    }
}
