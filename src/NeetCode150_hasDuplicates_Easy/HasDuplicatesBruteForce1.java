package NeetCode150_hasDuplicates_Easy;

// Brute-force solution 1 @Big O algorithm's analysis of O(n2) due to @NestedForLoop
public class HasDuplicatesBruteForce1 { //1
    //2 To declare java's main method
    public static void main(String[] args) {
        //2.1 To declare int[] array
        int[] array = {1,2,3,3,5};
        //2.3 To call @hasDuplicates(@array)
        boolean result = hasDuplicates(array);
        System.out.println(result);


    }

    private static boolean hasDuplicates(int[] array) { //1
        // 2 by default return false
        //3 To declare @NestedForLoop
        for (int i = 0; i < array.length; i++) { //OuterForLoop
            //3.1 Declaring InnerForLoop (i + 1)
            for (int j = i + 1; j < array.length; j++) {
                //4 Check equality
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }

        return false;

    }
}
