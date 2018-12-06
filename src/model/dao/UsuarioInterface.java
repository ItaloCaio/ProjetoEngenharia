package model.dao;

import java.util.List;

import model.Usuario;

public interface UsuarioInterface {
	
	public Usuario salvarUsuario(Usuario usuario);
	
	public Usuario atualizarUsuario(Usuario usuario);
	
	public Usuario removerUsuario(Usuario usuario);
	
	public List<Usuario> getUsuarios();
;

}
