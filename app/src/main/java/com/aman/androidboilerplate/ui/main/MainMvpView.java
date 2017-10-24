package com.aman.androidboilerplate.ui.main;

import java.util.List;

import com.aman.androidboilerplate.data.model.Ribot;
import com.aman.androidboilerplate.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showRibots(List<Ribot> ribots);

    void showRibotsEmpty();

    void showError();

}
