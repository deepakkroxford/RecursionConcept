public class Q9_ReverseString {
    public static void reverse(String s, int idx)
        {
            if(idx==s.length()-1)
            {
                return;
            }
            reverse(s, idx+1);
            System.out.print(s.charAt(idx));
        }
        public static void main(String[] args) {
            String s ="Deepak Kumar Singh";
            reverse(s,0);
    }
}
