package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textview);
        editText = findViewById(R.id.editText);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getInput = editText.getText().toString();

                double kilos = Double.parseDouble(getInput);

                double pounds = makeConversion(kilos);

                textView.setText("" + pounds);
            }
        });
    }
    public double makeConversion(double kilos){
        // 1 kilo = 2.2462 pounds

        return kilos * 2.20462;
    }
}
