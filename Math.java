public class Math {
    public static void main(String[] args) {
        int num1 = 10, num2 = 5, num3 = 3;
        System.out.println(num1 + num2 + num3);    

        int result = num1 + num2;
        System.out.println(result);    

        result = num1 - num2;
        System.out.println(result);    

        result = num1 * num2;
        System.out.println(result);    

        //int result = num1 / 0;
        // never divide by 0
        result = num1 / num2;
        System.out.println(result);    

        result = num1 / num3; // this is 10 / 3 => 3.3 but since result is "int" the fraction gets dropped;
        System.out.println(result);    
    }
    
}
