package d12StringManipulation;

public class StringManipulation02_IndexOf {

    public static void main(String[] args) {
        String cardNum = "123 6789 1234 6789";
        String lastDigits = cardNum.substring(cardNum.length() - 4);
        String privacy = cardNum.substring(0, cardNum.length() - 4).replaceAll("\\d", "*");
        System.out.println(privacy + lastDigits);
    }
}

