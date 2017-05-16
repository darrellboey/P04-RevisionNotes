package com.myapplicationdev.android.p04_revisionnotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    Button btnInsert , btnShow;
    EditText etNote;
    RadioGroup rgStars;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShow = (Button)findViewById(R.id.buttonShowList);
        btnInsert = (Button)findViewById(R.id.buttonInsertNote);
        etNote = (EditText) findViewById(R.id.editTextNote);

        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rgStars = (RadioGroup) findViewById(R.id.radioGroupStars);
                int selectedButtonId = rgStars.getCheckedRadioButtonId();

                DBHelper db = new DBHelper(MainActivity.this);



                db.insertNote("etNote.getText().toString()", );
                db.close();

            }
        });


    }
}
