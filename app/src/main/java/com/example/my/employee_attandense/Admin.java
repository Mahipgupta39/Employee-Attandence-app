package com.example.my.employee_attandense;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class Admin extends AppCompatActivity
{
    LinearLayout bt1,bt2 ,bt3,bt4,bt5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.admin);

        bt1=(LinearLayout) findViewById(R.id.bt1);
        bt2=(LinearLayout) findViewById(R.id.bt2);
        bt3=(LinearLayout) findViewById(R.id.bt3);
        bt4=(LinearLayout) findViewById(R.id.bt4);
        bt5=(LinearLayout) findViewById(R.id.bt5);
         {
            }

}
    public void ab(View ab){
        Intent i=new Intent(Admin.this,Empolyeelist.class);
        startActivity(i);
    }

    public void bc(View bc){
        Intent i=new Intent(Admin.this,Empolyeelist.class);
        startActivity(i);
    }


}
