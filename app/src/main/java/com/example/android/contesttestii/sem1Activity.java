package com.example.android.contesttestii;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class sem1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sem1);
        Toast.makeText(this, "Choose subject", Toast.LENGTH_SHORT).show();

        Button syll, sub1, sub2, sub3, sub4, sub5, sub6;

        syll = (Button) this.findViewById(R.id.syll);
        sub1 = (Button) this.findViewById(R.id.sub1);
        sub2 = (Button) this.findViewById(R.id.sub2);
        sub3 = (Button) this.findViewById(R.id.sub3);
        sub4 = (Button) this.findViewById(R.id.sub4);
        sub5 = (Button) this.findViewById(R.id.sub5);
        sub6 = (Button) this.findViewById(R.id.sub6);

        syll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sem1Activity.this, contentActivity.class);
                i.putExtra("file", "s1s2.pdf");
                startActivity(i);
            }
        });

        sub1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sem1Activity.this, contentActivity.class);
                i.putExtra("file", "1.pdf");
                startActivity(i);
            }
        });
        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sem1Activity.this, contentActivity.class);
                i.putExtra("file", "2.pdf");
                startActivity(i);
            }
        });
        sub3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sem1Activity.this, contentActivity.class);
                i.putExtra("file", "3.pdf");
                startActivity(i);
            }
        });
        sub4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sem1Activity.this, contentActivity.class);
                i.putExtra("file", "4.pdf");
                startActivity(i);
            }
        });
        sub5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sem1Activity.this, contentActivity.class);
                i.putExtra("file", "5.pdf");
                startActivity(i);
            }
        });
        sub6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(sem1Activity.this, contentActivity.class);
                i.putExtra("file", "6.pdf");
                startActivity(i);
            }
        });


    }
}
