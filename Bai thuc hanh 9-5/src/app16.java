import java.util.ArrayList;

public class app16 {
    public static void main(String[] args) {
        // khai bÃ¡o1ArrayList cÃ³ tÃªn lÃ  arrlistString
        // cÃ³ kiá»ƒu lÃ  String
        ArrayList<String> arrListString = new ArrayList<>();
        // thÃªm cÃ¡c pháº§n tá»­ sá»­ dá»¥ng phÆ°Æ¡ng thá»©c add()
        arrListString.add("JAVA");
        arrListString.add("PHP");
        arrListString.add("C#");
        arrListString.add("C++");
        // duyá»‡t theo kÃ­ch thÆ°á»›c cá»§a arrlistString
        // sá»­ dá»¥ng vÃ²ng láº·p for thÃ´ng thÆ°á»�ng
        // phÆ°Æ¡ng thá»©c arrListString.size() sáº½ tráº£ vá»� sá»‘ pháº§n tá»­ cá»§a arrListString
        // vÃ  sau Ä‘Ã³ láº¥y pháº§n tá»­ tai vá»‹ trÃ­ thá»©ithÃ´ng qua hÃ m get()
        // sau Ä‘Ã³ hiáº¿n thá»‹ giÃ¡ trá»‹ pháº§n tá»­ Ä‘Ã³ ra
        System.out.println("CÃ¡c pháº§n tá»­ cÃ³ trong arrListString lÃ : ");
        for (int i = 0; i < arrListString.size(); i++) {
            System.out.print(arrListString.get(i) + "\t");
        }
    }
}