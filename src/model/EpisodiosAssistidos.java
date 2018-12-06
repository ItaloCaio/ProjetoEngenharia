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
@Table(name="episodiosAssistidos")
public class EpisodiosAssistidos implements Serializable {

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cod_episodios_assistidos")
	private Integer cod_episodios_assistidos;
	
	@ManyToOne
	@JoinColumn(name="usuario", referencedColumnName="codUsuario")
	private Usuario usuario;
	
	@OneToOne
	@JoinColumn(name="episodio", referencedColumnName="codEpisodio")
	private Episodio episodio;
	
	
	

	public EpisodiosAssistidos(Integer cod_episodios_assistidos, Usuario usuario, Episodio episodio) {
		super();
		this.cod_episodios_assistidos = cod_episodios_assistidos;
		this.usuario = usuario;
		this.episodio = episodio;
	}

	public EpisodiosAssistidos(){
		
	}
	
	public Integer getCod_episodios_assistidos() {
		return cod_episodios_assistidos;
	}

	public void setCod_episodios_baixados(Integer cod_episodios_baixados) {
		this.cod_episodios_assistidos = cod_episodios_baixados;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Episodio getEpisodio() {
		return episodio;
	}

	public void setEpisodio(Episodio episodio) {
		this.episodio = episodio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cod_episodios_assistidos == null) ? 0 : cod_episodios_assistidos.hashCode());
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
		EpisodiosAssistidos other = (EpisodiosAssistidos) obj;
		if (cod_episodios_assistidos == null) {
			if (other.cod_episodios_assistidos != null)
				return false;
		} else if (!cod_episodios_assistidos.equals(other.cod_episodios_assistidos))
			return false;
		return true;
	}

	
	
}
