package model.rest.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Filme;
import model.dao.FilmesDao;

@Path("/filmes")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML} )
@Consumes(MediaType.APPLICATION_JSON)
public class FilmeFacade {
	
	@Inject
	private FilmesDao filmesDao;
	
	@GET
	public List<Filme> getFilmes(){
		
		return filmesDao.getFilmes();
	}

}
