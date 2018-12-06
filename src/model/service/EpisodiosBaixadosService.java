package model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Episodio;
import model.EpisodiosBaixados;
import model.Usuario;
import model.dao.EpisodiosBaixadosDao;

public class EpisodiosBaixadosService implements EpisodiosBaixadosServiceInterface {

	@Inject 
	private EpisodiosBaixadosDao episodiosBaixadosDao;
	
	@Transactional
	@Override
	public EpisodiosBaixados adicionarEpisodio(Usuario usuario, Episodio episodio) {
		
		return episodiosBaixadosDao.adicionarEpisodio(usuario, episodio);
	}

	@Override
	public EpisodiosBaixados removerEpisodio(Usuario usuario, Episodio episodio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EpisodiosBaixados> getEpisodiosBaixados() {
		// TODO Auto-generated method stub
		return episodiosBaixadosDao.getEpisodiosBaixados();
	}

}
