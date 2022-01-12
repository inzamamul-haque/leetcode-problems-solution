package leetcode;

public class DecodeXoredArray {

    public int[] decode(int[] encoded, int first) {
        int[] decode = new int[encoded.length + 1];
        decode[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            decode[i + 1] = encoded[i] ^ decode[i];
        }

        return decode;
    }

    public static void main(String[] args) {
        int[] encoded = {1, 2, 3};
        int first = 1;
        DecodeXoredArray decodeXoredArray = new DecodeXoredArray();
        int[] result = decodeXoredArray.decode(encoded, first);
        for (int res : result) {
            System.out.print(res + " ");
        }

    }
}
