package com.example.administrator.walletku.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 26/5/2559.
 */
public class Log {
    private List<Entry> entries;
    public static Log instance = null;
    private int total;

    private Log()
    {
        total = 0;
        entries = new ArrayList<Entry>();
    }

    public static Log getInstance()
    {
        if(instance == null)
        {
            instance = new Log();
        }
        return instance;
    }

    public void addEntry(Entry entry)
    {
        entries.add(entry);
    }

    public List<Entry> getEntries()
    {
        return this.entries;
    }

    public void calculateTotal()
    {
        total = 0;
        for(Entry e : entries)
        {
            if(e.getPositive())
            {
                total+=e.getValue();
            }else
            {
                total-=e.getValue();
            }
        }
    }
    public int getTotal()
    {
        return this.total;
    }





}
