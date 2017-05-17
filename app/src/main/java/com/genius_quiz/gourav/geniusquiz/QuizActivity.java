package com.genius_quiz.gourav.geniusquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {
    //private RadioButton rbOptionA, rbOptionB, rbOptionC, rbOptiond;
    // private String checkGender;
    private ArrayList<DataModel> dataModels;
    public RecyclerView recyclerView;
    public DataModel dataModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_question);
        init();
        dataModels.add(dataModel);
        dataModels.add(dataModel);
        dataModels.add(dataModel);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(QuizActivity.this, dataModels);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(QuizActivity.this));
        recyclerView.setHasFixedSize(true);
        // init();
        //optionSelect();
    }
/*
    public boolean onRadioButtonClicked(final View view) {
        boolean flag = ((RadioButton) view).isChecked();
        return flag;
    }
    */

    /**
     * option select in radio group
     */
    /*
    private void optionSelect() {
        if (onRadioButtonClicked(rbOptionA)) {
            checkGender = rbOptionA.getText().toString();
        } else if (onRadioButtonClicked(rbOptionB)) {
            checkGender = rbOptionB.getText().toString();
        } else if (onRadioButtonClicked(rbOptionC)) {
            checkGender = rbOptionC.getText().toString();
        } else if (onRadioButtonClicked(rbOptiond)) {
            checkGender = rbOptiond.getText().toString();
        }
    }
    */

    /**
     * initilization
     */
    /*
    private void init() {
        rbOptionA = (RadioButton) findViewById(R.id.radio_option_a);
        rbOptionB = (RadioButton) findViewById(R.id.radio_option_b);
        rbOptionC = (RadioButton) findViewById(R.id.radio_option_c);
        rbOptiond = (RadioButton) findViewById(R.id.radio_option_d);
        checkGender = "";
    }
    */
    private void init() {
        recyclerView = (RecyclerView) findViewById(R.id.rvHome);
        dataModels = new ArrayList<>();
        dataModel = new DataModel("1. The speed of 60m per sec is the same as:", "40.3 km/h", "57.16 km/h", "51.16 km/h", "none of these");
    }

}
