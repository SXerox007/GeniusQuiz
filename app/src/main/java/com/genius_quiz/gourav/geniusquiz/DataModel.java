package com.genius_quiz.gourav.geniusquiz;


import android.os.Parcel;
import android.os.Parcelable;


public class DataModel implements Parcelable {
    String mQuestion,mOptionA,mOptionB,mOptionC,mOptiond;

    public DataModel(String mQuestion,String mOptionA,String mOptionB,String mOptionC,String mOptiond){
        this.mQuestion=mQuestion;
        this.mOptionA=mOptionA;
        this.mOptionB=mOptionB;
        this.mOptionC=mOptionC;
        this.mOptiond=mOptiond;
    }

    protected DataModel(Parcel in) {
        mQuestion = in.readString();
        mOptionA = in.readString();
        mOptionB = in.readString();
        mOptionC = in.readString();
        mOptiond = in.readString();
    }

    public static final Creator<DataModel> CREATOR = new Creator<DataModel>() {
        @Override
        public DataModel createFromParcel(Parcel in) {
            return new DataModel(in);
        }

        @Override
        public DataModel[] newArray(int size) {
            return new DataModel[size];
        }
    };

    public String getmQuestion(){
        return mQuestion;
    }
    public String getmOptionA(){
        return mOptionA;
    }
    public String getmOptionB(){
        return mOptionB;
    }
    public String getmOptionC(){
        return mOptionC;
    }
    public String getmOptiond(){
        return mOptiond;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mQuestion);
        dest.writeString(mOptionA);
        dest.writeString(mOptionB);
        dest.writeString(mOptionC);
        dest.writeString(mOptiond);
    }
}
