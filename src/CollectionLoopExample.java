import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionLoopExample {
    public static void main(String[] args) {

        Set<String> foods = new HashSet<>();
        //List<String> foods = new ArrayList<>();

        foods.add("피자");
        foods.add("치킨");
        foods.add("고구마말랭이");

        if(foods.size() == 0){
            System.out.println("목록이 비어있습니다.");
        }else{
            System.out.println("총" + foods.size() + "개의 음식 목록이 있습니다.");
        }
        // 반복해 출력
//        for (String food : foods){
//            System.out.println(food + "맛있어요");
//        }
    }
}
