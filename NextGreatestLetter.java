package leetcode;

public class NextGreatestLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        int firstElement = 0;
        int lastElement = letters.length - 1;

        while (firstElement <= lastElement) {
            int mid = firstElement + (lastElement - firstElement) / 2;
            if (letters[mid] > target) {
                lastElement = mid - 1;
            } else {
                firstElement = mid + 1;
            }
        }

        return letters[firstElement % letters.length];

    }

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';
        NextGreatestLetter nextGreatestLetter = new NextGreatestLetter();
        char res = nextGreatestLetter.nextGreatestLetter(letters, target);
        System.out.println(res);
    }
}
