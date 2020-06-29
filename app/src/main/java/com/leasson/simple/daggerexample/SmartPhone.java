package com.leasson.simple.daggerexample;

import android.util.Log;
import android.widget.Toast;

import com.leasson.simple.daggerexample.components.Battery;
import com.leasson.simple.daggerexample.components.MemoryCard;
import com.leasson.simple.daggerexample.components.SimCard;

import javax.inject.Inject;

public class SmartPhone {

    private Battery battery;
    private MemoryCard memoryCard;
    private SimCard simCard;

    @Inject
    public SmartPhone(Battery battery, MemoryCard memoryCard, SimCard simCard) {
        this.battery = battery;
        this.memoryCard = memoryCard;
        this.simCard = simCard;
    }

    public void makePhoneCall(){
        Log.i("Smart Phone", "Calling Phone ...");
    }
}
