// LeetCode Problem -> 744. Find Smallest Letter Greater Than Target
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/


// Return smaller letter greater than the target number in a Sorted character array
// If the target is the last element then return 1st element 
public class A05SmallerLetterGreaterThanTarget {
    public static void main(String[] args) {
        char letters[] = { 'a', 'f', 'h', 'j', 'l' };
        char target = 'l';

        System.out.println(nextGreatestLetter(letters, target));
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}






