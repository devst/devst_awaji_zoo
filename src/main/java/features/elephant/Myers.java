package features.elephant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Myers implements features.Myers {

	@Override
	public String getName(int i, int j, int k) {

		if(i <= 0 || j <= 0 || k <= 0){
			throw new RuntimeException();
		}
		
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(i,j,k));
		Collections.sort(list);
		if(list.get(0) + list.get(1) <= list.get(2)){
			throw new RuntimeException();
		}
		
		if(i == j && j == k){
			return "正三角形";
		}else if (i == j || i == k || j == k){
			return "二等辺三角形";
		}
		return "不等辺三角形";
	}
	
	

}
