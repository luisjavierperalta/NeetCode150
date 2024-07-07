package NeetCode150_twoSum_3_Easy;

public class TwoSumBruteForce1 { //1
    //2 Java's main method
    public static void main(String[] args) {
        //2.1 Input @Array[] declaration & init
        int[] array = {4,5,6};
        //2.2 @Target of @array definition
        int target = 10;
        //3 Call twoSumBruteForce(@array, @target) (f) algorithm
        System.out.println(twoSumBruteForce(array, target));

    }

    private static int[] twoSumBruteForce(int[] array, int target) { //1 @int[] return type
        //2 return statement by default
        //3 @Nested for loop
        //3.1 Outer for loop
        for (int i =0; i < array.length - 1; i++) { //@array.length - 1;
            //3.2 Inner for loop
            for (int j = i + 1; j < array.length; j++) { //@array next element
                //4 Check if sum == @target
                if (array[i] + array[j] == target) {
                    //4.1 return result
                    return new int[] {i, j};
                }
            }

        }
        return new int[] {-1,-1};
    }
}
