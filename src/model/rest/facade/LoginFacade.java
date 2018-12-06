package model.rest.facade;

import java.util.ArrayList;
import java.util.List;


import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Usuario;
import model.dao.UsuarioDao;
import model.service.UsuarioService;


@Path("/login")
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Consumes(MediaType.APPLICATION_JSON)
public class LoginFacade {

	@Inject
	private UsuarioService usuarioService;
	
	@Inject
	private UsuarioDao usuarioDao;
	
	static List<Usuario> listC = new ArrayList<>();

	@GET
	public static List<Usuario> getUsuarios() throws Exception {

		return listC;
	}

	@POST
	public Usuario entrar(Usuario usuario) {
		
		Usuario	usuarioReturn = null;
		
		try{ 
			//Verifica se existe um usuario com esse email
			usuarioReturn = pesquisarUsuario(usuario.getEmail());

		}catch(Exception e){
			e.getMessage();
		}
		
		//valida o login
		if(usuarioReturn != null){
			if (autentica(usuario, usuarioReturn)){
				listC.add(usuarioReturn);
				return usuarioReturn;
			}
			
				
		}
		
		return null;
	}

	private boolean autentica(Usuario usuarioWeb, Usuario usuarioBD) {
	
		
		if ((usuarioWeb.getEmail().equals( usuarioBD.getEmail())) && usuarioWeb.getSenha().equals(usuarioBD.getSenha())) {
			
				return true;
			}
			

		return false;

	}

	
	@DELETE
	public void removerCliente(){
		System.out.println("Entrei no remove");
		listC.remove(0);
	
	}
	
	
	
	private Usuario pesquisarUsuario(String email) {
			Usuario usuario = null;
			
			System.out.println("Pesquisando usuario");
		try{
			for(Usuario user: usuarioService.getUsuarios())	
				if(user.getEmail().equals(email))
					usuario = user;
			
		}catch(Exception e){
			e.getMessage();
		}
		return usuario;
	}
}