package com.learning.dagger2learning;

import dagger.Component;

@Component
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}
