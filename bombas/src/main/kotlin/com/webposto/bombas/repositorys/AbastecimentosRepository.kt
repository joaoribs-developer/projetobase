package com.webposto.bombas.repositorys

import com.webposto.bombas.model.Abastecimento
import org.springframework.data.jpa.repository.JpaRepository

interface AbastecimentosRepository: JpaRepository<Abastecimento, Int> {
}