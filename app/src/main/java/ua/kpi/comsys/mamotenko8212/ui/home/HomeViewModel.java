package ua.kpi.comsys.mamotenko8212.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Мамотенко Богдан\nГрупа ІО-82\nЗK ІО-8212");
    }

    public LiveData<String> getText() {
        return mText;
    }
}