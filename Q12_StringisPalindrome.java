public class Q12_StringisPalindrome {
    public static boolean isPalindrome(String s, int i , int j) {
        if(i>j) {
            return true;
        }
        if(s.charAt(i)!=s.charAt(j)){
            return false;
        }
        return isPalindrome(s, i+1, j-1);

    }
    public static void main(String[] args) {
        String s = "ama";
        System.out.println(isPalindrome(s, 0, s.length()-1));
    }
}
