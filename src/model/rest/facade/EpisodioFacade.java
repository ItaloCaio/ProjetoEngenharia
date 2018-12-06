package model.rest.facade;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlTransient;

import model.Anime;
import model.Episodio;
import model.MeusAnimes;
import model.Usuario;
import model.dao.EpisodiosDao;

@Path("/episodios")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML} )
@Consumes(MediaType.APPLICATION_JSON)
public class EpisodioFacade {
	
	@Inject
	private EpisodiosDao episodiosDao;
	
	static List<Episodio> listEp = new ArrayList<>();
	
	
	
	@GET
	public List<Episodio> getEpisodios(){
	
	
		
		return listEp;
	}
	
	@PUT
	public List<Episodio> postEpisodios(Anime anime){
		

		listEp.clear();
		
		System.out.println("Nome do anime e codigo" + anime.getNome() + " " + anime.getCodAnime());
		
		for(Episodio ep : episodiosDao.getEpisodios()){
			
			
			if(ep.getAnime().getNome().equals(anime.getNome())){
				System.out.println(" Nome do episodio " + ep.getNome());
				System.out.println("o EP É DO ANIME");
				listEp.add(ep);
			}
		}
		
		
		return listEp;
		
		
	}
	
	
	public void EpisodiosPorAnime(Anime anime){
		
		for(Episodio ep: episodiosDao.getEpisodios()){
			
			if(ep.getAnime().getNome().equals(anime.getNome()))
				listEp.add(ep);
			
		}
	}

}
