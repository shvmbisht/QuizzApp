package com.londonappbrewery.quizzler;

/**
 * Created by monk on 12-Jan-18.
 */

public class TrueFalse {
    private int mQuestionID;
        private boolean mAnswer;
//now constructor
    public TrueFalse(int questionID, boolean answer) {
        mQuestionID = questionID;
        mAnswer = answer;
    }

    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
