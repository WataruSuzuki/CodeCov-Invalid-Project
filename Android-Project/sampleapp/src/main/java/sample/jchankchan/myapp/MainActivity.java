package sample.jchankchan.myapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.AppCompatActivity;

import sample.jchankchan.lib.Fuga;

public class MainActivity extends AppCompatActivity {

    @VisibleForTesting
    Fuga fuga = new Fuga();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        System.out.println(methodForJunit());
        System.out.println(methodForEspresso());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView junit = findViewById(R.id.text_for_junit);
        junit.setText(methodForJunit());

        TextView espresso = findViewById(R.id.text_for_espresso);
        espresso.setText(methodForEspresso());
    }

    public static String methodForJunit() {
        return Fuga.methodForJunit();
    }

    public String methodForEspresso() {
        return fuga.methodForEspresso();
    }
}