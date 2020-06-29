package com.leasson.simple.daggerexample.components;

import javax.inject.Inject;

public class SimCard {
    private ServiceProvider serviceProvider;

    @Inject
    public SimCard(ServiceProvider serviceProvider) {
        this.serviceProvider = serviceProvider;
    }
}
