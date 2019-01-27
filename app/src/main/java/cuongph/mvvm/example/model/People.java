package cuongph.mvvm.example.model;

import android.databinding.BindingAdapter;
import android.widget.ImageView;

public class People {
    private String name;
    private String phoneNumber;
    private int icon;

    public People(String name, String phoneNumber, int icon) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    @BindingAdapter("icon")
    public static void setIcon(ImageView img, int icon){
        img.setImageResource(icon);
    }
}
