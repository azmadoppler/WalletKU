package com.example.administrator.walletku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        init();
    }

    public void init()
    {
        Button toGoal = (Button) findViewById(R.id.set_goal_button);
        toGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Show_goal.class);
                startActivity(intent);
                finish();
            }
        });

        Button toEntry = (Button) findViewById(R.id.new_entry_button);
        toEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Create_Entry.class);
                startActivity(intent);
                finish();
            }
        });


        Button toLog = (Button) findViewById(R.id.view_log_button);
        toLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, ViewLog.class);
                startActivity(intent);
                finish();
            }
        });

        Button back = (Button) findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Home.class);
                startActivity(intent);
                finish();

            }
        });

        Button delete = (Button) findViewById(R.id.to_delete);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menu.this, Delete.class);
                startActivity(intent);
            }
        });

    }

}
