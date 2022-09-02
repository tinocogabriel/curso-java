package generics;

import java.util.TreeSet;

public class ComparableTeste {
	public static void main(String[] args) {
		TreeSet<Integer> nums = new TreeSet<>();
		
		nums.add(1432);
		nums.add(13);
		nums.add(1455);
		nums.add(134);
		nums.add(1222);
		nums.add(14364);
		nums.add(143);
		
		for(Integer n: nums) {
			System.out.println(n);
		}
	}
}
