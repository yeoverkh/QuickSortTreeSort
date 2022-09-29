public class QuickSort {
    public static void sort(int[] array) {
        sortRec(array, 0, array.length - 1);
    }

    private static void sortRec(int[] array, int low, int high) {
        if (array.length == 0 || low >= high) return;

        int middle = array[(low + high) / 2];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < middle) i++;

            while (array[j] > middle) j--;

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (i < high) sortRec(array, i, high);

        if (j > low) sortRec(array, low, j);
    }
}
