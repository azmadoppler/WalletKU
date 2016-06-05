package com.example.administrator.walletku.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.administrator.walletku.Models.Entry;
import com.example.administrator.walletku.Models.Log;
import com.example.administrator.walletku.R;

import java.util.List;

/**
 * Created by Administrator on 5/6/2559.
 */
public class EntryAdapter extends ArrayAdapter<Entry> {

    public EntryAdapter(Context context, int resource, List<Entry> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.grid_log, null);
        }

        TextView desc = (TextView) v.findViewById(R.id.desc);
        TextView type = (TextView) v.findViewById(R.id.type);
        TextView value = (TextView) v.findViewById(R.id.value);

        Entry entry = getItem(position);
        desc.setText("Entry Description : " + entry.getDesc());
        if (entry.getPositive()) {
            type.setText("Entry Type : Income");
        } else {
            type.setText("Entry Type : Outcome");
        }
        value.setText("Amount : " + entry.getValue() + "");

        return   v;
    }

}