import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> listNumber = new ArrayList<>();
        while(true) {
            try{
                System.out.println("Enter number: ");
                double number = Double.parseDouble(sc.nextLine());
                listNumber.add(number);
                System.out.println("Do you want countinue (Y/N)");
                String stop = sc.nextLine();
                if(stop.equalsIgnoreCase("N")) {
                    break;
                }
            }catch (Exception e){
                System.err.println("input is a number, please input again!");
            }
        }
        double sum = 0;
        for(double i : listNumber){
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }
}