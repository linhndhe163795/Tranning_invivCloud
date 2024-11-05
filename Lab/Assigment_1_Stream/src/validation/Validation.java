package validation;

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
    public int checkInputInRange(int min, int max)
    {
        while (true) {
            try{
                int input = Integer.parseInt(sc.nextLine());
                if(input < min || input > max){
                    System.out.println("Please enter a number between " + min + " and " + max);
                }else {
                    return input;
                }
            }catch (Exception e){
                System.out.println("Please enter a number between " + min + " and " + max);
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
    public double checkInputIsInteger() {
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine());
                if (input < 0) {
                    System.out.println("Please enter a positive number");
                }else{
                    return input;
                }
            }catch (Exception e){
                System.out.println("Please enter a integer");
            }
        }
    }
    public boolean checkInputIsYesOrNo()
    {
        while (true) {
            try {
                String input = (sc.nextLine());
                if(input.equalsIgnoreCase("y")){
                    return true;
                }else{
                    return false;
                }
            }catch (Exception e){
                System.out.println("Please enter a double");
            }
        }

    }
}
