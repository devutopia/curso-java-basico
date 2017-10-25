/**
 * 
 */
package com.kleber.javabasico.aula46;

/**
 * @author kleber.lima
 *
 */
public interface BancoDeDados extends SqlDCL, SqlDDL, SqlDML{
	
	void abrirConexao();
	void fecharConexao();

}
