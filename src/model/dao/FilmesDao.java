package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Filme;

public class FilmesDao implements FilmesDaoInterface{

	@PersistenceContext(unitName="Projeto3FinalPersistenceUnit")
	EntityManager entityManager;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Filme> getFilmes() {
		
		Query query = entityManager.createQuery("from Filme");
		
		return query.getResultList();
	}

}
