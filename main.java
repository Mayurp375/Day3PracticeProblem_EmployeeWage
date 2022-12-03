package Day3PracticeProblem_EmployeeWage;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage");

        Random random = new Random();

        int presenty = random.nextInt(2);
        if(presenty >= 1){
            System.out.println("present");
        }else{
            System.out.println("absent");
        }
    }
}
