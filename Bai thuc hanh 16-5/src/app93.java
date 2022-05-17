import java.util.LinkedHashMap;
import java.util.Set;
public class app93 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<>();
		lhm.put(1, "JAVA");
		lhm.put(2, "JAVA");
		lhm.put(3, "JAVA");
		lhm.put(4, "JAVA");
		System.out.println(" before remove");
		show(lhm);
		lhm.remove(2);
		System.out.println(" after remove");
		show(lhm);
	}

	private static void show(LinkedHashMap<Integer, String> lhm) {
		Set<Integer> keyset=lhm.keySet();
		for(Integer key: keyset) {
			System.out.println(key+""+lhm.get(key));
		}
	}
}
