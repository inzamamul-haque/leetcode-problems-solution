package leetcode;

public class Square {
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.mySqrt(8));
    }
}
