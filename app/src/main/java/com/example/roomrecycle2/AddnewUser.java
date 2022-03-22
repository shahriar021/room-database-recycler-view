package com.example.roomrecycle2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.roomrecycle2.db.AppDatabase;
import com.example.roomrecycle2.db.User;

public class AddnewUser extends AppCompatActivity {
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnew_user);

        EditText e1 = findViewById(R.id.boid);
        EditText e2 = findViewById(R.id.stckname);
        EditText e3 = findViewById(R.id.quantity);
        EditText e4 = findViewById(R.id.buyingp);
        EditText e5 = findViewById(R.id.sellingp);
        EditText e6 = findViewById(R.id.profitloss);

        Button save = findViewById(R.id.btn);
        int i=0;
        t1=findViewById(R.id.header);
        t1.setText("i");
        i++;

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                saveNewUser(e1.getText().toString(),e2.getText().toString(),e3.getText().toString(),e4.getText().toString(),e5.getText().toString(),e6.getText().toString());

            }
        });
    }

    private void saveNewUser(String bo,String stcnam,String quant,String buyin,String sellp,String proftisl){
        AppDatabase db = AppDatabase.getDbInstance(this.getApplicationContext());

        User user=new User();
        user.boId=bo;
        user.stockName=stcnam;
        user.quantity=quant;
        user.buyingPrice=buyin;
        user.sellingPrice=sellp;
        user.profitLoss=proftisl;
        db.userDao().insertUser(user);


        finish();
    }
}