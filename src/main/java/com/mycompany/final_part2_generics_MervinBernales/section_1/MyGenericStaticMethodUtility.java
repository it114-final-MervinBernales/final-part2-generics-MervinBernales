/**
 * 
 */
package com.mycompany.final_part2_generics_MervinBernales.section_1;

import java.util.Collection;

/**
 * @author Mervin
 *
 */
public class MyGenericStaticMethodUtility {
	public static<T> T add2collection(T _e, Collection<T> _collection) {
		_collection.add(_e);
		return _e;
	}
	
}
