package task1;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{9, 2, 0, 0, 1, -1, -99999999};
        sort(array);
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static int[] sort(int[] sourceArray) throws MyException {
        int n = sourceArray.length;
        if (n == 0) {
            throw new MyException();
        }
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (sourceArray[j - 1] > sourceArray[j]) {
                    temp = sourceArray[j - 1];
                    sourceArray[j - 1] = sourceArray[j];
                    sourceArray[j] = temp;
                }
            }
        }
        return sourceArray;
    }
}
