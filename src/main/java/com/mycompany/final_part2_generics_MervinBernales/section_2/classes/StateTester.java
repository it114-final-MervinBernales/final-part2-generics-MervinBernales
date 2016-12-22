/**
 * 
 */
package com.mycompany.final_part2_generics_MervinBernales.section_2.classes;

/**
 * @author Mervin
 *
 */
public class StateTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		State<Governor> nj = new State<Governor>("New Jersey", new Capital("Trenton"));
		System.out.println("us name: " + nj.getName() +", capital name: " +nj.getCapitalName());
	}

}
