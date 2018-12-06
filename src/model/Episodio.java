package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity //Para dizer que ?uma entidade
@Table(name="episodio") 
public class Episodio implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codEpisodio")
	private Integer codEpisodio;
	
	@Column(name="nome", length=50, nullable=false)
	private String nome;
	@Column(name="numero", length=50, nullable=false)
	private int numero;
	
	@ManyToOne
	@JoinColumn(name="ep_codAnime", referencedColumnName="codAnime")
	private Anime anime;
	
	
	
	public Episodio(Integer codEpisodio, String nome, int numero, Anime anime) {
		this.codEpisodio = codEpisodio;
		this.nome = nome;
		this.numero = numero;
		this.anime = anime;
	}
	
	public Episodio(){
		
	}
	
	public Integer getCodEpisodio() {
		return codEpisodio;
	}
	public void setCodEpisodio(Integer codEpisodio) {
		this.codEpisodio = codEpisodio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((codEpisodio == null) ? 0 : codEpisodio.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Episodio other = (Episodio) obj;
		if (codEpisodio == null) {
			if (other.codEpisodio != null)
				return false;
		} else if (!codEpisodio.equals(other.codEpisodio))
			return false;
		return true;
	}
	
	@XmlTransient
	public Anime getAnime() {
		return anime;
	}

	public void setAnime(Anime anime) {
		this.anime = anime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	


}
