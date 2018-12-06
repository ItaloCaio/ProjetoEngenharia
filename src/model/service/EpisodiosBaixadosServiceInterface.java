package model.service;

import java.util.List;

import model.Episodio;
import model.EpisodiosBaixados;
import model.Usuario;

public interface EpisodiosBaixadosServiceInterface {

public EpisodiosBaixados adicionarEpisodio(Usuario usuario, Episodio episodio);
	
	public EpisodiosBaixados removerEpisodio(Usuario usuario, Episodio episodio);
	
	public List<EpisodiosBaixados> getEpisodiosBaixados();
}
