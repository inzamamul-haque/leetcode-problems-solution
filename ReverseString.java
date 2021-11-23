public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'a', 'b', 'c', 'd', 'e'};

        int start = 0;
        int end = s.length-1;

        while (start<=end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            end--;
            start++;
        }

        for(Character c: s) {
            System.out.println(c);
        }
    }
}
