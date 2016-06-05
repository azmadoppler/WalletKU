package com.example.administrator.walletku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.administrator.walletku.Models.Goal;
import com.example.administrator.walletku.Models.Log;

public class Delete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        init();
    }

    public void init()
    {
        Button deleteAll = (Button) findViewById(R.id.delete_all);
        Button deleteLast = (Button) findViewById(R.id.delete_last);
        Button deleteGoal = (Button) findViewById(R.id.delete_goal);
        Button back = (Button) findViewById(R.id.back);

        deleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log log = Log.getInstance();
                log.getEntries().clear();
            }
        });

        deleteGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Goal.getInstance().clear();
            }
        });

        deleteLast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.getInstance().getEntries().remove(Log.getInstance().getEntries().size()-1);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Delete.this , Menu.class);
                startActivity(intent);
            }
        });




    }
}
