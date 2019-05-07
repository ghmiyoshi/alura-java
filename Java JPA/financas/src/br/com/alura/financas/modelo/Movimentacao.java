package br.com.alura.financas.modelo;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQuery(query="SELECT AVG(m.valor) FROM Movimentacao m WHERE m.conta = :pConta" + " AND m.tipo = :pTipo"
		+ " GROUP BY DAY(m.data), month(m.data), year(m.data)", name="MediasPorDiaETipo") // Recurso da JPA que permite declarar uma query identificando com um nome e, depois, referenciar quando for utilizar
public class Movimentacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private BigDecimal valor;

	@Enumerated(EnumType.STRING) // Indica que é um ENUM
	private TipoMovimentacao tipo;

	@Temporal(TemporalType.TIMESTAMP) // TIMESTAMP salva a data e o horário
	private Calendar data;

	private String descricao;

	@ManyToOne // Parte forte do relacionamento de movimentacoes da conta, cria o conta_id
	private Conta conta;

	@ManyToMany // Muitos para muitos para poder reutilizar uma mesma categoria em uma outra
				// movimentacao
	private List<Categoria> categoria;

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoMovimentacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Descrição: " + descricao;
	}

}
