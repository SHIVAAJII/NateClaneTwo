package com.example.ndemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

public class RefineScreen extends AppCompatActivity {

    SeekBar seek_bar;
    TextView tv_id;

    androidx.appcompat.widget.Toolbar toolbar_refine;



//    Spinner spinner;
//
//    String[] resourceNamae={""," "
//            ,"",""};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine_screen);


        toolbar_refine= (androidx.appcompat.widget.Toolbar) findViewById(R.id.refine_toolbarId);
        setSupportActionBar(toolbar_refine);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);





//        spinner=(Spinner) findViewById(R.id.spinnerId);
//
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//
//
//        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, R.layout.test_code,resourceNamae);
//        spinner.setAdapter(arrayAdapter);









        seek_bar=(SeekBar) findViewById(R.id.seek_bar);
        tv_id=(TextView) findViewById(R.id.tv_id);


        seek_bar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            int progress_value=0;

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                progress_value=progress;

                tv_id.setText(progress_value+"");

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                // tv_id.setText(progress_value+"");
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {


                // tv_id.setText(progress_value+"");


            }
        });



    }

}