package com.vismay.android.interactivestory.model;

/**
 * Created by Vismay on 1/14/2015.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }

    public Choice(String text,int nextPage)
    {
        mText=text;
        mNextPage=nextPage;
    }

}
