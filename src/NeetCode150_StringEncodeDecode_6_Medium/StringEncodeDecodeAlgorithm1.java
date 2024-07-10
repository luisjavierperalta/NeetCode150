package NeetCode150_StringEncodeDecode_6_Medium;

import java.util.ArrayList;
import java.util.List;

/*
@NeetCode150- 6
Algorithm made up of 2x (f) @encode & @decode + main
 */
public class StringEncodeDecodeAlgorithm1 { //1
    //2 Define java's main method program's entry point
    public static void main(String[] args) {
        //3 Declare original @List<String> @ArrayList<>()
        List<String> originalString = new ArrayList<>();
        //4 Add 3 elements @Strings to the list
        originalString.add("abc");
        originalString.add("defg");
        originalString.add("hi");
        //5 @Encode list of Strings @originalString
        String encodedString = encode(originalString);
        //5.1 Print @encodedString
        System.out.println("Encoded String :" + encodedString);

        //6 @Decode the @encodedString back to @List<String>
        List<String> decodedString = decode(encodedString);
        //6.1 Print @decodedString to the console
        System.out.println("Decoded String :" + decodedString);

    }

    //1 @Defining @encode(f) algorithm
    public static String encode(List<String> strs) {
        //2 Create Stringbuilder
        StringBuilder encodedString = new StringBuilder();
        //3 @Enhance for loop to iterate the list
        for (String str : strs) {
            encodedString.append(str.length()).append("$").append(str);
        }
        //1.1 return
        return encodedString.toString();
    }

    //2 Defining @Decode(f) algorithm
    public static List<String> decode(String str) {
        //3 Declaring a list of strings
        List<String> list = new ArrayList<>();
        //4 While loop 1
        int i = 0;
        while (i < str.length()) {
            //5 While loop 2
            int j = i;
            while (str.charAt(j) != '$') j++;

            //6
            int length = Integer.valueOf((str.substring(i, j)));
            i = j + 1 + length;
            list.add(str.substring( j + 1, i));

        }
        //2 return statement
        return list;
    }
}
