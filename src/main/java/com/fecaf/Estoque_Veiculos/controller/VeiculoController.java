package com.fecaf.Estoque_Veiculos.controller;

import com.fecaf.Estoque_Veiculos.modelo.Veiculo;
import com.fecaf.Estoque_Veiculos.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;


    @PostMapping
    public Veiculo cadastrar(@RequestBody Veiculo veiculo) {

        return veiculoService.salvarVeiculo(veiculo);
    }


    @GetMapping
    public List<Veiculo> listarOuFiltrar(
            @RequestParam(required = false) String marca,
            @RequestParam(required = false) String modelo,
            @RequestParam(required = false) Double preco,
            @RequestParam(required = false) Integer ano,
            @RequestParam(required = false) String status) {


        return veiculoService.buscarComFiltros(marca, modelo, preco, ano, status);
    }


    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {

        veiculoService.deletarVeiculo(id);
    }

    @PutMapping("/{id}")
    public Veiculo atualizar(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        return veiculoService.atualizarVeiculo(id, veiculo);
    }



}