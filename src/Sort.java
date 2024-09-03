import java.util.ArrayList;

public class Sort {

    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }

    public static String[] bubbleSort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length-i; j++) {
                if (array[j-1].toLowerCase().compareTo(array[j].toLowerCase()) > 0) {
                    String temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list) {
        for (int i = list.size()-2; i >= 0; i--) {
            for (int j = i; j < list.size()-1; j++) {
                if (list.get(j) > list.get(j+1)){
                    int temp = list.set(j+1, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;

    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minInd = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < array[minInd]) {
                    minInd = j;
                }
            }
            int temp = array[i];
            array[i] = array[minInd];
            array[minInd] = temp;
        }
        return array;

    }

    public static String[] selectionSort(String[] array) {
        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j].toLowerCase().compareTo(array[min].toLowerCase()) < 0) {
                    min = j;
                }
            }
            String temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
        return array;
    }

    public static ArrayList<String> selectionSort(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            int min = i;
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(j).toLowerCase().compareTo(list.get(min).toLowerCase()) < 0) {
                    min = j;
                }
            }
            String temp = list.set(i, list.get(min));
            list.set(min, temp);
        }
        return list;

    }

}
