package model.dao;
//Departamento é uma entidade do model

import java.util.List;

import model.entidades.Funcao;
// Interface FuncaoDao
public interface FuncaoDao {

	void insert(Funcao obj);//Operação responsavel por inserir um registro no banco de dados um objeto passado como parametro
	void update(Funcao obj);//Operação responsavel por atualizar um registro no banco de dados um objeto passado como parametro
	void deleteById(Integer id);//Operação responsavel por deletar um registro no banco de dados um objeto passado como parametro
	Funcao findById(Integer id);//Operação responsavel por pegar um ID e consultar o banco de dados com esse ID
	List<Funcao> findAll();//Operação responsavel por retornar todos os registro do banco de dados 
}
