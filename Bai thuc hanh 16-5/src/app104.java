import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class app104 {
	public static void main(String[] args) {
		TreeMap<Integer, Character> treemap=new TreeMap<>();
		treemap.put(6,'A');
		treemap.put(5,'B');
		treemap.put(1,'C');
		treemap.put(2,'D');
		treemap.put(8,'E');
		Set<Entry<Integer,Character>> settreemap=treemap.entrySet();
		System.out.println("cac entry co trong settreemap la: ");
		System.out.println(settreemap);
	}
}
