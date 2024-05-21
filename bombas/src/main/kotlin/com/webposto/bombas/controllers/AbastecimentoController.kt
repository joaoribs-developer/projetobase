package com.webposto.bombas.controllers

import com.webposto.bombas.repositorys.AbastecimentosRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("abastecimentos")
class AbastecimentoController(
    private val abastecimentosRepository: AbastecimentosRepository
) {
    @GetMapping
    fun getAll() = abastecimentosRepository.findAll()
}