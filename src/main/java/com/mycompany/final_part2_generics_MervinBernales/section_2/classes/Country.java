/**
 * 
 */
package com.mycompany.final_part2_generics_MervinBernales.section_2.classes;

import com.mycompany.final_part2_generics_MervinBernales.section_2.intefaces.HasCapital;
import com.mycompany.final_part2_generics_MervinBernales.section_2.intefaces.HasName;

/**
 * @author Mervin
 *
 */
public class Country<C extends HasCapital & HasName> {

	/* (non-Javadoc)
	 * @see com.mycompany.final_part2_generics_MervinBernales.section_2.intefaces.HasName#getName()
	 */
	private String name;
	private C Capital;
	Country(String _name, C _capital){
		name = _name;
		Capital = _capital;
	}
	public String getName(){
		return name;
	}
	public String getCapitalName() {
		// TODO Auto-generated method stub
		return name;
	}
}
