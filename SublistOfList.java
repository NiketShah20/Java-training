import java.util.ArrayList;
import java.util.Collections;

public class SublistOfList {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(34);
		list.add(2);
		list.add(5);
		list.add(6);
		list.add(34);
		ArrayList<Integer> subList=new ArrayList<>();
		subList.add(5);
		subList.add(6);
		subList.add(34);
		System.out.println(Collections.indexOfSubList(list, subList));
		System.out.println(Collections.lastIndexOfSubList(list, subList));
	}
}
