package NeetCode150_hasDuplicates_Easy;

//@bubbleSortV2 solution 2 for the ContainsDuplicates @NeetCode150 Challenge with @Big O analysis of O(n2)
//The overall time complexity of the solution using Bubble Sort for
// sorting and then checking for duplicates in the sorted array is O(n^2)

public class HasDuplicatesBubbleSortV2 { //1
    //2 Java's main method
    public static void main(String[] args) {
        //2.1 Create 2x int[] @arrays test cases
        int[] array1 = {1,2,3,4,4};
        int[] array2 = {1,2,3,4,5};

        //2.2 Call @hasDuplicate(@array) (f) 2x times
        boolean result1 = hasDuplicates(array1);
        boolean result2 = hasDuplicates(array2);

        //3 Printing results
        System.out.println(result1);
        System.out.println(result2);


    }

    private static boolean hasDuplicates(int[] array1) { //1
        //2 To declare first default return statement false;
        //3 Call @bubbleSortV2(f) algorithm for sorting args @array first //REQUIRED create @bubbleSortV2 (f)
        bubbleSortV2(array1);

        //4 To check if @array hasDuplicates
        for (int i = 1; i < array1.length; i++) {
            if (array1[i] == array1[i - 1]) {
                return true;
            }
        }

        return false;
    }

    public static void bubbleSortV2(int[] array) { //1
        //2 Define boolean @swapped variable
        boolean swapped;
        //3 @nested for loop
        for (int i = 0; i < array.length - 1; i++) { //Outer count passed
            //SWAPPED = FALSE
            swapped = false;
            //3.1 @InnerLoop
            for (int j = 0; j < array.length - 1 - i; j++) {
                //3.2 Check if first element is > than 2nd element == Swapping Logic
                if (array[j] > array[j + 1]) { //Swapping Logic
                    //4 SWAPPING LOGIC
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    //4.1 SWAPPED = TRUE NOW
                    swapped = true;

                }
            }

            //4.2 BREAK
            if (swapped = false) {
                break; //Exit immediately
            }
        }

    }
}
