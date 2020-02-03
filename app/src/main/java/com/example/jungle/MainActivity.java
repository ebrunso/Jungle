package com.example.jungle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
