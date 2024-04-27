public class Space {
    //https://www.codewars.com/kata/57eae20f5500ad98e50002c5/java
    //Write a function that removes the spaces from the string, then return the resultant string.

    public static String noSpace(String x) {
        String noSpace = "";
        char[] ch = x.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ') {
                noSpace = noSpace.concat(String.valueOf(ch[i]));
            }

        }

        return noSpace;
    }
}
