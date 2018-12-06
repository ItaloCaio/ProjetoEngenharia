package model.dao;

import java.util.List;

import model.Anime;
import model.MeusAnimes;
import model.Usuario;

public interface MeusAnimesDaoInterface {
	
	public MeusAnimes adicionarAnime(Anime anime, Usuario usuario);
	public MeusAnimes removerAnime(Anime anime, Usuario usuario);
	public List<MeusAnimes> getAnimes();
	

}
