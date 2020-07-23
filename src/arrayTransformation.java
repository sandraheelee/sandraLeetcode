import java.util.ArrayList;
import java.util.List;

/*
Leetcode ArrayTransformation: https://leetcode.com/problems/array-transformation/submissions/
 */
public class arrayTransformation {
    public static void main(String[] args) {

        int[] arr = {6, 2, 3, 4};
        int tail = arr.length - 1;
        boolean isListChanging = true;
        //it'll be in while loop as we want to keep looping again if the list is not  in the final state
        while (isListChanging) {
            int before = arr[0];
            isListChanging = false;
            //we are assigning i to 1 because the head and tail won't change in the list.
            for (int i = 1; i < tail; i++) {
                int curr = arr[i], next = arr[i + 1];
                if ((curr < next) && (curr < before)) {
                    arr[i]++;
                    isListChanging = true;
                } else if ((curr > next) && (curr > before)) {
                    arr[i]--;
                    isListChanging = true;
                }
                before = curr;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int num : arr)
            res.add(num);
        System.out.println(res);
    }

}
