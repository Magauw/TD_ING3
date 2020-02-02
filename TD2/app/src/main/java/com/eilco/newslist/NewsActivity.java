package com.eilco.newslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        Button buttonLogout = findViewById(R.id.buttonLogout);
        buttonLogout.setOnClickListener(this);

        Button buttonDetails = findViewById(R.id.buttonDetails);
        buttonDetails.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()){
            case R.id.buttonLogout :
                intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                onBackPressed();
                break;
            case R.id.buttonDetails :
                intent = new Intent(this, DetailsActivity.class);
                startActivity(intent);
                break;


        }
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
