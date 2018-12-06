package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.sun.xml.internal.stream.Entity;

import model.Episodio;
import model.EpisodiosAssistidos;
import model.Usuario;

public class EpisodiosAssistidosDao implements EpisodiosAssistidosDaoInterface {

	
	@PersistenceContext(unitName="Projeto3FinalPersistenceUnit")
	EntityManager entityManager;
	
	
	@Override
	public EpisodiosAssistidos adicionarEpisodio(Usuario usuario, Episodio episodio) {
		
		
		EpisodiosAssistidos ep = new EpisodiosAssistidos(null, usuario, episodio);
		
		entityManager.persist(ep);
		
		return ep;
	}

	@Override
	public EpisodiosAssistidos removerEpisodio(Usuario usuario, Episodio episodio) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<EpisodiosAssistidos> getEpisodiosBaixados() {
		
		Query query = entityManager.createQuery("from EpisodiosAssistidos");
		
		
		
		return query.getResultList() ;
	}

}
