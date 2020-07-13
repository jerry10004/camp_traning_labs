package com.example.a2_hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
        count = Integer.parseInt(tv.getText().toString());
    }

    public void onToast(View view) {
        Toast.makeText(this, "Hello Toast!", Toast.LENGTH_LONG).show();
    }

    public void onCount(View view) {
        count++;
        tv.setText(count+ "");
    }
}