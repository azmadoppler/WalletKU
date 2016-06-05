package com.example.administrator.walletku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.administrator.walletku.Models.Goal;

import org.w3c.dom.Text;

public class Show_goal extends AppCompatActivity {

    private TextView goalValue;
    private TextView deadline;
    private TextView amount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_goal);
        init();
    }
    public void init()
    {
        goalValue = (TextView) findViewById(R.id.current_goal_value);
        deadline = (TextView) findViewById(R.id.deadline_value);
        amount = (TextView) findViewById(R.id.amount_value);
        TextView goalDesc = (TextView) findViewById(R.id.goal_desc);

        Button back = (Button) findViewById(R.id.back_button);
        Button setGoal = (Button) findViewById(R.id.create_goal_button);

        Goal goal = Goal.getInstance();
        goalValue.setText(goal.getValue()+"");
        deadline.setText(goal.getDate());
        amount.setText(goal.calculateLeft()+"");
        goalDesc.setText(goal.getDesc());

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Show_goal.this , Menu.class);
                startActivity(intent);
            }
        });

        setGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Show_goal.this , Create_goal.class);
                startActivity(intent);
            }
        });

    }
}
