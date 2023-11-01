package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    EditText n1,n2;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Good Morning", Toast.LENGTH_SHORT).show();
        text=findViewById(R.id.text);
        n1=findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
       button1 = findViewById(R.id.button1);
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int sum= Integer.parseInt( n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
               text.setText("The sum is: "+ sum);
           }
       });

    }
}