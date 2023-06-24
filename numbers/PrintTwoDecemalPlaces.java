package numbers;

public class PrintTwoDecemalPlaces {
    public static void main(String[] args) {
        double a = 15.52726;
        String formatedValue = String.format("%.2f", a);
        System.out.println("a=" + formatedValue);
    }
}
