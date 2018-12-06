package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Anime;

public class AnimeDao implements AnimeDaoInterface{

	@PersistenceContext(unitName="Projeto3FinalPersistenceUnit")
	EntityManager entityManager;
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Anime> getAnimes() {
	
		Query query = entityManager.createQuery("from Anime");
		
		return query.getResultList();
	}

}
