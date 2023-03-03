import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
        System.out.print("Your mathematics grade is : ");
        int mG = scanner.nextInt();
        System.out.println();
        System.out.print("Your physics grade is : ");
        int pG = scanner.nextInt();
        System.out.println();
        System.out.print("Your turkish grade is : ");
        int tG = scanner.nextInt();
        System.out.println();
        System.out.print("Your chemistry grade is : ");
        int cG = scanner.nextInt();
        System.out.println();
        System.out.print("Your music grade is : ");
        int muG = scanner.nextInt();
        System.out.println();
        scanner.close();
        double average = (mG + pG + tG + cG + muG) / 5;

        if(average >= 55){
            System.out.println("Congratulations you've passed ! " + " " +
                    "Your current average is : " + " " + average);
        }else if(average < 0 && 100 > average){
            System.out.println("Please be sure you enter your grade between 0-100. ");
        }else{
            System.out.println("Unfortunately you've failed! " + " "
                    +"\n" + "Your current average is : " + " " + average);
        }

    }
}