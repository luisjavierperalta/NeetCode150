package NeetCode150_twoSum_3_Easy;

import java.util.HashMap;
import java.util.Map;

/*
@HashMap solution involves iterating over array 1x time @Regular For Loop
, then performing Big o(1) operations for each element


 */
public class TwoSumHashMap1 { //1
    //2 Declaring java's main method
    public static void main(String[] args) {
        //2.1 Declare & init int[] @array
        int[] array = {2,7,11,15};
        //2.2 set @target
        int target = 9;
        //2.3 Printing result
        int[] result = twoSumHashMap(array,target);
        System.out.println("Indexes:" + result[0] + result[1]);

    }

    public static int[] twoSumHashMap(int[] array, int target) { //1
        //3 Create @HashMap
        Map<Integer, Integer> map = new HashMap<>();
        //4 @Iterate over the @input array
        for (int i = 0; i < array.length; i++) {
            //4.1 Declare @int complement element
            int complement = target - array[i];
            //4.2 Check if @Complement = present in @HashMap
            if (map.containsKey(complement)) {
                //If true, return 2 indexes sum up to target
                return new int[] {map.get(complement) , i};
            }
            //4.3 If not available, insert new @pair into @HashMap
            map.put(array[i], i);
        }

        //2 Default return statement
        return new int[] {-1, -1};
    }
}
