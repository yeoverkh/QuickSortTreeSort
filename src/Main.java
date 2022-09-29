import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, -1, 2, 10, 6, 8};
        //QuickSort.sort(array);
        TreeSort.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
