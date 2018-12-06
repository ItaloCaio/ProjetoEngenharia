package model.rest.facade;

import java.util.List;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


import model.Usuario;
import model.dao.UsuarioDao;
import model.service.UsuarioService;

@Path("/cadastro")
@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
@Consumes(MediaType.APPLICATION_JSON)
public class UsuarioFacade {
	
	@Inject
	private UsuarioService usuarioService;

	
	@GET
	public List<Usuario> getUsuario(){
		
		return usuarioService.getUsuarios();
	}
	
	@POST
	public Usuario salvarUsuario(Usuario usuario){
	
		usuario.setCodUsuario(null);
		return usuarioService.salvarUsuario(usuario);
		
	}

}
