package com.prep.datastructures;

public class ArrayEvenNumbers {
    public static int[] removeEven(int[] arr) {
        // Write - Your - Code- Here
        int[] tempArr = arr;
        for(int i = 0; i < tempArr.length; i++){
            System.out.print(" " + tempArr[i]);
        }

        for(int i = 0; i < tempArr.length; i++) {
            if(tempArr[i] % 2 == 0) {
                int [] newArr = new int[tempArr.length - 1];
                for(int j = 0; j < i; j++){
                    newArr[j] = tempArr[j];
                }
                for(int k = i; k < tempArr.length - 1; k++){
                    newArr[k] = tempArr[k+1];
                }
                tempArr = newArr;
            }
        }
        return tempArr;
    }
}
