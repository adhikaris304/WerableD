package com.example.werabled;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends WearableActivity {

    private TextView tvOutput;
    private Button btnShow;
    private EditText etFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow=findViewById(R.id.btnShow);
        tvOutput=findViewById(R.id.tvOutput);
        etFirst=findViewById(R.id.etfirst);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText(etFirst.getText().toString());
            }
        });



        // Enables Always-on
        setAmbientEnabled();
    }
}
