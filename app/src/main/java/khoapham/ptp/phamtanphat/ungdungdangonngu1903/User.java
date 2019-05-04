package khoapham.ptp.phamtanphat.ungdungdangonngu1903;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;



public class User extends BaseObservable {
    private String title;
    private String hintuser;
    private String hintpassword;
    private String textbutton;

    public User(String title, String hintuser, String hintpassword, String textbutton) {
        this.title = title;
        this.hintuser = hintuser;
        this.hintpassword = hintpassword;
        this.textbutton = textbutton;
    }

    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }


    @Bindable
    public String getHintuser() {
        return hintuser;
    }

    public void setHintuser(String hintuser) {
        this.hintuser = hintuser;
        notifyPropertyChanged(BR.hintuser);
    }

    @Bindable
    public String getHintpassword() {
        return hintpassword;
    }

    public void setHintpassword(String hintpassword) {
        this.hintpassword = hintpassword;
        notifyPropertyChanged(BR.hintpassword);
    }

    @Bindable
    public String getTextbutton() {
        return textbutton;
    }

    public void setTextbutton(String textbutton) {
        this.textbutton = textbutton;
        notifyPropertyChanged(BR.textbutton);
    }


}
