package com.example.jungle;

public class snake {
    String strSnakeCall = "Hissssss";
    int intSnakeEnergy = 100;
    int intSnakePop = 30;

    public void snakeSoundOff(){
        intSnakeEnergy = intSnakeEnergy - 3;
        System.out.println(strSnakeCall);
    }

    public void snakeEat(String food){
            intSnakeEnergy = intSnakeEnergy + 5;
    }

    public void snakeSleep(){
        intSnakeEnergy = intSnakeEnergy + 10;
    }


}
