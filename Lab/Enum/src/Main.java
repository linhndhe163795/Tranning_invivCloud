import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Nhập giá tri: ");
            int option = scanner.nextInt();
            for (int i = 0; i < EmployeeTypeEnum.values().length; i++) {
                if (option == EmployeeTypeEnum.values()[i].getValue()) {
                    System.out.println("Giá trị: " + option + " là: " + EmployeeTypeEnum.values()[i].name());
                    return;
                }
            }
            System.out.println("Giá trị không hợp lệ");
        }
    }
}