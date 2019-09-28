package com.example.alton.eselab4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t,t2;
    EditText e;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=(TextView) findViewById(R.id.textView);
        t2=(TextView) findViewById(R.id.textView2);
        e=(EditText) findViewById(R.id.editText);
        b=(Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amt_text=e.getText().toString();
                double amt=Double.parseDouble(amt_text);
                double us_amt=amt*0.014;
                double uae_amt=amt*0.052;
                t.setText(""+us_amt);
                t2.setText(""+uae_amt);
            }
        });

    }
}
