package cuongph.mvvm.example.viewmodel;

import android.databinding.ObservableField;

import cuongph.mvvm.example.R;
import cuongph.mvvm.example.model.People;

public class MainViewModel{
    private ObservableField<People> observablePeople = new ObservableField<>();

    public MainViewModel(){

        People people = new People("Pham Huu Cuong", "123456789", R.mipmap.ic_launcher);
        observablePeople.set(people);
    }

    public ObservableField<People> getObservablePeople(){
        return observablePeople;
    }
}
