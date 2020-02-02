package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private EditText etGauche;

    private List<Integer> nombres;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);
        etGauche = (EditText) findViewById(R.id.NumberAdd1);
    }


    public void computeAddChiffre1(View v) {

        String reponse = " ";
        if (!etGauche.getText().toString().isEmpty()) {
            nombres.add(Integer.parseInt(etGauche.getText().toString())) ;
            etGauche.setText(reponse);
        } else if (etGauche.getText().toString().isEmpty()) {
            reponse = "Le champs est vide. ";
        }
    }

    public void computeAdd(View v){
        String reponse = " ";
        Integer nb2 ;
        if (!etGauche.getText().toString().isEmpty()) {
            nb2 = Integer.parseInt(etGauche.getText().toString());

        } else if (etGauche.getText().toString().isEmpty()) {
            reponse = "Le champs est vide. ";
        }

        etGauche.setText(reponse);
    }

    public void computeSous(View v){
        Integer solution;
        String reponse = " ";
        if (!etGauche.getText().toString().isEmpty() && !etDroit.getText().toString().isEmpty()) {
            Integer etgauche = Integer.parseInt(etGauche.getText().toString());
            Integer etdroit = Integer.parseInt(etDroit.getText().toString());
            solution = etgauche - etdroit;
            reponse = solution.toString();
        } else if (etGauche.getText().toString().isEmpty()) {
            reponse = "Le champs 1 est vide. ";
        } else if (etDroit.getText().toString().isEmpty()) {
            reponse = "Le champs 2 est vide.";
        }
    }

    public void computeMult(View v){
        Integer solution;
        String reponse = " ";
        if (!etGauche.getText().toString().isEmpty() && !etDroit.getText().toString().isEmpty()) {
            Integer etgauche = Integer.parseInt(etGauche.getText().toString());
            Integer etdroit = Integer.parseInt(etDroit.getText().toString());
            solution = etgauche * etdroit;
            reponse = solution.toString();
        } else if (etGauche.getText().toString().isEmpty()) {
            reponse = "Le champs 1 est vide. ";
        } else if (etDroit.getText().toString().isEmpty()) {
            reponse = "Le champs 2 est vide.";
        }
    }

    public void computeDiv(View v){
        Integer solution;
        String reponse = " ";
        if (!etGauche.getText().toString().isEmpty() && !etDroit.getText().toString().isEmpty()) {
            Integer etgauche = Integer.parseInt(etGauche.getText().toString());
            Integer etdroit = Integer.parseInt(etDroit.getText().toString());
            solution = etgauche / etdroit;
            reponse = solution.toString();
        } else if (etGauche.getText().toString().isEmpty()) {
            reponse = "Le champs 1 est vide. ";
        } else if (etDroit.getText().toString().isEmpty()) {
            reponse = "Le champs 2 est vide.";
        } else if(etDroit){

        }
    }
}