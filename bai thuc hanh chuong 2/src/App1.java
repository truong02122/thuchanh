import java.text.DecimalFormat;
import java.util.Scanner;
 
public class App1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
        System.out.println("Nháº­p vÃ o sá»‘ thá»© nháº¥t: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Nháº­p vÃ o sá»‘ thá»© hai: ");
        int secondNumber = scanner.nextInt();
        // 1. TÃ­nh tá»•ng, hiá»‡u, tÃ­ch, thÆ°Æ¡ng, phÃ©p chia láº¥y dÆ° cá»§a 2 sá»‘ Ä‘Ã³.
        int tong = firstNumber + secondNumber;
        System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
         
        int hieu = firstNumber - secondNumber;
        System.out.println(firstNumber + " - " + secondNumber + " = " + hieu);
         
        int tich = firstNumber * secondNumber;
        System.out.println(firstNumber + " * " + secondNumber + " = " + tich);
         
        float thuong = (float) firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + 
                decimalFormat.format(thuong));  // lÃ m trÃ²n thÆ°Æ¡ng Ä‘áº¿n 2 chá»¯ sá»‘ tháº­p phÃ¢n
         
        int phanDu = firstNumber % secondNumber;
        System.out.println(firstNumber + " % " + secondNumber + " = " + phanDu);
        // 2. Sá»­ dá»¥ng cÃ¡c toÃ¡n tá»­ so sÃ¡nh Ä‘Ã£ há»�c Ä‘á»ƒ so sÃ¡nh 2 sá»‘ Ä‘Ã³.
        System.out.println("Káº¿t quáº£ so sÃ¡nh báº±ng 2 sá»‘ " + firstNumber + " vÃ  " + 
                secondNumber + " lÃ  " + (firstNumber == secondNumber));
        System.out.println("Káº¿t quáº£ so sÃ¡nh khÃ´ng báº±ng 2 sá»‘ " + firstNumber + " vÃ  " + 
                secondNumber + " lÃ  " + (firstNumber != secondNumber));
        System.out.println("Káº¿t quáº£ so sÃ¡nh lá»›n hÆ¡n 2 sá»‘ " + firstNumber + " vÃ  " + 
                secondNumber + " lÃ  " + (firstNumber > secondNumber));
        System.out.println("Káº¿t quáº£ so sÃ¡nh lá»›n hÆ¡n hoáº·c báº±ng 2 sá»‘ " + firstNumber + " vÃ  " + 
                secondNumber + " lÃ  " + (firstNumber >= secondNumber));
        System.out.println("Káº¿t quáº£ so sÃ¡nh nhá»� hÆ¡n 2 sá»‘ " + firstNumber + " vÃ  " + 
                secondNumber + " lÃ  " + (firstNumber < secondNumber));
        System.out.println("Káº¿t quáº£ so sÃ¡nh nhá»� hÆ¡n hoáº·c báº±ng 2 sá»‘ " + firstNumber + " vÃ  " + 
                secondNumber + " lÃ  " + (firstNumber <= secondNumber));
    }
}
