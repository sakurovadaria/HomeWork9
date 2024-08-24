public class Main {
    public static void main(String[] args) {
//
        System.out.println("Task 1");
        int[] salaryArray = {350, 400, 320, 780, 565};
        int totalSalary = 0;
        for (int salary : salaryArray) {
            totalSalary += salary;
        }
        System.out.println("Сумма трат за месяц составила " + totalSalary + " рублей");
        System.out.println();

        System.out.println("Task 2");
        int maxSalary = salaryArray[0];
        int minSalary = salaryArray[0];
        for (int salary : salaryArray) {
            if (salary > maxSalary){
                maxSalary = salary;
            } else if (salary < minSalary){
                minSalary = salary;
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + maxSalary + " рублей.");
        System.out.println("Минимальная сумма трат за неделю составила " + minSalary + " рублей.");

        System.out.println("Task 3");
        int averageSalary = totalSalary / salaryArray.length;
        System.out.println("Средняя сумма трат за месяц составила " + averageSalary + " рублей");

        System.out.println("Task 4"); //первое решение
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int length = reverseFullName.length;
        for (int i = 0; i < length / 2; i++) {
            char cash = reverseFullName[i];
            reverseFullName[i] = reverseFullName[length - 1 - i];
            reverseFullName[length - 1 - i] = cash;
        }
        System.out.print(reverseFullName);
        System.out.println();

        System.out.println("Task 4.0"); //второе решение
        char[] reverseFullName0 = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName0.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName0[i]);
        }
    }
}