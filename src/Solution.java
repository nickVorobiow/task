public class Solution {
    public static int[] courseWorkTask(int[] arr) {
        int[] arrBuf = new int[5];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
            if (i >= 3 && i <= 7) {
                arrBuf[index++] = arr[i];
            }
        }
        return arrBuf;
    }
}
