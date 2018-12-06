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
import model.EpisodiosBaixados;
import model.MeusAnimes;
import model.Usuario;
import model.service.EpisodiosBaixadosService;

@Path("/episodios_baixados")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class EpisodiosBaixadosFacade {
	
	
	@Inject
	private EpisodiosBaixadosService episodiosBaixados;
	
	static List<EpisodiosBaixados> meusEpisodios = new ArrayList<>();
	
	@GET
	public List<EpisodiosBaixados> getEpisodiosBaixados(){
	
		
		return meusEpisodios;
	}
	
	@POST
	public void adicionaEpisodioBaixado(Episodio episodio){
		
		Usuario usuario = LoginFacade.listC.get(0);
		
		episodiosBaixados.adicionarEpisodio(usuario, episodio);
		
	}
	
	@PUT
	public void configuraLista(Usuario usuario){
		
		System.out.println("Entrou no put");
		System.out.println("email do usuario fora do for: " + usuario.getEmail());
		meusEpisodios.clear();
		
		for (EpisodiosBaixados episodio: episodiosBaixados.getEpisodiosBaixados()){
			
			if(episodio.getUsuario().getEmail().equals(usuario.getEmail()) ){
				System.out.println("O usuario tem episodios baixados");
				meusEpisodios.add(episodio);
			}
			
		}
		
			
		
		
	}

}
