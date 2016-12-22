/**
 * 
 */
package com.mycompany.final_part2_generics_MervinBernales.section_1;

/**
 * @author Mervin
 *
 */
public class MyGenericContainerClass<T> implements MyGenericContainerInterface<T> {
	private T contained ;

	public T getContained() {
		
		return contained;
	}
	MyGenericContainerClass(T _contained){
		contained = _contained;
	}
	
}
