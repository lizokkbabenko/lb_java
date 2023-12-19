public class lb4 {
    public static void main(String[] args) {

        byte[] byteArray = {5, 2, 8, 1, 3};


        bubbleSort(byteArray.clone());
        System.out.println("Bubble Sort Result: " + byteArrayToString(byteArray));


        selectionSort(byteArray.clone());
        System.out.println("Selection Sort Result: " + byteArrayToString(byteArray));
    }


    private static void bubbleSort(byte[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {

                    byte temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }


    private static void selectionSort(byte[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            byte temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }


    private static String byteArrayToString(byte[] arr) {
        StringBuilder result = new StringBuilder();
        for (byte value : arr) {
            result.append(value).append(" ");
        }
        return result.toString();
    }
}
