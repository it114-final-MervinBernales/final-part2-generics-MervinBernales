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
	HasCapital<T extends Country> us = new Country<String, C>("United States", "Washington");
	HasCapital<T extends Country> turkey = new Country<String, C>("Turkey", "Ankara");
}
