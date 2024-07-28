package NeetCode150_7Medium_ProductsOfArrayDiscludingSelf;

public class Solution { //1 Class def
    //2 Algorithm (f) Signature
    public static int[] productExceptSelf(int[] nums) { //2

        //2.1 Declaring new int[] output for storing result with nums.length (input)
        int[] output = new int[nums.length];
        //2.2 To initialize @right @left to 1 for keep track of sided products
        int right = 1;
        int left = 1;

        //2.3 Calculate left products
        //REQUIRED ITERATE LEFT-RIGHT WITH @REGULAR FOR LOOP
        for (int i = 0; i < nums.length; i++) {
           output[i] = left;
           left *= nums[i];
        }

        //2.4 Calculate right products
        //REQUIRED ITERATE RIGHT-LEFT WITH @REGULAR FOR LOOP
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= right;
            right *= nums[i];

        }

        //2.1 Return statement
        return output;
    }
}
