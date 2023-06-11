public class Star {
    public static void main(String[] args) {
        for(int i = 0; i <= 3; i++) {
            for (int j = i; j <= 2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
