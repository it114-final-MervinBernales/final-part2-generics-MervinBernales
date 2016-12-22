/**
 * 
 */
package com.mycompany.final_part2_generics_MervinBernales.section_2.classes;

import com.mycompany.final_part2_generics_MervinBernales.section_2.intefaces.HasName;

/**
 * @author Mervin
 *
 */
public class Capital implements HasName {

	/* (non-Javadoc)
	 * @see com.mycompany.final_part2_generics_MervinBernales.section_2.intefaces.HasName#getName()
	 */
	String name;
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	Capital(String _name){
		name = _name;
	}
}
