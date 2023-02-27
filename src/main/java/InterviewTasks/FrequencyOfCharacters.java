package InterviewTasks;

import java.util.Scanner;

public class FrequencyOfCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String myString = input.nextLine();
        System.out.println(frequencyOfChars(myString));


    }
    public static String frequencyOfChars(String str){
        String holderString="";

        for (int i = 0; i < str.length(); i++){
            int counter =0;
            for (int j = 0; j < str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    counter++;
                }
            }
            if(!(holderString.contains(str.charAt(i)+ ""))) {
                holderString += "" + str.charAt(i) + counter;
            }
        }
        return holderString;
    }





/*
Write a function that can find the frequency of characters from a given string

Ex:

frequencyOfChars("AAABBCDD"); ===>  A3B2C1D2
 */
}
