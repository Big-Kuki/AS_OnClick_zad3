package com.example.as_onclick_zad3;



import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    private TextView tvCounter;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCounter = findViewById(R.id.tvCounter);

        findViewById(R.id.btnPlus).setOnClickListener(this);
        findViewById(R.id.btnMinus).setOnClickListener(this);
        findViewById(R.id.btnReset).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnPlus) {
            counter++;
            updateCounter();

        } else if (v.getId() == R.id.btnMinus) {
            if (counter == 0) {
                Toast.makeText(
                        this,
                        R.string.error_negative,
                        Toast.LENGTH_SHORT
                ).show();
                return;
            }

            counter--;
            updateCounter();

        } else if (v.getId() == R.id.btnReset) {
            counter = 0;
            updateCounter();

            Toast.makeText(
                    this,
                    R.string.reset_message,
                    Toast.LENGTH_SHORT
            ).show();
        }
    }

    private void updateCounter() {
        tvCounter.setText(String.valueOf(counter));
    }
}
