package strings;

public class ExtractOTP {

    public static void main(String[] args) {
        String sms = "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S";
        String otp = sms.substring(sms.indexOf("is") + 3, sms.indexOf("."));
        System.out.println("OTP: " + otp);
    }
}

