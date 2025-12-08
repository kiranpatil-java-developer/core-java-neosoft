package stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test2 {
	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c', 'a', 'd', 'a', 'b', 'a', 'c', 'c', 'c' };

		System.out.println(String.valueOf(arr));

		List<Character> collect = String.valueOf(arr).chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > 3).map(e -> e.getKey()).collect(Collectors.toList());
		System.out.println(collect);

		int[] intArr = { 10, 20, 30, 10, 40, 10, 20, 10 };
		// Find the index of integer
		int target = 40;

//		Integer orElse = Arrays.stream(intArr).boxed().filter(n -> target == n).findFirst().orElse(-1);
//		System.out.println(orElse);

		int asInt = IntStream.range(0, intArr.length).filter(n -> target == intArr[n]).findFirst().getAsInt();
		System.out.println(asInt);
		
		

	}
}
