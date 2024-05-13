import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        //To test Kata 1 - find value in array
        boolean result = ArrayCheck.check(new Object[]{66, 101, 88}, 88);
        System.out.println("kata 1: " + result);

        String beast = "Papagei";
        String dish = "Porridge";

        // To test Kata 2 - Feast of Beasts:
        boolean result1 = Beast.feast(beast, dish);
        System.out.println("kata 2: " + result1);

        //To test Kata 3 - double array
        int[] resultArray = Doubled.map(new int[]{9, 7, 3});
        System.out.println("Kata 3: " + Arrays.toString(resultArray));

        //To test Kata 4 - removing spaces
        String result4 = Space.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B");
        System.out.println("Kata 4" + result4);
    }


}