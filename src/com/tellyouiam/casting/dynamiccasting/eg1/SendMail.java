package com.tellyouiam.casting.dynamiccasting.eg1;

import com.tellyouiam.casting.staticcasting.Action;

public class SendMail implements Action{

    @Override
    public void perform() {
        System.out.println("Canadian Pharmacy Order the Cheapest Medication Now!!");
    }
}
