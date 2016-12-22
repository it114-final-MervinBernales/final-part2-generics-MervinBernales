/**
 * 
 */
package com.mycompany.final_part2_generics_MervinBernales.section_3;

import com.mycompany.final_part2_generics_MervinBernales.section_2.intefaces.HasCapital;
import com.mycompany.final_part2_generics_MervinBernales.section_2.intefaces.HasGovernor;
import com.mycompany.final_part2_generics_MervinBernales.section_2.intefaces.HasName;

/**
 * @author Mervin
 *
 */
public class GovernmentEntity2<T extends HasCapital & HasName & HasGovernor> {

}
