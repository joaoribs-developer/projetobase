package com.webposto.bombas.model

import java.io.Serializable
import java.math.BigDecimal
import java.time.LocalDate
import jakarta.persistence.*

@Entity(name = "abastecimentos")
data class Abastecimento(
    @Id
    @Column(precision = 10)
    val controle: Int,

    @Column(name = "bomba", length = 3, precision = 3)
    val codigoBico: String,

    @Column(name = "total", precision = 18, scale = 2)
    val valorAbastecimento: BigDecimal,

    @Column(name = "codpro", length = 5, precision = 5)
    val codigoProduto: String,

    @Column(name = "idfrentista", length = 5, precision = 5)
    val matrFuncionario: String?,

    @Column(length = 1, precision = 1)
    var imprimiu: String?,


    @Column(name = "litros", precision = 18, scale = 3)
    var volumeAbst: BigDecimal,

    @Column(name = "data", precision = 13)
    var dataAbst: LocalDate,

    @Column(name = "pu", precision = 18, scale = 3)
    var precoUnitario: BigDecimal,
) : Serializable