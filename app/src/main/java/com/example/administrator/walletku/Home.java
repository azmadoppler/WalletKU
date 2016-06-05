package com.example.administrator.walletku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.administrator.walletku.Models.Goal;
import com.example.administrator.walletku.Models.Log;

import org.w3c.dom.Text;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
    }

    public void init()
    {
        EditText value = (EditText) findViewById(R.id.value_edit_text);


        TextView totalMoney = (TextView) findViewById(R.id.show_money_field);
        TextView currentGoal = (TextView) findViewById(R.id.show_goal_money_field);
        TextView neededMoney = (TextView) findViewById(R.id.show_to_goal);

        Log.getInstance().calculateTotal();
        totalMoney.setText(Log.getInstance().getTotal() + "");

        if(Goal.getInstance().getValue() == 0) {
            currentGoal.setText("Not Set");
            neededMoney.setText("0");
        }
        else
        {
            currentGoal.setText(Goal.getInstance().getValue() + "");
            neededMoney.setText(Goal.getInstance().calculateLeft() + "");

        }



        Button toMain = (Button) findViewById(R.id.to_main_button);
        toMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, Menu.class);
                startActivity(intent);
            }
        });
    }


}
