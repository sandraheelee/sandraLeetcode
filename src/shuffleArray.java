import java.util.Arrays;
import java.util.Random;

/*
Leetcode: Shuffle array - https://leetcode.com/problems/shuffle-an-array/solution/
Slightly different answer from the leetcode problem. Just took a snippet of the randomnizer.
 */
public class shuffleArray {
public static void main(String args[]) {
    int[] nums = {1,2,3};
    Random random = new Random();
    int[] arrayCopy = Arrays.copyOf(nums, nums.length);

    for(int i =0;i<nums.length;i++){
        int position = random.nextInt(nums.length);
        int temp = arrayCopy[i];
        arrayCopy[i] = arrayCopy[position];
        arrayCopy[position] = temp;
    }
    System.out.println(Arrays.toString(arrayCopy));
}
}