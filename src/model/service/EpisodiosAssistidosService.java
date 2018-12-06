package model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Episodio;
import model.EpisodiosAssistidos;
import model.Usuario;
import model.dao.EpisodiosAssistidosDao;

public class EpisodiosAssistidosService implements EpisodiosAssistidosServiceInterface{

	@Inject
	private EpisodiosAssistidosDao epDao;
	
	@Transactional
	@Override
	public EpisodiosAssistidos adicionarEpisodio(Usuario usuario, Episodio episodio) {
		// TODO Auto-generated method stub
		return epDao.adicionarEpisodio(usuario, episodio);
	}

	@Override
	public EpisodiosAssistidos removerEpisodio(Usuario usuario, Episodio episodio) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EpisodiosAssistidos> getEpisodiosAssistidos() {
		// TODO Auto-generated method stub
		return epDao.getEpisodiosBaixados();
	}

}
