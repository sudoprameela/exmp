package exmp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class HighestDebtAmount {
	public static void main(String[] args) {
		String[] input = {"a b 2","a c 4","b a 5","c a 7"};
		Map<String , Integer> map = new HashMap<String , Integer>();
		for(int i=0; i< input.length; i++) {
			String str = input[i];
			int amount =0;
			String borrower=null;
			String lender=null;
			//System.out.println(str);
		String[] strArr = 	str.split(" ");
		for(int j=0; j<strArr.length;j++) {
			borrower= strArr[0];
			lender= strArr[1];
			amount=Integer.parseInt(strArr[2]);
			//int [] borrowerBal= map.getOrDefault(borrower, new int [] {0,0,0});
			//borrowerBal[0] += amount;
			 

			/*
			 * int [] lenderBal= map.getOrDefault(lender, new int [] {0,0,0}); lenderBal[1]
			 * += amount; map.put(lender, lenderBal);
			 */

			//System.out.println(strArr[j]);
		}
		List l1= new ArrayList<>();
		if(map.isEmpty()) {
			Map map1 = new HashMap<>();
			l1.add(0, map1.put(borrower, amount));
			l1.add(1, map1.put(lender, amount));
		}
		if(map.containsKey(lender)) {


		 }else {
			 amount += Integer.parseInt(strArr[2]);

		 }
		
			map.put(borrower, amount);
		}
	
		/*
		 * for(Map.Entry<String, int []> entry : map.entrySet()) { int [] bal =
		 * entry.getValue(); bal[2] = bal[1] - bal[0]; map.put(entry.getKey(), bal); }
		 * Set set = map.keySet(); Iterator it = set.iterator(); while(it.hasNext()) {
		 * int[] balance = map.get(it.next()); for(int k=0; k<balance.length; k++) {
		 * System.out.println(balance[k]);
		 * 
		 * } }
		 *//*		PriorityQueue pq = new PriorityQueue<>((a,b) -> map.get(a)[2] == map.get(b)[2] ? a.com(b) : map.get(a)[2]-map.get(b)[2] );
		for(String key : map.keySet())
		{
		pq.add(key);
		}

			List<String> res = new ArrayList<String>();
			int min = 0;
			while(!pq.isEmpty()) {
				
				String person = pq.poll();
				int [] balance = map.get(person);
				
				if(balance[2] >= 0)
					return res;
				if(min >= balance[2])
				{
					min = balance[2];
					res.add(person);
				}
			}

		   if(res.size()>=1)
		return res;
		else
		res.add("no one is in debt");
		return res ;*/
		}
	}
	

