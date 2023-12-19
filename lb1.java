public class lb1 {
    static void Task1() {
        double a = -1.49, b = 23.4, c = 1.23, d = 2.542;
        double y = Math.sqrt(Math.abs(Math.sin(a) - (4 * Math.log(b)) / Math.pow(c, d)));
        System.out.println("Task 1: " + y);
    }

    static void Task2() {
        double a = 2.34, b = 0.756, c = 2.23, d = -1.653;
        double y = Math.abs((Math.exp(a) + 3 * Math.log(c)) / Math.sqrt(Math.pow(b, c)) / Math.abs(Math.atan(d)));
        System.out.println("Task 2: " + y);
    }

    static void Task3() {
        double a = 1.234, b = -3.12, c = 5.45, d = 2.0;
        double y = 2 * Math.sin(a) + Math.cos(Math.pow(Math.abs(b * Math.sqrt(c)), d));
        System.out.println("Task 3: " + y);
    }

    public static void main(String[] args) {
        Task1();
        Task2();
        Task3();
    }
}