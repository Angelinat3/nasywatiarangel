public class ExampleOperator23 {
    public static void main(String[] args) {
        int x =10;
        System.out.println("initial value of x ="+x);
        System.out.println("x++ = "+ x++);
        System.out.println("after evaluation, x ="+x);

        x = 10;

        System.out.println("initial value of x ="+x);
        System.out.println("++x = "+ ++x);
        System.out.println("after evaluation, x ="+x);
     
    int y = 12;
    System.out.println(x>y | y== x && y <= x);

    int z = x ^ y;
    System.out.println("the result od x ^ y is"+z);

    z%=2;
    System.out.println("the final result is" + z);

    
    
    
    
    }
}
