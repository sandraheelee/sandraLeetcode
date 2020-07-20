
/*      Given a list of scores of different students, return the average score of each student's top five scores in the order of each student's id.

        Each entry items[i] has items[i][0] the student's id, and items[i][1] the student's score.  The average score is calculated using integer division.



        Example 1:

        Input: [[1,91],[1,92],[2,93],[2,97],[1,60],[2,77],[1,65],[1,87],[1,100],[2,100],[2,76]]
        Output: [[1,87],[2,88]]
        Explanation:
        The average of the student with id = 1 is 87.
        The average of the st*/


import java.util.*;

public class highFives {
    public static void main(String args[]) {
        int[][] items = {{1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}};
        HashMap<Integer, List<Integer>> map = new HashMap();
        for (int[] item : items) {
            int id = item[0];
            int val = item[1];
            map.putIfAbsent(id, new ArrayList<Integer>());
            map.get(id).add(val);
        }
        int[][] res = new int[map.size()][2];
        int idx = 0;
        for (int key : map.keySet()) {
            List<Integer> lst = map.get(key);
            Collections.sort(lst, Collections.reverseOrder());
            int index = 0;
            int sum = 0;
            while (index < 5 && index < lst.size()) {
                sum += lst.get(index);
                index++;
            }
            res[idx][0] = key;
            res[idx][1] = sum / index;
            idx++;
            System.out.println(res);
        }
    }
}
