package com.example.jungle;

public class monkey {
    String strMonkeyCall = "Oook Ook";
    int intMonkeyEnergy = 100;
    int intMonkeyPop = 10;


    public void monkeySoundOff(){
        intMonkeyEnergy = intMonkeyEnergy - 4;
        System.out.println(strMonkeyCall);
    }

    public void monkeyEat(String food){
        intMonkeyEnergy = intMonkeyEnergy + 2;
    }

    public void monkeySleep(){
        intMonkeyEnergy = intMonkeyEnergy + 10;
    }

    public void monkeyPlay(){
        if (intMonkeyEnergy >= 8){
            intMonkeyEnergy = intMonkeyEnergy - 8;
            System.out.println("Oooo Oooo Oooo");
        } else {
            System.out.println("Monkey is too tired");
        }
    }
}
