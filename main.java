package Day3PracticeProblem_EmployeeWage;

import java.util.Random;

public class main {
    public static void main(String[] args) {

        int wagePerHour = 20;
        int fullDayHour = 8;
        System.out.println("welcome to employee wage");
        Random random = new Random();

        int presenty = random.nextInt(3);
        System.out.println(presenty);
        if (presenty == 1) {
            System.out.println("present");
             wagePerHour = 20;
             fullDayHour = 8;
        } else if(presenty ==2) {
            System.out.println("absent");
            wagePerHour = 0;
            fullDayHour = 0;
        }else {
            System.out.println("partTime");
            wagePerHour = 20;
            fullDayHour = 4;
        }
        int dailyWage = wagePerHour*fullDayHour;
        System.out.println("Daily wage of the employe is:"+dailyWage);
    }
}
