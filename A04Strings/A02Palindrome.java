public class A02Palindrome {
    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str){
        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
        while (start<=end) {
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
