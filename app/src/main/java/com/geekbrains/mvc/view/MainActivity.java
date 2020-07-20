package com.geekbrains.mvc.view;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.geekbrains.mvc.R;
import com.geekbrains.mvc.presenter.IButtonIndex;
import com.geekbrains.mvc.presenter.Presenter;


public class MainActivity extends AppCompatActivity implements MainView, View.OnClickListener {

    /** Android Views **/
    private TextView tv1;
    private Button btnCounter1;
    private TextView tv2;
    private Button btnCounter2;
    private TextView tv3;
    private Button btnCounter3;

    private Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        btnCounter1 = findViewById(R.id.btnCounter1);
        tv2 = findViewById(R.id.tv2);
        btnCounter2 = findViewById(R.id.btnCounter2);
        tv3 = findViewById(R.id.tv3);
        btnCounter3 = findViewById(R.id.btnCounter3);

        btnCounter1.setOnClickListener(this);
        btnCounter2.setOnClickListener(this);
        btnCounter3.setOnClickListener(this);

        mPresenter = new Presenter(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnCounter1:
                mPresenter.buttonClick(IButtonIndex.ONE);
                break;
            case R.id.btnCounter2:
                mPresenter.buttonClick(IButtonIndex.TWO);
                break;
            case R.id.btnCounter3:
                mPresenter.buttonClick(IButtonIndex.THREE);
                break;
        }


    }

    @Override
    public void setButtonText(int btnIndex, int value) {
        switch (btnIndex) {
            case 1:
                btnCounter1.setText("Количество = " + value);
                break;
            case 2:
                btnCounter2.setText("Количество = " + value);
                break;
            case 3:
                btnCounter3.setText("Количество = " + value);
                break;
        }
    }
}
