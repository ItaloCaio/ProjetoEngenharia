package model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Anime;
import model.MeusAnimes;
import model.Usuario;
import model.dao.MeusAnimesDao;

public class MeusAnimesService implements MeusAnimesServiceInterface{

	@Inject
	private MeusAnimesDao animeDao;
	
	@Transactional
	@Override
	public MeusAnimes adicionarAnime(Anime anime, Usuario usuario) {
		
		return animeDao.adicionarAnime(anime, usuario);
	}

	@Transactional
	@Override
	public MeusAnimes removerAnime(Anime anime, Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MeusAnimes> getAnimes() {
		// TODO Auto-generated method stub
		return animeDao.getAnimes();
	}

	
	
}
