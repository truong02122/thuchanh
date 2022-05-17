import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class app86 {
	public static void main(String[] args) {
		HashMap<String, String> hashmap1 =new HashMap<>();
		hashmap1.put("QNG","QUANG NGAI");
		hashmap1.put("QN","QUANG NAM");
		hashmap1.put("QN","QUANG Ninh");
		hashmap1.put("HCM","HO CHI MINH");
		System.out.println("danh sach cac thanh pho co trong hashmap1: ");
		Set<Map.Entry<String,String>> setcity=hashmap1.entrySet();
		System.out.println(setcity);
		System.out.println("QNG: "+hashmap1.get("QNG"));
		System.out.println("NT: "+hashmap1.get("NT"));
		if(hashmap1.containsValue("HO CHI MINH")){
			System.out.println("Co thanh pho ho chi minh trong map");
		}
	}
}
