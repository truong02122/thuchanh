import java.util.ArrayList;
import java.util.Scanner;

public class app24 {
public static void main(String[] args) {
        ArrayList<Integer> arrListInteger=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number; // pháº§n tá»­ cá»§a máº£ng

        System.out.println("Nháº­p sá»‘ pháº§n tá»­ cá»§a ArrayList: ");
        int n = scanner.nextInt();
       // nháº­p vÃ  thÃªm pháº§n tá»­ cho ArrayList
        for (int i = 0; i < n; i++){
            System.out.print("Nháº­p pháº§n tá»­ thá»©" + i + ":");
            number = scanner.nextInt();
            arrListInteger.add(number);
        }
       // tÃ¬m pháº§n tá»­ lá»›n nháº¥t trong máº£ng sá»­ dá»¥ng phÆ°Æ¡ng thá»©c compareTo()
       // giÃ¡ sá»­ pháº§n tá»« lá»›n nháº¥t lÃ  pháº§n tá»­ Ä‘áº§u tiÃªn trong ArrayList
        int max = arrListInteger.get(0);

        for (int i = 1; i < arrListInteger.size(); i++){
        // náº¿u káº¿t quáº£ cá»§a phÃ©p so sÃ¡nh nÃ y lá»›n hÆ¡ne
        // tá»©c biáº¿n max nhá»� hÆ¡n pháº§n tá»­ táº¡i vá»‹ trÃ­ thá»©itrong ArrayList
        // thÃ¬ gÃ¡n max=pháº§n tá»« táº¡i vá»‹ trÃ­i
        // vÃ  Ä‘Ã³ chÃ­nh lÃ  pháº§n tá»­ lá»›n nháº¥t
            if (arrListInteger.get(i).compareTo(max) > 0){
                max = arrListInteger.get(i);
            }
        }
        System.out.println("Pháº§n tá»­ lá»›n nháº¥t trong arrListInteger = "+ max);
}
}