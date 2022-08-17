import java.util.ArrayList;
import java.util.Collections;

public class RotateCollection{
	public static void main(String[] args) {
		ArrayList<Integer> List1=new ArrayList<>();
		List1.add(45);
		List1.add(32);
		List1.add(95);
		List1.add(43);
		List1.add(89);
		Collections.rotate(List1, 3);
		System.out.println(List1);
	}
}
