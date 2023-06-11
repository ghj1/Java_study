// while문 또는 for문을 사용해 별울 표시하는 프로그램 작성

public class Try_while02 {
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//public class Try_while02 {
//    public static void main(String[] args) {
//        for (int i = 5; i > 0; i --){
//            for(int j = 0; j < i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

//public class Try_while02 {
//    public static void main(String[] args) {
//        for (int i = 1; i < 6; i++){
//            for (int j= 5; j > 0; j --) {
//                if (i < j) {
//                    System.out.print(" ");
//                } else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//    }
//}