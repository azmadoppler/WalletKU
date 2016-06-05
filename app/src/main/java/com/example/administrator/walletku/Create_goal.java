package com.example.administrator.walletku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.administrator.walletku.Models.Goal;

public class Create_goal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_goal);
        init();
    }

    private EditText goalValue;
    private EditText goalDead;
    private EditText goalDesc;
    public void init()
    {
        goalValue = (EditText)findViewById(R.id.goal_value);
        goalDead = (EditText)findViewById(R.id.goal_deadline);
        goalDesc = (EditText) findViewById(R.id.goal_desc);

        Button saveGoal = (Button) findViewById(R.id.save_button);
        Button backButton = (Button) findViewById(R.id.back_button);

        saveGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Goal goal = Goal.getInstance();
                goal.setDesc(goalDesc.getText().toString());
                goal.setDate(goalDead.getText().toString());
                goal.setValue(Integer.parseInt(goalValue.getText().toString()));
                Intent intent = new Intent(Create_goal.this , Menu.class);
                startActivity(intent);
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Create_goal.this , Show_goal.class);
                startActivity(intent);
            }
        });




    }
}
