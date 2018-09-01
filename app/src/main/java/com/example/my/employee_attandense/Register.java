package com.example.my.employee_attandense;





import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    Button nxt;
    EditText first, last, email, mobileno, edtpass,edtpass1,edtname,edtaddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);


        nxt=(Button)findViewById(R.id.nxt);
        email=(EditText)findViewById(R.id.email);
        mobileno=(EditText)findViewById(R.id.mobile);
        edtpass=(EditText)findViewById(R.id.password);
        edtpass1=(EditText)findViewById(R.id.confirm);
        edtname=(EditText)findViewById(R.id.edtname);
        edtaddress=(EditText)findViewById(R.id.edtaddress);



        nxt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                if (email.getText().toString().trim().length() == 0) {
                            email.setError("E-mail is not entered");
                            email.requestFocus();
                        } else {
                            String reg = email.getText().toString().trim();
                            if (!reg.matches("[a-zA-Z0-9._-]+@[a-z]+.[a-z]+")) {
                                email.setError("Invalid Email");
                                email.requestFocus();
                            } else {
                                if (mobileno.getText().toString().trim().length() == 0) {
                                    mobileno.setError("Mobile no. is not entered");
                                    mobileno.requestFocus();
                                } else {
                                    String pass = mobileno.getText().toString();
                                    if (TextUtils.isEmpty(pass) || mobileno.length() < 10) {
                                        mobileno.setError("Number must be of 10 characters");
                                        mobileno.requestFocus();
                                    }

                                    if (!edtpass.getText().toString().equals(edtpass1.getText().toString())) {
                                        edtpass.setError("Password does not match");
                                        edtpass.requestFocus();
                                    }

                                    else{
                                            if (edtname.getText().toString().trim().length() == 0) {
                                                edtname.setError("Company name is not entered");
                                                edtname.requestFocus();
                                            } else {
                                                if (edtaddress.getText().toString().trim().length() == 0) {
                                                    edtaddress.setError("Company address is not entered");
                                                    edtaddress.requestFocus();
                                                } else {


                                                Intent intent = new Intent(Register.this, Login.class);
                                                startActivity(intent);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }


        });
    }
    public void login(View v){
        Intent i=new Intent(Register.this,Login.class);
        startActivity(i);
    }
}

