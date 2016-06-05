package com.example.administrator.walletku.Models;

/**
 * Created by Administrator on 26/5/2559.
 */
public class Goal {
    private String date;
    private String desc;
    private int value;
    public static Goal instance;

    private Goal(){
        this.desc = "No Description";
        this.value = 0;
        this.date = "No Deadline yet";
    }

    public String getDate()
    {
        return  this.date;
    }
    public void setDate(String date)
    {
        this.date = date;
    }
    public void setValue(int value)
    {
        this.value = value;
    }
    public void setDesc(String str)
    {
        this.desc  =str;
    }


    public static Goal getInstance(){
        if(instance == null) {
            instance = new Goal();
        }
        return instance; }
    public String getDesc()
    {
        return this.desc;
    }
    public int getValue()
    {
        return this.value;
    }
    public int calculateLeft()
    {
        Log.getInstance().calculateTotal();
        int totalMoney = Log.getInstance().getTotal();
        if(totalMoney>value)
        {
            return 0;
        }
        else return value-totalMoney;
    }
    public void clear()
    {
        instance = new Goal();
    }




}
