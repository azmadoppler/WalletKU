package com.example.administrator.walletku.Models;

/**
 * Created by Administrator on 26/5/2559.
 */
public class Entry {
    private String desc;
    private int value;
    private boolean isPositive;

    public Entry(String desc , int value , boolean isPositive ){
        this.desc = desc;
        this.value = value;
        this.isPositive = isPositive;
    }

    public String getDesc()
    {
        return this.desc;
    }
    public int getValue()
    {
        return this.value;
    }
    public boolean getPositive()
    {
        return this.isPositive;
    }



}
