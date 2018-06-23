package io.github.umangjpatel.bdaycard;

import android.arch.lifecycle.ViewModel;

public class CardViewModel extends ViewModel {

    private String mMessage, mName;

    public String getMessage() {
        return mMessage;
    }

    public void setMessage(String message) {
        mMessage = message;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public void saveName(CharSequence s, int start, int before, int count) {
        setName(s.toString());
    }

    public void saveMessage(CharSequence s, int start, int before, int count) {
        setMessage(s.toString());
    }
}
