import java.util.ArrayList;

public class app17{
public static void main(String[] args){
    // khai bÃ¡o1ArrayList cÃ³ tÃªn lÃ  arrlistString
   // cÃ³ kiá»ƒu lÃ  String
    ArrayList<Integer> arrlistInteger=new ArrayList<>();
   // thÃªm cÃ¡c pháº§n tá»­ sá»­ dá»¥ng phÆ°Æ¡ng thá»©c add()
    arrlistInteger.add(0);
    arrlistInteger.add(7);
    arrlistInteger.add(1);
    arrlistInteger.add(9);
   // duyá»‡t theo kÃ­ch thÆ°á»›c cá»§a arrListInteger
   // sá»­ dá»¥ng vÃ²ng láº·p for duyá»‡t theo Ä‘á»‘i tÆ°á»£ng
   // trong Ä‘Ã³ kiá»�u dá»¯ liá»‡u cá»§a biáº¿n number
   // pháº£i trÃ¹ng vá»›i kiá»ƒu dá»¯ liá»‡u cá»§a arrlistInteger
    System.out.println("CÃ¡c pháº§n tá»­ cÃ³ trong arrListInteger lÃ : ");
for (int number : arrlistInteger){
    System.out.print(number + "\t");
}
}
}