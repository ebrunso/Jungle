package com.example.jungle;

public class findModeClass {
    public static int findMode(int intArray[]){
        int modeVal = 0;
        int modeCount = 0;
        int count = 0;


        for (int i = 0; i < intArray.length; i++){
            count = 0;
            for (int k = 0; k < intArray.length; k++){
                if(intArray[i]==intArray[k]){
                    count++;
                }
            }
            if (count > modeCount){
                modeCount = count;
                modeVal = intArray[i];
            }
        }
        return modeVal;
    }
}
