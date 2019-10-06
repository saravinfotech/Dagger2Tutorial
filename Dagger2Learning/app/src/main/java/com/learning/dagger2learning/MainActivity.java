package com.learning.dagger2learning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Car car;
    CarComponent carComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        carComponent = DaggerCarComponent.create();
        carComponent.inject(this);
 //       car = carComponent.getCar();
        car.drive();
    }
}
