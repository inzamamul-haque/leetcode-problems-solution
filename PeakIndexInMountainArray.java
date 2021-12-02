public class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int index = 0;
        int max =arr[0];
        for(int i=0; i<arr.length; i++) {
            if(max<arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}
