public class reverseString {

/*  Write a function that reverses a string. The input string is given as an array of characters char[].

    Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

    You may assume all the characters consist of printable ascii characters.



    Example 1:

    Input: ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]*/

    public static void main(String args[]) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        int len = s.length;
        int i = 0, j = len - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }
        System.out.println(s);
    }

}
