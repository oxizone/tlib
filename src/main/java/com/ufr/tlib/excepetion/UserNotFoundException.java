package com.ufr.tlib.excepetion;


public class UserNotFoundException extends Exception{

    public UserNotFoundException(){
        super("User not found");
    }
}

