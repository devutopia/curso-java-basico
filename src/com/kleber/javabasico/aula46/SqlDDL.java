/**
 * 
 */
package com.kleber.javabasico.aula46;

/**
 * @author kleber.lima
 *
 */
public interface SqlDDL {
	
	void create(String query);
	void alter(String query);
	void drop(String query);

}
