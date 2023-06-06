import java.util.Random;
import java.util.Scanner;

public class UpAndDownWithMethod {
    public static int randomNumber;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();
        randomNumber = random.nextInt(256);

        int attempt = 0;

        while (attempt < 8){
            boolean inCorrect = play();

            if(inCorrect){
                break;
            }

            attempt = attempt + 1;
            System.out.println(attempt + "회 시도 했습니다.");
        }
        System.out.println("게임을 종료합니다.");
    }
    public static boolean play(){
        System.out.println("숫자를 입력하세요");
        int input = scanner.nextInt();

        if (input == randomNumber){
            System.out.println("정답입니다.");
            return  true;
        } else if(input > randomNumber){
            System.out.println("더 작은 숫자입니다.");
        }else{
            System.out.println("더 큰 숫자입니다.");
        }
        return false;
    }
}
