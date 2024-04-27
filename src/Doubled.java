public class Doubled {


    //https://www.codewars.com/kata/57f781872e3d8ca2a000007e/train/java
    //Given an array of integers, return a new array with each value doubled.

    public static int[] map(int[] arr) {
        int[] newArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            newArray[i] = arr[i] *2;
        }
        return newArray;
    }
}
