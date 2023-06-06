public class FunctionExample {
    public static void main(String[] args) {
       sayHello();
       sayHelloTo("Chicken");
       printSum(2,3);
       int result = sum(2,4);
       System.out.println(result);

       int[] sumAndProduct = addAndMultiply(2,3);
        System.out.println("sum: " + sumAndProduct[0]);
        System.out.println("product: " + sumAndProduct[1]);
    }

    public static int[] addAndMultiply(int a, int b){
        int sum = a + b;
        int product = a * b;

        int[] result = {sum, product};
        return result;
    }
    public static int sum (int a, int b) {
        return  a+b;
    }
    // a+b = result 형태의 덧셈을 출력
    public static void printSum(int a, int b) {
        System.out.println(a + "+" + b+ "=" + (a+b));
    }
    public static void sayHelloTo(String name){
        System.out.println("Hello, " + name);
    }
    public static void sayHello(){
        System.out.println("Hello.");
    }
}
