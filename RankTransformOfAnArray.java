public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {

        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        Map<Integer, Integer> map = new HashMap();
        int count = 1;
        for (int i = 0; i < temp.length; i++) {
            if(!map.containsKey(temp[i])) {
                map.put(temp[i], count);
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        RankTransformOfAnArray rankTransformOfAnArray = new RankTransformOfAnArray();
        rankTransformOfAnArray.arrayRankTransform(arr);

    }
}
