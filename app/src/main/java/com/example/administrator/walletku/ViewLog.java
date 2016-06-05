package com.example.administrator.walletku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import com.example.administrator.walletku.Adapter.EntryAdapter;
import com.example.administrator.walletku.Models.Entry;
import com.example.administrator.walletku.Models.Log;

import java.util.ArrayList;
import java.util.List;

public class ViewLog extends AppCompatActivity {
    private GridView listGridView;
    private EntryAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_log);
        init();
    }
    public void init()
    {
        List<Entry> list = Log.getInstance().getEntries();
        adapter = new EntryAdapter(this ,R.layout.grid_log , list);
        listGridView = (GridView) findViewById(R.id.entry_list);
        listGridView.setAdapter(adapter);

        Button button = (Button) findViewById(R.id.back_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ViewLog.this , Menu.class);
                startActivity(intent);
            }
        });
    }
}
