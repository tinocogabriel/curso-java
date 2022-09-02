package streams;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter1 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,45,6,7,8,97,55,54,34);
		
		nums.stream()
		.filter(n -> n % 2 != 0)
		.filter(n -> n % 5 == 0)
		.forEach(System.out::println);
	}
}
