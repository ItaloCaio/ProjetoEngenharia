package model.rest.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Anime;
import model.MeusAnimes;
import model.dao.AnimeDao;
import model.service.MeusAnimesService;

@Path("/anime")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML} )
@Consumes(MediaType.APPLICATION_JSON)
public class AnimeFacade {
	
	@Inject
	private AnimeDao animeDao;
	
	@GET
	public List<Anime> getAnimes(){
		
		return animeDao.getAnimes();
	}
	
	
	

}
