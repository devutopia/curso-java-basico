/**
 * 
 */
package com.kleber.javabasico.aula46;

/**
 * @author kleber.lima
 *
 */
public interface SqlDML {
	
	void select(String query);
	void insert(String query);
	void delete(String query);
	void update(String query);

}
