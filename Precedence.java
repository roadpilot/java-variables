public class Precedence {
    public static void main(String[] args) {
        int j = 4;
        System.out.println(j);

        j++;
        System.out.println(j);

        j--;
        System.out.println(j);

        int c = 25 - j * 4 / 2 - 10 + 4; // left to right implicit, => 11
        c = (25 - ((j * 4) / 2) - 10) + 4; // left to right forced order of prec => 11
        c = ((25 - j) * 4) / (2 - 10 + 4); // forced order of prec => -21
        System.out.println(c);
    }
}
