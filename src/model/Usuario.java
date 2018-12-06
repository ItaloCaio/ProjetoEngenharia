package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codUsuario")
	 Integer codUsuario;
	@Column(name="nome", length= 50, nullable=false)
	 String nome;
	@Column(name = "senha", length = 50, nullable = false)
	 String senha;
	@Column(name= "email", length = 50, nullable = false)
	String email;
	
	@OneToMany(mappedBy="usuario")
	private List<MeusAnimes> animes;
	
	@OneToMany(mappedBy="usuario")
	private List<EpisodiosBaixados> episodiosBaixados;
	
	@OneToMany(mappedBy="usuario")
	private List<EpisodiosAssistidos> episodiosAssistidos;
	
	public Usuario(Integer codUsuario, String nome, String senha, String email) {
	
		this.codUsuario = codUsuario;
		this.nome = nome;
		this.senha = senha;
		this.email = email;
	}
	
	
	
	public Usuario(){
		
	}
	
	
	
	@XmlTransient
	public List<EpisodiosBaixados> getEpisodiosBaixados() {
		return episodiosBaixados;
	}



	public void setEpisodiosBaixados(List<EpisodiosBaixados> episodiosBaixados) {
		this.episodiosBaixados = episodiosBaixados;
	}



	@XmlTransient
	public List<MeusAnimes> getAnimes() {
		return animes;
	}

	public void setAnimes(List<MeusAnimes> animes) {
		this.animes = animes;
	}

	public void registrarUsuario(){
		
	}
	
	public Usuario consultarUsuario(){
		
		
		return null;
	}

	public Integer getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(Integer codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codUsuario == null) ? 0 : codUsuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (codUsuario == null) {
			if (other.codUsuario != null)
				return false;
		} else if (!codUsuario.equals(other.codUsuario))
			return false;
		return true;
	}


	

}
