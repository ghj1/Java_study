import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample02 {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("chicken", "닭");
        dictionary.put("hippo", "하마");

        Scanner scanner = new Scanner(System.in);

        String english = scanner.nextLine();
        String korean = dictionary.get(english);

        if (korean == null) {
            System.out.println("사전에 존재하지 않는 단어입니다. ");
        } else{
            System.out.println(english+ "는" + korean + "입니다.");
        }
    }
}
