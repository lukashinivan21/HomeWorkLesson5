package com.company;

public class Main {

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        //solution1
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        //solution2
        int maxSalary = 0;
        int minSalary = 200_001;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSalary) {
                maxSalary = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSalary) {
                minSalary = arr[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSalary + " рублей. Максимальная сумма трат за день составила " + maxSalary + " рублей.");

        //solution3

        int daysAmount = arr.length;
        float middleSalary = (float) sum / daysAmount;
        System.out.println("Средняя сумма трат за месяц составила " + middleSalary + " рублей.");

        //solution4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
