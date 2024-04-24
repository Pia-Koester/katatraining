import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String beast = "Papagei";
        String dish = "Porridgi";

        //To test Kata 1 - find value in array
        boolean result =  check(new Object[] {66, 101, 88}, 88);
        System.out.println("kata 1: " +result);

        // To test Kata 2 - Feast of Beasts:
        boolean result1 = feast(beast, dish);
        System.out.println("kata1: " + result1);

        //To test Kata 3 - double array
        int[] resultArray = map(new int[] {9, 7, 3});
        System.out.println(Arrays.toString(resultArray));

        //To test Kata 4 - removing spaces
        String result4 = noSpace("8 j 8   mBliB8g  imjB8B8  jl  B");
        System.out.println(result4);
    }

    // https://www.codewars.com/kata/57cc975ed542d3148f00015b
    //    You will be given an array a and a value x. All you need to do is check whether the provided array contains the value
    //    Array can contain numbers or strings. X can be either.
    //    Return true if the array contains the value, false if not.


    public static boolean check(Object[] a, Object x) {
        boolean found = false;
        for (Object item : a){
            if( item == x){found = true; break;}
        }
        return found;
    }


    //https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
//    All of the animals are having a feast! Each animal is bringing one dish. There is just one rule: the dish must start and end with the same letters as the animal's name. For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
//    Write a function feast that takes the animal's name and dish as arguments and returns true or false to indicate whether the beast is allowed to bring the dish to the feast.
//    Assume that beast and dish are always lowercase strings, and that each has at least two letters. beast and dish may contain hyphens and spaces, but these will not appear at the beginning or end of the string. They will not contain numerals.
    public static boolean feast(String inputBeast, String inputDish) {

        char startBeast = inputBeast.charAt(0);
        char endBeast = inputBeast.charAt(inputBeast.length() - 1);

        return inputDish.charAt(0) == startBeast && inputDish.charAt(inputDish.length() - 1) == endBeast;

    }


    //https://www.codewars.com/kata/57f781872e3d8ca2a000007e/train/java
    //Given an array of integers, return a new array with each value doubled.

    public static int[] map(int[] arr) {
        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            newArray[i] = arr[i] *2;
        }
        return newArray;
    }
    //https://www.codewars.com/kata/57eae20f5500ad98e50002c5/java
    //Write a function that removes the spaces from the string, then return the resultant string.

    public static String noSpace( String x) {
        String noSpace ="";
        char[] ch = x.toCharArray();

        for (int i = 0; i< ch.length; i++){
            if ( ch[i] != ' ') { noSpace = noSpace.concat(String.valueOf(ch[i]));}

        }

        return noSpace;
    }

}