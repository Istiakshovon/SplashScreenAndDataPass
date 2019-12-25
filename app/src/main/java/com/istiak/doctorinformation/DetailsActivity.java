package com.istiak.doctorinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    ImageView imgDoc;
    TextView txtName,txtFee,txtAddress;
    Button btnContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        imgDoc = findViewById(R.id.imgDoc);
        txtName = findViewById(R.id.txt_name);
        txtAddress = findViewById(R.id.txt_address);
        txtFee = findViewById(R.id.txt_fee);
        btnContact = findViewById(R.id.btn_contact);

        String getId =getIntent().getExtras().getString("id");



        if (getId.equals("doc1")){
            imgDoc.setImageResource(R.drawable.shahidullah);
            txtName.setText("Prof. dr. Muhammad Shahidullah");
            txtFee.setText("Fee : 1000৳");
            txtAddress.setText("Dhakkin khattali, Chittagong, Bangladesh");
            btnContact.setText("Contact : 01877163753");
            btnContact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + "01877163753"));
                    startActivity(intent);
                }
            });
        }





        if (getId.equals("doc2")){
            imgDoc.setImageResource(R.drawable.william);
            txtName.setText("Dr. William");
            txtFee.setText("Fee : 1500৳");
            txtAddress.setText("Saraipara, Pahartali, Chittagong");
            btnContact.setText("Contact : 01529483725");
            btnContact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + "01529483725"));
                    startActivity(intent);
                }
            });
        }







        if (getId.equals("doc3")){
            imgDoc.setImageResource(R.drawable.myles);
            txtName.setText("Dr.Myles.B.Abbott");
            txtFee.setText("Fee : 1200৳");
            txtAddress.setText("Mirpur, Dhaka");
            btnContact.setText("Contact : 01672648398");
            btnContact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + "01672648398"));
                    startActivity(intent);
                }
            });
        }









        if (getId.equals("doc4")){
            imgDoc.setImageResource(R.drawable.fouad);
            txtName.setText("Dr. Fouad. M. Abbass");
            txtFee.setText("Fee : 800৳");
            txtAddress.setText("Fulgazi,Feni");
            btnContact.setText("Contact : 01747562373");
            btnContact.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(Intent.ACTION_DIAL);
                    intent.setData(Uri.parse("tel:" + "01747562373"));
                    startActivity(intent);
                }
            });
        }
    }
}
