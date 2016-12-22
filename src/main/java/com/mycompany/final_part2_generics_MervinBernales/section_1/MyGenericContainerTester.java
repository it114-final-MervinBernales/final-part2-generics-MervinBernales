/**
 * 
 */
package com.mycompany.final_part2_generics_MervinBernales.section_1;

/**
 * @author Mervin
 *
 */
public class MyGenericContainerTester {

	/**
	 * @param args
	 */
	public static<T> void main(String[] args) {
		// TODO Auto-generated method stub	
		MyGenericContainerInterface<String> c4String = new MyGenericContainerClass<String>("ilker") ;
		MyGenericContainerInterface<Integer> c4Integer = new MyGenericContainerClass<Integer>(1234) ;
		System.out.println("String Container contain: " + c4String.getContained());
		System.out.println("Integer Container contain: " + c4Integer.getContained());
		
	}
	
}
