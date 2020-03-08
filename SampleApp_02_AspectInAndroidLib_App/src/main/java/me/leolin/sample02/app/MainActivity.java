package me.leolin.sample02.app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import me.leolin.sample02.lib.MyService;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyService myService = new MyService();

        TextView textView = findViewById(R.id.textView);
        textView.setText(myService.getHelloString());
    }

}