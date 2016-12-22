/**
 * 
 */
package com.mycompany.final_part2_generics_MervinBernales.section_2.classes;

import com.mycompany.final_part2_generics_MervinBernales.section_2.intefaces.HasCapital;
import com.mycompany.final_part2_generics_MervinBernales.section_2.intefaces.HasGovernor;
import com.mycompany.final_part2_generics_MervinBernales.section_2.intefaces.HasName;

/**
 * @author Mervin
 *
 */
public class State<C extends HasCapital & HasName, G extends HasGovernor> {
	private String name;
	private C Capital;
	private G Governor;
	State(String _name, C _capital, G _governor){
		name = _name;
		Capital = _capital;
		Governor = _governor;
		
	}
	public String getName(){
		return name;
	}
}
