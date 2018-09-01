
package com.example.my.employee_attandense;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText edtmobile,edtpass;
    Button btnLogin,btnlogin1;
    TextView lblResult;
    RadioGroup Rg;
int selectedId;

RadioButton rdamdin,rdemp;
String r,s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtmobile=(EditText)findViewById(R.id.edtmobile);
        edtpass=(EditText)findViewById(R.id.edtpass);
        lblResult=(TextView)findViewById(R.id.result);
Rg=(RadioGroup)findViewById(R.id.radioGroup);
rdamdin=(RadioButton)findViewById(R.id.adminrd);
        rdemp=(RadioButton)findViewById(R.id.emprd);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        btnlogin1=(Button)findViewById(R.id.btnlogin1);
        btnLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

r=edtmobile.getText().toString();

                s=edtpass.getText().toString();



                if(Rg.getCheckedRadioButtonId() == -1){



                }
                if(r.equals("1234567890")&& s.equals("admin123")&& rdamdin.isChecked()){


                    Intent intent = new Intent(Login.this, Admin.class);
                    startActivity(intent);
                    Toast.makeText(getApplicationContext(), " login successful",
                            Toast.LENGTH_LONG).show();
                      return;

                }


                if(r.equals("0123456789")&& s.equals("123admin")&& rdemp.isChecked()){


                    Intent intent = new Intent(Login.this,Employee1.class);
                    startActivity(intent);

                    Toast.makeText(getApplicationContext(), " login successful",
                            Toast.LENGTH_LONG).show();
                    return;


                }

                         else
                             {Toast.makeText(getApplicationContext(), "Plesae check the number/ passward",
                        Toast.LENGTH_LONG).show();

                }
                if (edtmobile.getText().toString().trim().length() == 0) {
                    edtmobile.setError("Mobile no. is not entered");
                    edtmobile.requestFocus();
                    return;
                } else {
                    String pass = edtmobile.getText().toString();
                    if (TextUtils.isEmpty(pass) || edtmobile.length() > 10) {
                        edtmobile.setError("Number must be of 10 characters");
                        edtmobile.requestFocus();
                        return;
                    } else {
                        if (edtpass.getText().toString().trim().length() == 0) {
                            edtpass.setError("Password is not entered");
                            edtpass.requestFocus();
                            return;
                        }
                        else
                        {
                        }
                    }}



            }
                                });





}

public void register(View v){
        Intent i=new Intent(Login.this,Register.class);
        startActivity(i);
}

}