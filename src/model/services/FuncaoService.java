package model.services;
/**
 * Classe responsavel por fornecer serviços em relação a Funcão.
 * Model MVC.
 */
import java.util.List;

import model.dao.DaoFactory;
import model.dao.FuncaoDao;
import model.entidades.Funcao;

public class FuncaoService {
	/**
	 * Dependencia do FuncaoDao Usando a fabrica DaoFactory
	 */
	private FuncaoDao dao = DaoFactory.createFuncaoDao();

	/**
	 * Operação pra retornar uma lista de departamento do banco de dados
	 */
	public List<Funcao> findAll() {
		return dao.findAll();
	}
	/*
	 * Metodo pra atualizar ou criar novo departamento
	 */
	public void saveOrUpdate(Funcao obj) {
		if (obj .getId() == null) {// se obj == null, quer dizer que ele vai criar um novo obj
			dao.insert(obj);
		}
		else {// se não ele vai atualizar um ja existente 
			dao.update(obj);
		}
	}
	/*
	 * Remover um departamento do banco de dados
	 */
	public void remove(Funcao obj) {
		dao.deleteById(obj.getId());
	}
}