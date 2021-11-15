public class Default {
    // main method
    public static void main(String[] args){
        String address = "123 Foo";
        String customer;
        String city;
        String zip = "12345", country = "USA";

        customer = "Steve";
        city = "Rockwell";
        String region = city;
        String uncommon = new String("Don't do this");
        // can initialize with "new" keyword but it's non-standard

        // System.out.println(address);
        // System.out.println(customer);
        // System.out.println(city);
        // System.out.println(zip);
        // System.out.println(country);
        // System.out.println(region);

        // concatenation with "+"
        // System.out.println(city + " " + zip);

        // indexOf
        String ipAddress = "192.168.0.1";
        int index1 = ipAddress.indexOf('.');
        System.out.println("The index of '.' is " + index1);

        int index2 = ipAddress.indexOf('.', index1 + 1);
        System.out.println("The second index of '.' is " + index2);

        // using "byte" for octet of ip address
        // start location is inclusive, stop location of substring is not inclusive
        String secondByte = ipAddress.substring(index1 +1 , index2);
        System.out.println("Second byte of the ip address is: " + secondByte);

        int quantity1 = 5;
        String items = "cables";
        double price = 3.99;

        String message = customer + " ordered " + quantity1 + " " + items + " at $" + price + ".";
        System.out.println(message);
        System.out.println("The total was: " + quantity1 * price);

        message = "One more: " + quantity1 + 1; // order of precedence makes this output "51"
        System.out.println(message);

        message = "One more: " + (quantity1 + 1); // order of precedence makes this output "6"
        System.out.println(message);

    }   
}