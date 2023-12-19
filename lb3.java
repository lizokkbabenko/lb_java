public class lb3 {
    public static class Task1 {
        public static void main(String[] args) {

            int[] array = {1, 2, 5, -3, -1, -4, 2, 5, 8};


            int positiveCount = countPositiveElements(array);


            System.out.println("The number of positive elements in the array is: " + positiveCount);
        }


        private static int countPositiveElements(int[] array) {
            int count = 0;
            for (int element : array) {
                if (element > 0) {
                    count++;
                }
            }
            return count;
        }
    }

    public static class Task2 {
        public static void main(String[] args) {
                   int[] array = {1, 2, 5, -3, -1, -4, 2, 5, 8};

                    int[] result = findMinPositiveElement(array);

                   System.out.println("Sum of the minimum positive element and its index: " + result[0] +
                    ", index: " + result[1]);
        }

           private static int[] findMinPositiveElement(int[] array) {
            int minPositive = Integer.MAX_VALUE;
            int minPositiveIndex = -1;

            for (int i = 0; i < array.length; i++) {
                int element = array[i];
                if (element > 0 && element < minPositive) {
                    minPositive = element;
                    minPositiveIndex = i;
                }
            }

            int[] result = {minPositive + minPositiveIndex, minPositiveIndex};
            return result;
        }
    }

    public static class Task3 {
        public static void main(String[] args) {
            // Задано масиви A та B (можна змінити значення за необхідності)
            int[] A = {2, -3, 5, -1, 8};
            int[] B = {1, 4, -2, 3, -6};

            // Знаходимо мінімальну довжину масивів A та B (щоб уникнути виходу за межі масиву)
            int n = Math.min(A.length, B.length);

            // Ініціалізуємо масив C з нулів
            int[] C = new int[n];

            // Формуємо масив C
            for (int i = 0; i < n; i++) {
                if (A[i] > 0 && B[i] > 0) {
                    // Сума відповідних елементів A та B, якщо обидва елементи додатні
                    C[i] = A[i] + B[i];
                } else if (A[i] < 0 && B[i] < 0) {
                    // Добуток відповідних елементів A та B, якщо обидва елементи від'ємні
                    C[i] = A[i] * B[i];
                } else {
                    // В інших випадках елемент масиву C дорівнює нулю
                    C[i] = 0;
                }
            }

            // Виводимо масив C
            System.out.print("Array C: ");
            for (int element : C) {
                System.out.print(element + " ");
            }
        }
    }
}
