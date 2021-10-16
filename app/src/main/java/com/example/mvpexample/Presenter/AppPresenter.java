package com.example.mvpexample.Presenter;

import com.example.mvpexample.ModelClasses.Model;

public class AppPresenter {

    // the link between presenter and view is done by interface in mvp

    AppView appView;

    public AppPresenter(AppView appView) {
        this.appView = appView;
    }

    //Linkage between presenter and model
    public Model getAppFromModel(){
        return new Model("android app",1000,4);
    }

    //linkage between presenter and main activity
    public void getAppDetails(){
        appView.onGetAppName(getAppFromModel().getAppName());
    }

}
