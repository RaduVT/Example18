import java.util.Scanner;

public class Example18 {
    public static void main(String[] args){

        double price,hours,gross,net,taxes;
        Scanner inputValue;
        System.out.println("Enter price per hour:");

        inputValue = new Scanner(System.in);
        price = inputValue.nextDouble();

        System.out.println("Enter number of hours:");

        hours = inputValue.nextDouble();

        if (hours <= 35){
            gross = price * hours;
        } else {
            gross = 35 * price + (hours - 35) * price * 1.5;
        }
        if (gross > 900) {
            taxes = (gross - 900) * 0.45 + 400 * 0.25;
        } else if (gross > 500) {
            taxes = (gross - 500) * 0.25;
        } else {
            net = gross;
        }
        System.out.println("Salary: " +gross);
    }

}
