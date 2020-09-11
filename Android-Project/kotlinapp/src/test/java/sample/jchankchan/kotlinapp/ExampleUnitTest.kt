package sample.jchankchan.kotlinapp

import org.junit.Assert
import org.junit.Test
import sample.jchankchan.kotlinapp.MainActivity.Companion.methodFromKotlinJunit
import sample.jchankchan.lib.FooBar

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun test_methodForJunit() {
        Assert.assertEquals(methodFromKotlinJunit(), FooBar.methodFromKotlinJunit())
    }
}