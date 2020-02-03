package com.example.jungle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1. Create a function to find the most occurrence of an integer value given an integer array.
        int intArray[] = new int[]{1, 1, 2, 3 , 4 , 5 , 6, 6, 5, 5, 5};
        int intArrayMode = findModeClass.findMode(intArray);
        System.out.println(intArrayMode + " is the mean of the array.");

        //2. Simple Java Program to check or find if a number is Armstrong number or not.
        // An Armstrong number of three digit is a number whose sum of cubes of its digit is equal to its number.
        // For example 153 is an Armstrong number of 3 digit because 1^3+5^3+3^3 or 1+125+27=153
        int intPossibleArmstrong = 153;
        String strArmCheck = Integer.toString(intPossibleArmstrong);
        char charArmCheck;
        int intStringLength = strArmCheck.length();
        int intArmDec = 0;
        int intArmTotal = 0;
        boolean isArmstrong = false;

        //System.out.println(intStringLength);

        for (int i = 0; i < intStringLength; i++){
            charArmCheck = strArmCheck.charAt(i);
            intArmDec = Character.getNumericValue(charArmCheck);
            //System.out.println(intArmDec);
            intArmTotal = intArmTotal + (intArmDec * intArmDec * intArmDec);
            //System.out.println((intArmTotal));

            if (intArmTotal == intPossibleArmstrong){
                isArmstrong = true;
            }
        }

        if(isArmstrong == true){
            System.out.println("The number: " + intPossibleArmstrong + " is an Armstrong Number!");
        } else {
            System.out.println("The number: " + intPossibleArmstrong + " is NOT an Armstrong Number!");
        }

        String strFood = "grain";

        animalCalls newSoundOff = new animalCalls();
        newSoundOff.soundOff();

        feedingTime newFeedingTime = new feedingTime();
        newFeedingTime.timeForFood(strFood);

        nightTime newNightTime = new nightTime();
        newNightTime.bedTime();

        playTime newPlayTime = new playTime();
        newPlayTime.timeToPlay();

    }

    public class animalCalls{
        public void soundOff(){

            monkey newMonkey = new monkey();
            newMonkey.monkeySoundOff();

            tiger newTiger = new tiger();
            newTiger.tigerSoundOff();

            snake newSnake = new snake();
            newSnake.snakeSoundOff();
        }
    }

    public class feedingTime{
        public void timeForFood(String strFood){

            monkey hungryMonkey = new monkey();
            hungryMonkey.monkeyEat(strFood);

            tiger hungryTiger = new tiger();
            hungryTiger.tigerEat(strFood);

            snake hungrySnake = new snake();
            hungrySnake.snakeEat(strFood);
        }
    }

    public class nightTime{
        public void bedTime(){

            monkey sleepyMonkey = new monkey();
            sleepyMonkey.monkeySleep();

            tiger sleepyTiger = new tiger();
            sleepyTiger.tigerSleep();

            snake sleepySnake = new snake();
            sleepySnake.snakeSleep();
        }
    }

    public class playTime{
        public void timeToPlay(){
            monkey playfulMonkey = new monkey();
            playfulMonkey.monkeyPlay();
        }
    }
}
