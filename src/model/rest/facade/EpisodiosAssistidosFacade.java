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

import model.Episodio;
import model.EpisodiosAssistidos;
import model.EpisodiosBaixados;
import model.Usuario;
import model.service.EpisodiosAssistidosService;

@Path("/episodios_assistidos")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class EpisodiosAssistidosFacade {
	
	
	@Inject
	EpisodiosAssistidosService epAssistidos;
	static List<EpisodiosAssistidos> episodiosAssistidos = new ArrayList<>();
	
	@GET
	public List<EpisodiosAssistidos> getEpisodiosAssistidos(){
		
		
		return episodiosAssistidos;
	}
	
	@POST
	public void adicionadaEpisodioAssistido(Episodio episodio){
		
		Usuario usuario = LoginFacade.listC.get(0);
		
		epAssistidos.adicionarEpisodio(usuario, episodio);
		
	}
	
	@PUT
	public void configuraLista(Usuario usuario){
		
		System.out.println("Entrou no put");
		System.out.println("email do usuario fora do for: " + usuario.getEmail());
		episodiosAssistidos.clear();
		
		for (EpisodiosAssistidos episodio: epAssistidos.getEpisodiosAssistidos()){
			
			if(episodio.getUsuario().getEmail().equals(usuario.getEmail()) ){
				System.out.println("O usuario tem episodios baixados");
				episodiosAssistidos.add(episodio);
			}
			
		}
		
	}

}
