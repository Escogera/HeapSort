public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 6, 7, 2, 6, 8, 9, 3, 6, 2, 4 };
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
        HeapSort.sort(array);
        for (int item : array) {
            System.out.print(item + " ");
        }

    }

}