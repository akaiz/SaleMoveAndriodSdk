package com.salemove.salemoveandriodlibdemo;

import com.salemove.salemoveandriodsync.Main;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void helloWord_isCorrect() {
        Main main = new Main();
        assertEquals("Hello World", main.HelloWorldString());
    }
    @Test
    public void gets_randomString() {
        Main main = new Main();
        assertNotNull(main.RandomString());
    }
}