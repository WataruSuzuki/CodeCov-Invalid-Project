package sample.jchankchan.myapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public static String methodForJunit() {
        return "methodForJunit";
    }

    public String methodForEspresso() {
        return "methodForEspresso";
    }
}