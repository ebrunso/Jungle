package com.example.jungle;

public class tiger {
    String strTigerCall = "ROOOOAR";
    int intTigerEnergy = 100;
    int intTigerPop = 20;

    public void tigerSoundOff(){
        intTigerEnergy = intTigerEnergy - 3;
        System.out.println(strTigerCall);
    }

    public void tigerEat(String food){
        if (food != "grain"){
            intTigerEnergy = intTigerEnergy + 5;
        } else{
            System.out.println("Tigers cannot eat grain!");
        }
    }

    public void tigerSleep(){
        intTigerEnergy = intTigerEnergy + 5;
    }
}
