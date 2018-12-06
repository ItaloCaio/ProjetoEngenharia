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
@Entity //Para dizer que ?uma entidade
@Table(name="avaliacao") 
public class Avaliacao implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="codAvaliacao")
	private Integer codAvaliacao;
	
	@Column(name="descricao", length=50, nullable=false)
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name="av_codAnime", referencedColumnName="codAnime")
	private Anime anime;
	
	@OneToOne
	@JoinColumn(name="av_codUsuario", referencedColumnName="codUsuario")
	private Usuario usuario;
	
	
	
	public Avaliacao(Integer codAvaliacao, String descricao) {
		super();
		this.codAvaliacao = codAvaliacao;
		this.descricao = descricao;
	}
	
	public Avaliacao(){
		
	}

	public void avaliar(){
		
	}
	
	public void comentar(){
		
	}
	
	public void alterarComentario(){
		
	}
	
	public void removerComentario(){
		
	}

	public Integer getCodAvaliacao() {
		return codAvaliacao;
	}

	public void setCodAvaliacao(Integer codAvaliacao) {
		this.codAvaliacao = codAvaliacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codAvaliacao == null) ? 0 : codAvaliacao.hashCode());
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
		Avaliacao other = (Avaliacao) obj;
		if (codAvaliacao == null) {
			if (other.codAvaliacao != null)
				return false;
		} else if (!codAvaliacao.equals(other.codAvaliacao))
			return false;
		return true;
	}


	
	
	
}
