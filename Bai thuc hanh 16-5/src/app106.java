import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class app106 {
	public static void main(String[] args) {
		TreeMap<Integer, Double> t1=new TreeMap<>();
		t1.put(1, 9d);
		t1.put(4, 10.d);
		t1.put(2, 7.2d);
		t1.put(8, 20.28d);
		System.out.println("cac phan tu co trong t1 la: ");
		Set<Map.Entry<Integer,Double>> settreemap=t1.entrySet();
		System.out.println(t1);
		t1.replace(4, 20.11d);
		t1.replace(2, 7.2d,7.7d);
		System.out.println("cac phan tu co trong t1 sau khi thay the: ");
		settreemap=t1.entrySet();
		System.out.println(settreemap);
}
}
