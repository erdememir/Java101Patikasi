package Homework;

public class DuplicateEvenNumberFinder {
    static boolean isSame(int arr[], int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {5, 10, 15, 20, 25, 30, 35, 40, 5, 10, 15, 20, 25, 30, 35, 40};
        int[] dupList = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] % 2 == 0) {
                    if ((i != j) && (list[i] == list[j])) {
                        if (!isSame(dupList, list[i])) {
                            dupList[startIndex++] = list[i];
                        }
                        break;
                    }
                }
            }
        }
        System.out.print("[ ");
        for (int value : dupList) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
        System.out.print("]");
    }
}