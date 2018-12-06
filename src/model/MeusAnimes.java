package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name="meus_animes")
public class MeusAnimes implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codMeusAnimes")
	private Integer cod_meus_animes;
	
	@ManyToOne
	@JoinColumn(name="animes_codUsuario", referencedColumnName="codUsuario")
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name="animes_codAnime", referencedColumnName="codAnime")
	private Anime anime;
	
	
	

	public MeusAnimes(Integer cod, Usuario usuario, Anime anime) {
		super();
		this.cod_meus_animes = cod;
		this.usuario = usuario;
		this.anime = anime;
	}
	
	public MeusAnimes(){
		
	}

	public Integer getCod() {
		return cod_meus_animes;
	}

	public void setCod(Integer cod) {
		this.cod_meus_animes = cod;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Anime getAnime() {
		return anime;
	}

	public void setAnime(Anime anime) {
		this.anime = anime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cod_meus_animes == null) ? 0 : cod_meus_animes.hashCode());
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
		MeusAnimes other = (MeusAnimes) obj;
		if (cod_meus_animes == null) {
			if (other.cod_meus_animes != null)
				return false;
		} else if (!cod_meus_animes.equals(other.cod_meus_animes))
			return false;
		return true;
	}

	
	
	
	
	
	
}
