package com.example.my.employee_attandense;



import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class Empolyeelist extends Activity {

    ListView simpleList;
    String countryList[] = {"APARNA", "ARCHITA", "RUCHI", "SAKSHI", "BHAVAN", "MAHIP"};
    int flags[] = {R.drawable.ic_person, R.drawable.ic_person, R.drawable.ic_person, R.drawable.ic_person, R.drawable.ic_person, R.drawable.ic_person};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listemployee);
        simpleList = (ListView) findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), countryList, flags);
        simpleList.setAdapter(customAdapter);
    }
}
