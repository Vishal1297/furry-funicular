package com.vishal.webviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText seachBarEditText;
    private Button searchBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchBtn = findViewById(R.id.searchBtn);

        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seachBarEditText = findViewById(R.id.searchBar);

                Intent intent = new Intent(MainActivity.this, WebView_Activity.class);
                intent.putExtra("websiteName",seachBarEditText.getText().toString());
                startActivity(intent);
            }
        });
    }
}
