package numbers;

public class TotalCost {

    public static void main(String[] args) {
        int laptopPrice = Integer.parseInt(extractDigits("A core i 7 laptop price is 85000 tk"));
        int mousePrice = Integer.parseInt(extractDigits("a gaming mouse price is 2500 tk"));
        int totalPrice = laptopPrice + mousePrice;
        int discount = (int) (totalPrice * 0.15);
        int finalPrice = totalPrice - discount;
        System.out.println("The total cost is: " + finalPrice);
    }

    private static String extractDigits(String text) {
        String digits = "";
        for (char ch : text.toCharArray()) {
            if (Character.isDigit(ch)) {
                digits += ch;
            }
        }
        return digits;
    }
}


