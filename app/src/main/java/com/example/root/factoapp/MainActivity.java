package com.example.root.factoapp;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText t1;
TextView t2;
Button b1;
long fact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        b1=findViewById(R.id.b1);



        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String s=t1.getText().toString().trim();

                if(s.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Enter number first", Toast.LENGTH_SHORT).show();
                    t2.setText("");
                }

                else if(Long.parseLong(s)>=26)
                {
                    Toast.makeText(MainActivity.this, "Numbermust not greater than 25", Toast.LENGTH_SHORT).show();
                    t2.setText("");
                }

                else
                {
                    t2.setText("");
                    long num=Long.parseLong(t1.getText().toString().trim());
                    long i;
                    fact=1L;
                    for(i=1L;i<=num;i=i+1L) {
                       System.out.println(fact);
                        fact = fact * i;
                    }
                    t2.setText(fact+"");

                    Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Dialog title here!!");
                    builder.setCancelable(true);
                    builder.setMessage(fact+"");
                    builder.show();
                }
            }
        });

    }
}
