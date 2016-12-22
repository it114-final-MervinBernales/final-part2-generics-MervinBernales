/**
 * 
 */
package com.mycompany.final_part2_generics_MervinBernales.section_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mervin
 *
 */
public class MyGenericStaticMethodUtilityTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strings = new ArrayList<String>();
		String s1 = "element_1";
		strings.add(s1);
		String s = MyGenericStaticMethodUtility.add2collection(s1, strings);
		
		
		System.out.println("added String "+ s + ", now strings.size: " + strings.size() );
		Integer i1 = 1234;
		List<Integer> integers = new ArrayList<Integer>();
		integers.add(i1);
		Integer i = MyGenericStaticMethodUtility.add2collection(i1, integers);
		System.out.println("added Integer "+ i + ", now integers.size: " + integers.size() );

	}

}
