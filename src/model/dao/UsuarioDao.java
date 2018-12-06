package model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import model.Usuario;

public class UsuarioDao implements UsuarioInterface {

	@PersistenceContext(unitName="Projeto3FinalPersistenceUnit")
	private EntityManager entityManager;
	

	
	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		
		entityManager.persist(usuario);
		
		return usuario;
		
	}

	@Override
	public Usuario atualizarUsuario(Usuario usuario) {
		
		Usuario usuarioMerge = entityManager.merge(usuario);
		
		entityManager.persist(usuarioMerge);
		
		return usuario;
		
		
	}

	@Override
	public Usuario removerUsuario(Usuario usuario) {
		
		Usuario usuarioMerge = entityManager.merge(usuario);
		entityManager.remove(usuarioMerge);
		
		
		return usuario;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> getUsuarios() {
		
		Query query = entityManager.createQuery("from Usuario");
		
		
		
		return query.getResultList();
	}
	

}
