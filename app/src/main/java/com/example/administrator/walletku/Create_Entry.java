package com.example.administrator.walletku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import com.example.administrator.walletku.Models.Entry;
import com.example.administrator.walletku.Models.Log;

public class Create_Entry extends AppCompatActivity {

    private EditText desc;
    private EditText value;
    private CheckBox income;
    private CheckBox outcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create__entry);
        init();
    }
    private void init()
    {
        desc = (EditText)findViewById(R.id.desc_value);
        value = (EditText)findViewById(R.id.amount_value);
        income = (CheckBox)findViewById(R.id.income_checkbox);
        outcome = (CheckBox)findViewById(R.id.outcome_checkbox);

        Button saveEntry = (Button) findViewById(R.id.save_button);
        Button backButton = (Button) findViewById(R.id.back_button);


        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Create_Entry.this, Menu.class);
                startActivity(intent);
            }
        });

        saveEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Entry newEntry = null;
                if (income.isChecked()) {
                    newEntry = new Entry(desc.getText().toString(), Integer.parseInt(value.getText().toString()), true);
                } else if (outcome.isChecked()) {
                    newEntry = new Entry(desc.getText().toString(), Integer.parseInt(value.getText().toString()), false);
                } else
                {
                    newEntry = new Entry( desc.getText().toString() , Integer.parseInt(value.getText().toString()) , true );
                }
                Log.getInstance().addEntry(newEntry);
                Log.getInstance().calculateTotal();
                Intent intent = new Intent(Create_Entry.this, Menu.class);
                startActivity(intent);
            }
        });





    }
}
