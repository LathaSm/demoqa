package intquestions;

import java.util.*;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float f[]= {3.14f,2.12f,1.11f,4.56f,3.56f};
		
		List<Float> list = new ArrayList<Float>();
		
		for(float fr:f) {
			list.add(fr);
		}
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
		
		
	}

}
