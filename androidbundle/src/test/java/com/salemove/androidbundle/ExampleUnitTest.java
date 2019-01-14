package com.salemove.androidbundle;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void string_isHelloWorld() {
        Main main = new Main();
        assertEquals(main.helloWorld, main.HelloWorldString());
    }
    @Test
    public void string_isRandom() {
        Main main = new Main();
        assertNotNull(main.RandomString());
    }
}