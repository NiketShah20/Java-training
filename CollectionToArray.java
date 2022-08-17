import java.util.ArrayList;

public class CollectionToArray {
	public static void main(String[] args) {
		ArrayList<Integer> ar1=new ArrayList<>();
		ar1.add(99);
		ar1.add(100);
		ar1.add(101);
		Object []ar3=ar1.toArray();
		for(int i=0;i<ar3.length;i++) {
			System.out.println(ar3[i]);
		}
	}
}
