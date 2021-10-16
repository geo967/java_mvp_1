package com.example.mvpexample.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvpexample.Presenter.AppPresenter;
import com.example.mvpexample.Presenter.AppView;
import com.example.mvpexample.R;

public class MainActivity extends AppCompatActivity implements AppView {

    Button button;
    TextView textView;

    //link activity with presenter
    AppPresenter appPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        textView=findViewById(R.id.text);
        appPresenter=new AppPresenter(this);

    }
    public void clickedButton(View view){

        //calling presenter to get data from db
        //so no linkage between activity and model
        //main activity is handling the UI only
        appPresenter.getAppDetails();
    }

    @Override
    public void onGetAppName(String string) {
        textView.setText(string);
    }
}

//view is the activity with textview and button
//model is the model class
//presenter is the app presenter