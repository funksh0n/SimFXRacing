package com.simfxracing.simfxracing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String LEAGUE_NAME = "main_activity_league_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText txtLeagueName = findViewById(R.id.txtLeagueName);
        TextView txtLeagues = findViewById(R.id.txtLeagues);
        String leagueName = txtLeagueName.getText().toString();
        txtLeagues.setText(leagueName);
        intent.putExtra(LEAGUE_NAME, leagueName);
        startActivity(intent);
    }
}
