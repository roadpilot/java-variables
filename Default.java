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
        System.out.println(city + " " + zip);

    }
}