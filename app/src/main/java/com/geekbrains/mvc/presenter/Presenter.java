package com.geekbrains.mvc.presenter;

import com.geekbrains.mvc.view.MainView;
import com.geekbrains.mvc.R;
import com.geekbrains.mvc.model.Model;

public class Presenter implements IButtonIndex{

    private final Model mModel;
    private final MainView mView;

    public Presenter(MainView mainView) {
        mModel = new Model();
        mView = mainView;
    }

    private int calcNewModelValue(int modelElementIndex) {
        int currentValue = mModel.getElementValueAtIndex(modelElementIndex);
        return currentValue + 1;
    }

    public void buttonClick(int id) {
        int newModelValue;
        switch (id) {
            case ONE:
                newModelValue = calcNewModelValue(0);
                mModel.setElementValueAtIndex(0, newModelValue);
                mView.setButtonText(ONE, newModelValue);
                break;

            case TWO:
                newModelValue = calcNewModelValue(1);
                mModel.setElementValueAtIndex(1, newModelValue);
                mView.setButtonText(TWO, newModelValue);
                break;

            case THREE:
                newModelValue = calcNewModelValue(2);
                mModel.setElementValueAtIndex(2, newModelValue);
                mView.setButtonText(THREE, newModelValue);
                break;
        }
    }
}
