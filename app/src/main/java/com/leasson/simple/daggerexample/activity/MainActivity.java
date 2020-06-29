package com.leasson.simple.daggerexample.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.leasson.simple.daggerexample.DaggerSmartPhoneComponent;
import com.leasson.simple.daggerexample.R;
import com.leasson.simple.daggerexample.SmartPhone;
import com.leasson.simple.daggerexample.SmartPhoneComponent;
import com.leasson.simple.daggerexample.components.Battery;
import com.leasson.simple.daggerexample.components.MemoryCard;
import com.leasson.simple.daggerexample.components.ServiceProvider;
import com.leasson.simple.daggerexample.components.SimCard;

public class MainActivity extends AppCompatActivity {
    SmartPhone smartPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        
        SmartPhoneComponent smartPhoneComponent = DaggerSmartPhoneComponent.create();
        smartPhone = smartPhoneComponent.getSmartPhone();

        smartPhone.makePhoneCall();

    }
}
