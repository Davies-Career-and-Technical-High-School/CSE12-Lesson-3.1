import java.util.Scanner;

class Conditions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        System.out.println("Please enter your grade: ");
       
        double grade = scan.nextDouble();
       
        if (grade <= 59.4)
        {  
            System.out.println("failing");
        }

    }
}