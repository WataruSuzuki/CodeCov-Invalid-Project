package sample.jchankchan.myapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import sample.jchankchan.lib.Fuga;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static String methodForJunit() {
        return Fuga.methodForJunit();
    }

    public String methodForEspresso() {
        return new Fuga().methodForEspresso();
    }
}