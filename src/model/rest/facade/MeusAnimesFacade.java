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

import model.Anime;
import model.Episodio;
import model.MeusAnimes;
import model.Usuario;
import model.service.MeusAnimesService;

@Path("/meus_animes")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML} )
@Consumes(MediaType.APPLICATION_JSON)
public class MeusAnimesFacade {
	
	@Inject 
	private MeusAnimesService meusAnimesService;
	
	 static List<Anime> meusAnimes = new ArrayList<>();
	
	@GET
	public List<Anime> getMeusAnimes(){
		
		return meusAnimes;
	}
	
	@POST
	public void adicionaAnime(Anime anime){
		
		Usuario usuario = LoginFacade.listC.get(0);
		
		
		meusAnimesService.adicionarAnime(anime, usuario);
		
	}
	
	@PUT
	public void configuraLista(Usuario usuario){
		
		meusAnimes.clear();
		for (MeusAnimes animes: meusAnimesService.getAnimes()){
			
			if(animes.getUsuario().getEmail().equals(usuario.getEmail()) ){
				System.out.println("O usuario tem anime");
				meusAnimes.add(animes.getAnime());
			}
			
		}
		
			
		
		
	}

}
