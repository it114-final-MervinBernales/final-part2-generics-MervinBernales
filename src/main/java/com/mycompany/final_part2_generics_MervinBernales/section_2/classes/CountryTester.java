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
public class CountryTester {
	public static void main(String[] args){
		Country<Capital> us = new Country<Capital>("USA", new Capital("Washington DC"));
		System.out.println("us name: " + us.getName() +", capital name: " +us.getCapitalName());
		Country<Capital> turkey = new Country<Capital>("Turkey", new Capital("Ankara"));
		System.out.println("turkey name: " + turkey.getName() +", capital name: " +turkey.getCapitalName());
		
	}
}
