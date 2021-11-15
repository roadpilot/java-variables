public class Numerics {
    public static void main(String[] args) {
        int lowest = -2_147_483_648;        
        int highest = 2_147_483_647;
        // int data type will accept "_" as the comma "," separator for numbers but will accept ","

        double bigDecimalValue = 374374393485673.92348773838234;
        double scientificValue = 2.345123e-22;

        System.out.println("Lowest: " + lowest);        
        System.out.println("Highest: " + highest);        

        System.out.println("bigDecimalValue: " + bigDecimalValue);        
        System.out.println("scientificValue: " + scientificValue); 

        int quantity1 = 10;
        //int quantity2 = 5.5;

        double price1 = 29.99;
        double price2 = 10; // double always has at least one trailing decimal "0" => 10.0

        double result = quantity1 * price1;
        System.out.println(result);
    }
}
