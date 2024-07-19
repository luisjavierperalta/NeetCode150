package NeetCode150_StringEncodeDecode_6_Medium;

//1 algorithm > 2x (f) @Encode @Decode

import java.util.ArrayList;
import java.util.List;

public class StringEncodeDecodeAlgorithm2 { //1 class def
    //2 @encode (f) return @String + List<String> strings Parameter
    public static String encode(List<String> strings) {
        //2.1 Return encoded @sb.toString
        //3 @StringBuilder declaration
        StringBuilder sb = new StringBuilder(); //String builder class @Mutable objs, No new Objes, 5+ cool methods
        //4 Iterate over @Strings + for x string = sb.append()
        for (String string : strings) {
            sb.append(string.length()).append("$").append(string);
        }

        return sb.toString();

    }

    //1 @Decode (f) 2/2 of algorithm
    public static List<String> decode(String string) {
        //1 Create list of Strings to return
        List<String> list = new ArrayList<>();
        //2 @Nested WhileLoops
        //2.1 Outer loop
        int i = 0;
        while (i < string.length()) {

            //2.2 Inner While loop (j)
            int j = i;
            while (string.charAt(j) != '#') j++;

            int length = Integer.valueOf(string.substring(i, j));
            i = j + 1 + length;
            list.add(string.substring(j + 1, i));

        }
        return list;

    }
}
