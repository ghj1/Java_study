// while문 연습
// while 문을 사용해 1 ~ 100까지의 자연수 중 3의 배수의 합을 구해 보자.
public class Try_While {
    public static void main(String[] args) {
        int a = 0;
        int i = 1;
        int re = 0;
        while (a < 99){
            a = i * 3;
            re = re+a;
//            System.out.println(a);
            i ++;
        }
        System.out.println(re);
    }
}

// another results
//public class Try_While {
//    public static void main(String[] args) {
//        int res = 0;
//        int j = 1;
//        while(j <= 100) {
//            if (j % 3 ==0){
//                res += j;
//            }
//            j += 1;
//        }
//        System.out.println(res);
//    }
//}
//
