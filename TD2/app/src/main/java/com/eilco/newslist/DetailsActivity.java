package com.eilco.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Button buttonOk = findViewById(R.id.buttonOk);
        buttonOk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.buttonOk :
                intent = new Intent(this, NewsActivity.class);
                startActivity(intent);
                finish();
                break  ;
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent;
        intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }
}
