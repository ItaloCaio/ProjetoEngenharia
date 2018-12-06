package model.dao;

import java.util.List;

import model.Episodio;
import model.EpisodiosAssistidos;
import model.Usuario;

public interface EpisodiosAssistidosDaoInterface {
	
	public EpisodiosAssistidos adicionarEpisodio(Usuario usuario, Episodio episodio);
	
	public EpisodiosAssistidos removerEpisodio(Usuario usuario, Episodio episodio);
	
	public List<EpisodiosAssistidos> getEpisodiosBaixados();


}
