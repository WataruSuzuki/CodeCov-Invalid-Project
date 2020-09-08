package sample.jchankchan.kotlinapp

import android.os.Bundle
import androidx.annotation.VisibleForTesting
import androidx.appcompat.app.AppCompatActivity
import sample.jchankchan.lib.FooBar

class MainActivity : AppCompatActivity() {

    @VisibleForTesting
    var fooBar = FooBar()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun methodFromKotlinEspresso(): String? {
        return fooBar.methodFromKotlinEspresso()
    }

    companion object {
        fun methodFromKotlinJunit(): String? {
            return FooBar.methodFromKotlinJunit()
        }
    }
}