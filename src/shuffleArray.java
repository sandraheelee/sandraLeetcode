import java.util.Arrays;
import java.util.Random;

/*
Leetcode: Shuffle array - https://leetcode.com/problems/shuffle-an-array/solution/
Slightly different answer from the leetcode problem. Just took a snippet of the randomnizer.
 */
public class shuffleArray {
    public static void main(String args[]) {
        Random random = new Random();
        int[] nums = {1,2,3,4,5,6,7};
        int[] results = Arrays.copyOf(nums, nums.length);
        int j = 0;
        while(j<3){
        for(int i =0; i<nums.length;i++){
            int temp = results[i];
            // random number from 0-7
            int position = random.nextInt(nums.length);
            results[i] = results[position];
            results[position] = temp;
        }

        System.out.println(Arrays.toString(results));
        j++;
        }
    }
}