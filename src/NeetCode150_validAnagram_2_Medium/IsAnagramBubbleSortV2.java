package NeetCode150_validAnagram_2_Medium;

//@BubbleSortV2 (f) algorithm for @isAnagram CodingChallenge @NeetCode150 (2)

import java.util.Arrays;
import java.util.Locale;

public class IsAnagramBubbleSortV2 { //1
    //2
    public static void main(String[] args) {
        //2.1
        String string1 = "Listen";
        String string2 = "Silent";

        //3 Call @isAnagram(string1,string2)
        boolean result = isAnagram(string1, string2);
        System.out.println(result);
    }

    private static boolean isAnagram(String string1, String string2) { //1
        //2 Convert Strings to lowercase English letters
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        //3 Check @EdgeCase, if strings.length is different == false by definition
        if (string1.length() != string2.length())  {
            return false;
        }

        //4 Convert Strings to char[] //REQUIRED for @BUBBLE SORT ALGORITHM
        char[] charArray1 = string1.toCharArray();
        char[] charArray2 = string2.toCharArray();

        //5 @bubbleSortV2 call 2x times
        bubbleSortV2(charArray1);
        bubbleSortV2(charArray2);

        //default (f) return Arrays.equals(string1, string2) TRUE/FALSE
        return Arrays.equals(charArray1, charArray2);
    }

    public static void bubbleSortV2(char[] array) { //1
        //2 swapped variable
        boolean swapped;
        //3 @nested for loop
        for (int i = 0; i < array.length - 1; i++) {
            //3.1 swapped = false;
            swapped = false;
            //3.2 @Inner for loop
            for (int j = 0; j < array.length - 1 - i; j++) {
                //4 Check if element 1 > element 2 (SWAPPING LOGIC)
                if (array[j] == array[j + 1]) {
                    //SWAPPING LOGIC
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    //5 swapped = true
                    swapped = true;
                }

            }
            //6 Check if required break
            if (swapped == false) {
                break;
            }
        }
    }
}
