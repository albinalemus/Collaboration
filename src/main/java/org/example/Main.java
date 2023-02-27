package org.example;

public class Main {

    public static boolean numberSix(int [] arr){

        if (arr[arr.length-1]==6 || arr[0] == 6){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        int [] arr1 = {6,2,3,5,7};
        boolean result = numberSix(arr1);
        System.out.println(result);
    }
}



//Given an array of ints, return true if 6 appears as either the first or last element in the array. The array will be length 1 or more.
//
//
//firstLast6([1, 2, 6]) → true
//firstLast6([6, 1, 2, 3]) → true
//firstLast6([13, 6, 1, 2, 3]) → false
















