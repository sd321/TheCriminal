package com.bignerdranch.android.criminalintent;

import android.util.Log;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Stack;
import java.util.UUID;

/**
 * Created by surya_dahiya on 16-05-2017.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;
    public Crime() {
// Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String formatDate(Date date){
        SimpleDateFormat sdf=new SimpleDateFormat("EEE MMM dd hh:mm a");
        return sdf.format(date);
    }

    public Date getDate(){
        return mDate;

    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
