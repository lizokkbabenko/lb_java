public class lb5 {
    public static class Task1 {
        public static void main(String[] args) {
            int decimalValue = 51966;
            String hexString = intToHexString(decimalValue);
            System.out.println("Result: " + hexString);
        }


        private static String intToHexString(int i) {
            return Integer.toHexString(i).toUpperCase();
        }
    }

    public static class Task2 {
        public static void main(String[] args) {
            String sentence = "The and user with the nickname koala757677 this month left 3 times more " +
                    "comments than the user with the nickname croco181dile181920 4 months ago";

            int wordCount = countWords(sentence);
            System.out.println("Result: " + wordCount);
        }


        private static int countWords(String sentence) {

            String[] words = sentence.split("\\s+");
            return words.length;
        }
    }
}
