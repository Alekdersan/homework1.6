package ru.skypro;

public class Main {

    public static void main(String[] args) {
// Создаем в методе main ссылки заданий на их решения
        task1(); // сумма затрат за месяц
        task2(); // минимальная и максимальная трата в день
        task3(); // средняя сумма затрат за месяц
        task4(); // распечатать ФИ в корректном порядке
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.println("Сумма затрат за месяц составила " + sum + " рублей.");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int minExpen = arr[0];
        int maxExpen = arr[0];
        for (int j : arr) {
            if (j > maxExpen) {
                maxExpen = j;
            }
            if (j < minExpen) {
                minExpen = j;
            }
        }
        System.out.println("Максимальная сумма затрат за день " + maxExpen + " рублей.");
        System.out.println("Минимальная сумма затрат за день " + minExpen + " рублей.");
    }

    public static void task3() {
        int[] arr = generateRandomArray();
        float sum = 0;
        for (int j : arr) {
            sum += j;
        }
        float average = sum / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}

