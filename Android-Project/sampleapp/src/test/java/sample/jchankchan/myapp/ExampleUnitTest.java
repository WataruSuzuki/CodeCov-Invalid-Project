package sample.jchankchan.myapp;

import org.junit.Test;

import sample.jchankchan.lib.Fuga;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void test_methodForJunit() {
        assertEquals(MainActivity.methodForJunit(), Fuga.methodForJunit());
    }
}