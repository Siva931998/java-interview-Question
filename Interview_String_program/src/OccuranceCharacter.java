package src;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OccuranceCharacter {

	public static void main(String[] args) {

		String inputs = "sivasundaram";
		
//		Map<String, List<String>> map = Arrays.stream(inputs.split("")).collect(Collectors.groupingBy(x -> x ));
//		Map<String, Long> map = Arrays.stream(inputs.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting() ));

//		System.out.println(map);
	
	//find the duplicate the string
	
		List<String> duplicatestring = Arrays.stream(inputs.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet().stream()
			.filter(x->x.getValue()>1)
			.map(Map.Entry::getKey)
			.collect(Collectors.toList());
	
	System.out.println(duplicatestring);
	
	
		//find the unique element in the string
	 /*
	 * List<String> uniquestring =
	 * Arrays.stream(inputs.split("")).collect(Collectors.groupingBy(Function.
	 * identity(), Collectors.counting())) .entrySet().stream()
	 * .filter(x->x.getValue()==1) .map(Map.Entry::getKey)
	 * .collect(Collectors.toList());
	 * 
	 * System.out.println(uniquestring);
	 */
		// find the first duplicate element in the string
		
		String firstduplicate = Arrays.stream(inputs.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream()
				.filter(x -> x.getValue() == 1)
				.findFirst().get().getKey();

		System.out.println(firstduplicate);
		 
		// find the secondhighest element in the string
		int[] number= {2,3,1,4,33,5,22,8,19};
		
		Integer secondhighestelement = Arrays.stream(number).boxed()
			.sorted(Comparator.reverseOrder())
			.skip(1)
			.findFirst()
			.get();
		
		System.out.println(secondhighestelement);
			
		/**find the longest string in the given array**/
		
		String[] strArray = {"java","Sql","Springboot","Microservice","Amazon webapplication"};
		
		String longeststring = Arrays.stream(strArray)
			.reduce((word1,word2)-> word1.length()>word2.length() ? word1 : word2)
			.get();
		
		System.out.println(longeststring);
		
		/**find the element in the given array who starts with 1 **/
		
		int[] array = {2,12,44,55,3,15,2,1};
		
		List<String> findelement = Arrays.stream(array)
				.boxed()
				.map(s-> s + " ")
				.filter(x->x.startsWith("1"))
				.collect(Collectors.toList());
		
		System.out.println(findelement);
		
		
		/**string.join example **/
		
		String[] numbers = {"1","2","3","4"};
		
		String result = String.join("-", numbers);
		
		System.out.println(result);
		
		
		/**skip and limit example (2,9)**/
		
		IntStream.rangeClosed(1, 10)
			.skip(1)
			.limit(8)
			.forEach(System.out::println);
		
		
		
		
		
	}

}
