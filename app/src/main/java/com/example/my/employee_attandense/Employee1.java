package com.example.my.employee_attandense;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;





public class Employee1 extends AppCompatActivity {
    Button buttonAlert;

    Button btnbtn, btnbutton;
    boolean iscolor = true;

    /**
     * Called when the activity is first created.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.empolyee);
        btnbtn = (Button) findViewById(R.id.btn);
        btnbutton = (Button) findViewById(R.id.btn2);


        final Button btn = (Button) findViewById(R.id.btn);
        final Button button = (Button) findViewById(R.id.btn2);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                if (iscolor) {
                    btn.setBackgroundColor(Color.GREEN);
                    button.setEnabled(false);

                }

            }
        });

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                if (iscolor) {
                    button.setBackgroundColor(Color.RED);
                    btn.setEnabled(false);


                    buttonAlert = (Button) findViewById(R.id.bell);

                    buttonAlert.setOnClickListener(new OnClickListener() {
                        public void onClick(View v) {
                            final AlertDialog alertDialog = new AlertDialog.Builder(Employee1.this).create();
                            alertDialog.setTitle("Give Reason");
                            alertDialog.setMessage("Why are you absent");
                            final EditText input = new EditText(Employee1.this);
                            LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                                    LinearLayout.LayoutParams.MATCH_PARENT,
                                    LinearLayout.LayoutParams.MATCH_PARENT
                            );
                            input.setLayoutParams(lp);
                            alertDialog.setView(input);
                            alertDialog.setIcon(R.drawable.ic_hearing_black_24dp);
                            alertDialog.setButton("send", new DialogInterface.OnClickListener() {

                                public void onClick(DialogInterface dialog, int ab) {
                                    // TODO Auto-generated method stub

                                    Toast.makeText(getApplicationContext(), "sent", Toast.LENGTH_LONG).show();
                                }
                            });
                            alertDialog.show();
                        }
                    });
                }
            }
        });
    }
}
