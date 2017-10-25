/**
 * 
 */
package com.kleber.javabasico.aula46;

/**
 * @author kleber.lima
 *
 */
public interface SqlDCL {
	
	void grant(String access);
	void revoke(String access);

}
