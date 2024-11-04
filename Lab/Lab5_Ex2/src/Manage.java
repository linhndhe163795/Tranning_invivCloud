import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Manage {
    public void xuat(ArrayList<String> listName){
       for(String name : listName){
           System.out.println(name);
       }
    }
    public void ngaunhien(ArrayList<String> listName){
        Collections.shuffle(listName);
        for(String name : listName){
            System.out.println(name);
        }
    }
    public void sapxep(ArrayList<String> listName){
        Collections.sort(listName);
        Collections.reverse(listName);
        for(String name : listName){
            System.out.println(name);
        }
    }
    public void xoa(ArrayList<String> listName, String nameRemove)
    {
       for(int i = 0; i < listName.size(); i++){
           if(listName.get(i).equals(nameRemove)){
               listName.remove(i);
           }
       }
        System.out.println("xóa thành công");
    }
    public boolean KiemTraTonTaiTen(ArrayList<String> listName, String name)
    {
        for(String ten: listName){
            if(ten.equals(name)){
                return true;
            }
        }
        return false;
    }
    public ArrayList<String> nhap(){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> listName = new ArrayList<>();
        while (true){
            System.out.println("Enter a name: ");
            String name = sc.nextLine();
            if(name == null){
                System.err.println("Input name: ");
                continue;
            }
            listName.add(name);
            System.out.println("Có muốn tiếp tục nhập thêm không: (Y/N)");
            String input = sc.nextLine();
            if(input.equalsIgnoreCase("N")){
                break;
            }
        }
        return listName;
    }
    public void  menu(){
        System.out.println("1: Nhập danh sách họ và tên ");
        System.out.println("2: Xuất danh sách vừa nhập ");
        System.out.println("3: Xuất danh sách ngẫu nhiên  ");
        System.out.println("4: Sắp xếp giảm dần và xuất danh sách ");
        System.out.println("5: Tìm và xóa họ tên nhập từ bàn phím ");
        System.out.println("6: Kết thúc ");
    }
}
