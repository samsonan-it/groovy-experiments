package com.samsonan

import java.util.stream.Collectors
import java.util.stream.Stream

class UniqueValuesApp {

	static main(args) {
		
		def a = [1, 2, 3, 4, 5, 6, 7, 8, 9]
		def b = [1, 3, 5, 7, 9, 11, 13, 15]

		assert printUniqueValues(a, b) == "1,2,3,4,5,6,7,8,9,11,13,15"

		a = [9, 8, 7, 7, 7]
		b = [1, 13, 15 , 9, 1]
		
		assert printUniqueValues(a, b) == "1,7,8,9,13,15"
	}
	
	/**
	 * Написать на groovy функцию, результатом выполнения которой является строка, 
	 * содержащая уникальные значения из обоих массивов. 
	 * 
	 * В качестве разделителя значений использовать запятую.
	 */
	private static printUniqueValues(a, b) {
		// TreeSet only to make the list sorted, HashSet otherwise 
		return new TreeSet(a + b).join(",")
	}

}
