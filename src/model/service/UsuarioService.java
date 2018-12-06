package model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import model.Usuario;
import model.dao.UsuarioDao;
import model.dao.UsuarioInterface;

public class UsuarioService implements UsuarioServiceInterface{

	@Inject
	private UsuarioDao usuarioDao;
	
	@Override
	@Transactional
	public Usuario salvarUsuario(Usuario usuario) {
		
		usuarioDao.salvarUsuario(usuario);
		
		return usuario;
	}
	

	@Transactional
	@Override
	public Usuario atualizarUsuario(Usuario usuario) {
		
		usuarioDao.atualizarUsuario(usuario);
		
		return usuario;
		
	}
	
	@Transactional
	@Override
	public Usuario removerUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<Usuario> getUsuarios() {
		// TODO Auto-generated method stub
		return usuarioDao.getUsuarios();
	}

	

}
