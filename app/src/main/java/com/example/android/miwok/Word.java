package com.example.android.miwok;

import android.graphics.drawable.Drawable;

/**
 * Created by nexus on 07.02.2017.
 */
public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImage;

    public Word(String miwokTranslation,String defaultTranslation, int image){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImage = image;
    }

    public Word(String miwokTranslation,String defaultTranslation){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getImageId(){ return mImage; }
}
