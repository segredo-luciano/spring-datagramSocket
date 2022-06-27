package com.timber.system.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="berco")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Berco {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "registro")
	private String registro;
	@Column(name = "nome")
	private String nome;
	@Column(name = "tipo_madeira")
	private String tipoMadeira;
	@Column(name = "densidade_madeira")
	private int densidadeMadeira;
	@Column(name = "capacidade")
	private int capacidade;
	@Column(name = "peso_atual")
	private BigDecimal pesoAtual;
}
