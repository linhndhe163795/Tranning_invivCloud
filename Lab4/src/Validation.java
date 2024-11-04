import java.util.Scanner;

public class Validation {
    Scanner sc = new Scanner(System.in);
    public String checkInputIsString() {
        while (true) {
            try {
                String input = sc.nextLine();
                if(input.equals("")){
                    System.out.println("Please enter a string");
                }else{
                    return input;
                }
            } catch (Exception ex) {
                System.out.println("Please enter a string");
            }
        }
    }

    public double checkInputIsDouble() {
        while (true) {
            try {
                double input = Double.parseDouble(sc.nextLine());
                if (input < 0) {
                    System.out.println("Please enter a positive number");
                }else{
                    return input;
                }
            }catch (Exception e){
                System.out.println("Please enter a double");
            }
        }
    }

}
