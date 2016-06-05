//package com.example.administrator.walletku.Adapter;
//
//import android.content.Context;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ArrayAdapter;
//import android.widget.TextView;
//
//import com.example.administrator.walletku.Models.Log;
//import com.example.administrator.walletku.R;
//
//import java.util.List;
//
///**
// * Created by Administrator on 5/6/2559.
// */
//public class LogAdapter extends ArrayAdapter<Log> {
//
//    public LogAdapter(Context context, int resource, List<Log> objects) {
//        super(context, resource, objects);
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//
//        View v = convertView;
//
//        if(v == null) {
//            LayoutInflater vi = LayoutInflater.from(getContext());
//            v = vi.inflate(R.layout.note_cell, null);
//        }
//
//        TextView subject = (TextView)v.findViewById(R.id.subject);
//        TextView body = (TextView)v.findViewById(R.id.body);
//
//        Note note = getItem(position);
//        subject.setText(note.getSubject());
//        body.setText(note.getBody());
//
//        return v;
//    }
