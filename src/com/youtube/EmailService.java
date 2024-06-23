package com.youtube;

public class EmailService implements ConnectAble {


    @Override
    public void sendNotify(User user) {
        System.out.println("Notifying " + user.getEmail() + "...");
        System.out.println("Done!\n");
    }
}
