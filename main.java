package Day3PracticeProblem_EmployeeWage;

import java.util.Random;

public class main {
    public static void main(String[] args) {

        int wagePerHour = 20;
        int dailyHour = 8;
        int totalHour = 0;
        int wage;
        System.out.println("welcome to employee wage");
        //Random class
        Random random = new Random();
        for (int i = 1; i <= 20; i++) {
            //object of the random
            int presenty = random.nextInt(3);
            switch (presenty) {
                //switch case
                case 1:
                    System.out.println("present");
                    wagePerHour = 20;
                    dailyHour = 8;
                    break;
                case 2:
                    System.out.println("absent");
                    wagePerHour = 0;
                    dailyHour = 0;
                    break;
                default:
                    System.out.println("partTime");
                    wagePerHour = 20;
                    dailyHour = 4;
            }
            totalHour = totalHour + dailyHour;
            System.out.println("total hours works"+ totalHour );
        }

        wage = totalHour * wagePerHour;
        System.out.println("months wage is" + " " + wage);
    }
}