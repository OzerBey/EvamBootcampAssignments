import java.util.Scanner;

public class Assignment {

    static String str = "code";
    static String[] array = { "Java", "Spring ", "code", "Assignment", "Ozer" };

    public static void main(String[] args) {
        String s1 = "Welcome";
        String s2 = "Welcome";
        String s3 = "Welcome";
        // 3 Farklı nesne referansı tutar.

        // instance exmaple
        String str = new String("Welcome");
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // true
        System.out.println(s1 == str); // false
        System.out.println(s1.equals(s2));// true - with equals method

        // --- User inputs
        Scanner scan = new Scanner(System.in);
        String[] inputArr = new String[5];
        // load datas
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a string value: ");
            String userInput = scan.nextLine();
            inputArr[i] = userInput;
        }
        scan.close();
        // check if the string is in the array
        System.out.println(isContains(inputArr));

    }

    public static String isContains(String[] strArr) {
        String resultStr = "";
        for (String item : strArr) {
            if (item.contains("code")) {
                resultStr = item;
            }
        }
        return resultStr == "" ? "Not found" : "Tanimli value'yi iceren String deger: " + resultStr;
    }
}