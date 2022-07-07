package exmp;

import java.util.Arrays;
import java.util.List;

public class FindMinValue {
public static void main(String[] args) {
	Integer arr[] = {8,4,6,2,3} ;
	Arrays.asList(arr);
	List<Integer> list = Arrays.asList(arr);
	Integer minValue =findMin(list);
	//System.out.println(minValue);
	resultArray(arr,minValue);
	
	 
}
public static Integer findMin(List<Integer> list)
{
    return list.stream()                // Stream<Integer>
                .min(Integer::compare)  // Optional<Integer>
                .get();                 // Integer
}

public static void resultArray(Integer arr[],Integer minValue) {
	
	for(int i=0;i<arr.length;i++) {
		Integer val = arr[i]-minValue;
		if(val>=minValue) {
			arr[i]=val;
			//System.out.println("if"+val+" i:"+i);
		}else {
			arr[i]=arr[i];
			//System.out.println("else"+arr[i]+" i:"+i);
		}
	}
	
		//resultArray(arr);
}
}
