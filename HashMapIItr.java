import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapIItr {
	public static void main(String[] args) {
		HashMap<Integer, String> hmap=new HashMap<>();
		hmap.put(1, "Vadodara");
		hmap.put(2, "Ahmedabad");
		hmap.put(3, "surat");
		Set<Map.Entry<Integer, String>> set=hmap.entrySet();
		Iterator<Map.Entry<Integer, String>> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
			System.out.print(entry.getValue()+ " ");
			System.out.println(entry.getKey());
			
		}
		
	}
}
