package com.vismay.android.interactivestory.model;

import android.widget.ImageView;

/**
 * Created by Vismay on 1/14/2015.
 */
public class Page {
    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean isFinal=false;
    public Page()
    {

    }
    public Page(int imageId,String text, Choice choice1,Choice choice2)
    {
        mImageId=imageId;
        mText=text;
        mChoice1=choice1;
        mChoice2=choice2;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public Page(int imageId,String text)
    {
        mImageId=imageId;
        mText=text;
        mChoice1=null;
        mChoice2=null;
        isFinal=true;

    }
    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1 ;
    }

    public void setChoice1(Choice choice1) {
        this.mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        this.mChoice2 = choice2;
    }
}
