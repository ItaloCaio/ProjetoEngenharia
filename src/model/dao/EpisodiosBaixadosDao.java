package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Episodio;
import model.EpisodiosBaixados;
import model.Usuario;

public class EpisodiosBaixadosDao implements EpisodiosBaixadosDaoInterface{

	@PersistenceContext(unitName="Projeto3FinalPersistenceUnit")
	EntityManager entityManager;
	
	@Override
	public EpisodiosBaixados adicionarEpisodio(Usuario usuario, Episodio episodio) {
		
		EpisodiosBaixados epBaixados = new EpisodiosBaixados(null, usuario, episodio);
		entityManager.persist(epBaixados);
		
		return epBaixados;
	}

	@Override
	public EpisodiosBaixados removerEpisodio(Usuario usuario,Episodio episodio) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EpisodiosBaixados> getEpisodiosBaixados() {
	
		Query query = entityManager.createQuery("from EpisodiosBaixados");
		
		
		return query.getResultList();
	}

}
