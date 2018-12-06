package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import model.Anime;
import model.MeusAnimes;
import model.Usuario;

public class MeusAnimesDao implements MeusAnimesDaoInterface{

	@PersistenceContext(unitName="Projeto3FinalPersistenceUnit")
	EntityManager entityManager;
	
	@Override
	public MeusAnimes adicionarAnime(Anime anime, Usuario usuario) {
		
		MeusAnimes meusAnimes = new MeusAnimes(null, usuario, anime); 
		
		
		
		entityManager.persist(meusAnimes);
		
		return meusAnimes;
	}

	@Override
	public MeusAnimes removerAnime(Anime anime, Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MeusAnimes> getAnimes() {
		
		Query query = entityManager.createQuery("from MeusAnimes");
		
		return query.getResultList();
	}

}
