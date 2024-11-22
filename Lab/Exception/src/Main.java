//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CustomException {
        int i = 16;

            if(i < 18 && i > 0){
                throw new CustomException("khong du tuoi");
            }
            if(i < 0){
                throw new CustomException("không được phép âm");
            }
    }
}