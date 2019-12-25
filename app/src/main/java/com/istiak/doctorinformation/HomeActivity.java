package com.istiak.doctorinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button doc1,doc2,doc3,doc4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        doc1 = findViewById(R.id.btn_doc_shahidullah);
        doc2 = findViewById(R.id.william);
        doc3 = findViewById(R.id.myles);
        doc4 = findViewById(R.id.fouad);


        doc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id","doc1");
                startActivity(intent);
            }
        });




        doc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id","doc2");
                startActivity(intent);
            }
        });


        doc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id","doc3");
                startActivity(intent);
            }
        });


        doc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("id","doc4");
                startActivity(intent);
            }
        });

    }
}
