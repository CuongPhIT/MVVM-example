package cuongph.mvvm.example.view;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import cuongph.mvvm.example.R;
import cuongph.mvvm.example.databinding.ActivityMainBinding;
import cuongph.mvvm.example.model.People;
import cuongph.mvvm.example.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        initViewModel();

        binding.setUser(mainViewModel.getObservablePeople().get());
        binding.setHandleClick(new MyHandleClick());
    }

    public void initViewModel(){
        mainViewModel = new MainViewModel();
    }

    public class MyHandleClick {
        public MyHandleClick() {
        }

        public void onPressButton(View view) {
            Toast.makeText(getApplicationContext(), "Testtttttttttt", Toast.LENGTH_SHORT).show();
            Log.e("cuongph", "logggg");
        }

        public boolean onButtonLongClicked(View view, String name) {
            Toast.makeText(getApplicationContext(), "Helloooooooo " + name, Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}
