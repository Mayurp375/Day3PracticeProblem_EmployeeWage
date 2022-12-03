package Day3PracticeProblem_EmployeeWage;

import java.util.Random;

public class main {
    public static void main(String[] args) {

        int wagePerHour = 20;
        int fullDayHour = 8;
        int forMonth = 20;
        System.out.println("welcome to employee wage");
        //Random class
        Random random = new Random();

        //object of the random
        int presenty = random.nextInt(3);
        switch (presenty) {
            //switch case
            case 1:
                System.out.println("present");
                wagePerHour = 20;
                fullDayHour = 8;
                break;
            case 2:
                System.out.println("absent");
                wagePerHour = 0;
                fullDayHour = 0;
                break;
            default:
                System.out.println("partTime");
                wagePerHour = 20;
                fullDayHour = 4;
        }
        int dailyWage = wagePerHour * fullDayHour;
        forMonth = forMonth*dailyWage;
        System.out.println("Daily wage of the employe is:" + dailyWage);
        System.out.println("Monthly wage of the employe is:" + forMonth);

    }
}