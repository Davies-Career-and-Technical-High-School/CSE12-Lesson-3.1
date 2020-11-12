import java.util.Scanner;

class IfExamples {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        int numberWheels = 0;
       
        System.out.println("How many wheels does the vehicle have?");
       
        numberWheels = scan.nextInt();
       
        if (numberWheels == 2)
            System.out.println("It is a scooter");

    }
}