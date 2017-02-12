package com.example.android.miwok;

/**
 * Created by nexus on 07.02.2017.
 */
public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImage = DOESNT_HAVE_IMAGE;
    private static final int DOESNT_HAVE_IMAGE = -1;
    private int mSoundId;

    public Word(String miwokTranslation,String defaultTranslation, int image, int sound){
        mMiwokTranslation = miwokTranslation;
        mDefaultTranslation = defaultTranslation;
        mImage = image;
        mSoundId = sound;
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
    public boolean hasImage(){
        return mImage != DOESNT_HAVE_IMAGE;
    }

    public int getSoundId(){
        return mSoundId;
    }
}
