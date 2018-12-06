package model.service;

import java.util.List;

import model.Usuario;

public interface UsuarioServiceInterface {
	
	public Usuario salvarUsuario(Usuario usuario);
	
	public Usuario atualizarUsuario(Usuario usuario);
	
	public Usuario removerUsuario(Usuario usuario);
	
	public List<Usuario> getUsuarios();

}
