/**
 * 
 */
package com.mycompany.final_part2_generics_MervinBernales.section_2.intefaces;

import com.mycompany.final_part2_generics_MervinBernales.section_2.classes.Governor;

/**
 * @author Mervin
 *
 */
public interface HasGovernor<T extends Governor> {
	public T getGovernor();
	public String getGovernorName();
}
