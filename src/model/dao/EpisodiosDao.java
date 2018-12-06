package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Episodio;

public class EpisodiosDao implements EpisodiosDaoInterface {
	
	@PersistenceContext(unitName="Projeto3FinalPersistenceUnit")
	EntityManager entityManager;
	
	
	@Override
	public List<Episodio> getEpisodios() {
		
		Query query = entityManager.createQuery("from Episodio");
		
		return query.getResultList();
	}

}
