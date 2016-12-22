/**
 * 
 */
package com.mycompany.final_part2_generics_MervinBernales.section_2.intefaces;

import com.mycompany.final_part2_generics_MervinBernales.section_2.classes.Capital;

/**
 * @author Mervin
 *
 */
public interface HasCapital<T extends Capital> {
	public T getCapital();
	public String getCapitalName();
	
}
