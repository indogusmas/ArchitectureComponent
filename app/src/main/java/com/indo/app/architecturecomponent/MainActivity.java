package com.indo.app.architecturecomponent;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.indo.app.architecturecomponent.ViewModel.ClickCounterViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.text_increment)
    protected TextView clickCountText;

    private ClickCounterViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        viewModel = ViewModelProviders.of(this).get(ClickCounterViewModel.class);
        displayClickCount(viewModel.getCount());
    }
    @OnClick(R.id.btn_increment)
    public void  setClickCountText(View button){
        viewModel.setCount(viewModel.getCount()+1);
        displayClickCount(viewModel.getCount());
    }
    private void displayClickCount(int clickCount){
        clickCountText.setText(String.valueOf(clickCount));
    }
}






























