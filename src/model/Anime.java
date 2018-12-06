package model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@Entity //Para dizer que eh uma entidade
@Table(name="anime") //Criar uma tabela no bando de dados com nome anime
public class Anime implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codAnime")
	private Integer codAnime;
	@Column(name="quantidadeDeEpisodios", length=50, nullable=false)
	private Integer quantidadeDeEpisodios;
	
	@Column(name="categoria", length=50, nullable=false)
	private String categoria;
	
	@Column(name="descricao", length=50, nullable=false)
	private String descricao;
	
	@Column(name="nome", length=50, nullable=false)
	private String nome;
	
	@OneToMany(mappedBy="anime")
	private List<Episodio> episodios;
	
	@OneToMany(mappedBy="anime")
	private List<Filme> filmes;
	
	@OneToMany(mappedBy="anime")
	private List<Avaliacao> avaliacao;

	public Anime(){
		
	}
	
	public Anime(Integer codAnime, Integer quantidadeDeEpisodios, String nome, String categoria, String descricao) {
		super();
		this.codAnime = codAnime;
		this.nome = nome;
		this.quantidadeDeEpisodios = quantidadeDeEpisodios;
		this.categoria = categoria;
		this.descricao = descricao;
	}

	

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Anime consultarAnime(){
		
		
		return null;
	}

	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getQuantidadeDeEpisodios() {
		return quantidadeDeEpisodios;
	}

	public void setQuantidadeDeEpisodios(Integer quantidadeDeEpisodios) {
		this.quantidadeDeEpisodios = quantidadeDeEpisodios;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codAnime == null) ? 0 : codAnime.hashCode());
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
		Anime other = (Anime) obj;
		if (codAnime == null) {
			if (other.codAnime != null)
				return false;
		} else if (!codAnime.equals(other.codAnime))
			return false;
		return true;
	}

	public Integer getCodAnime() {
		return codAnime;
	}

	public void setCodAnime(Integer codAnime) {
		this.codAnime = codAnime;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@XmlTransient
	public List<Episodio> getEpisodios() {
		return episodios;
	}

	public void setEpisodios(List<Episodio> episodios) {
		this.episodios = episodios;
	}
	
	@XmlTransient
	public List<Filme> getFilmes() {
		return filmes;
	}

	public void setFilmes(List<Filme> filmes) {
		this.filmes = filmes;
	}




	




	



	
	
	

}
