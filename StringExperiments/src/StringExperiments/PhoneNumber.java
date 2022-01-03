package StringExperiments;

import java.util.Scanner;

public class PhoneNumber {
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        String number = ad.nextLine();
        String newText = number.replaceAll("[^0-9]", "");
        System.out.print("+7"+"("+newText.charAt(1)+
                newText.charAt(2)+newText.charAt(3)+")"+
                newText.charAt(4)+newText.charAt(5)+
                newText.charAt(6)+"-"+newText.charAt(7)+
                newText.charAt(8)+"-"+newText.charAt(9)+
                newText.charAt(10));
    }
}
