import java.util.Scanner;

public class Example18 {
    public static void main(String[] args){

        double price,hour,gross,net,taxes;
        Scanner inputValue;
        inputValue = new Scanner(System.in);

        System.out.println("Enter price per hour:");
        hour = inputValue.nextDouble();
        System.out.println("Enter number of hours:");
        price = inputValue.nextDouble();

        if (hour <= 35) {
            gross = price * hour;
        } else {
            gross = 35 * price + (hour - 35) * price * 1.5;
        }
        if (gross > 900) {
            taxes = (gross - 900) * 0.45 + 400 * 0.25;
            net = gross - taxes;
        } else if (gross > 500) {
            taxes = (gross - 500) * 0.25;
            net = gross+ taxes;
        } else {
           taxes = 0;
            net = gross;
        }
        System.out.println("Gross: " +gross);
        System.out.println("Net: " + net);
        System.out.println("Taxes: " + taxes);
    }

}
