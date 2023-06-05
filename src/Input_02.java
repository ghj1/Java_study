import java.util.Scanner;

public class Input_02 {
    public static void main(String[] args) {
        System.out.println("숫자를 하나 입력해주세요.");
        Scanner scanner = new Scanner(System.in);
        String intInput = scanner.nextLine();
        System.out.println(intInput + 1);
    }
}
//
//    public static void main(String[] args) {
//        System.out.println("숫자를 하나 입력해주세요.");
//        Scanner scanner = new Scanner(System.in);
//        String intInput = scanner.nextLine();
//        int intValue = Integer.parseInt(intInput);
//        System.out.println(intValue + 1);}