package sample.jchankchan.kotlinapp

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import sample.jchankchan.lib.FooBar

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @JvmField
    @Rule
    var rule: ActivityTestRule<MainActivity> = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun test_methodFromKotlinEspresso() {
        assertEquals(FooBar().methodFromKotlinEspresso(), rule.activity.methodFromKotlinEspresso())
    }
}