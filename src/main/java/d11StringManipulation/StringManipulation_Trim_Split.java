package d11StringManipulation;

public class StringManipulation_Trim_Split {

    public static void main(String[] args) {
        String name = "     Mike Tyson   ";
        //String result = name.trim();
        //System.out.println(result);
        String[] parts = name.trim().split("\\s+"); // Split the string by one or more whitespace characters

        System.out.println(parts[0].charAt(0)); // Output: M
        System.out.println(parts[1].charAt(0)); // Output: T
    }
}
