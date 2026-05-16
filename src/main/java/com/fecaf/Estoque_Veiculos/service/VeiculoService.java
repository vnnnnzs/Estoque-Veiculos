package com.fecaf.Estoque_Veiculos.service;

import com.fecaf.Estoque_Veiculos.modelo.Veiculo;
import com.fecaf.Estoque_Veiculos.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo salvarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listarTodos() {
        return veiculoRepository.findAll();
    }

    public Optional<Veiculo> buscarPorId(Long id) {
        return veiculoRepository.findById(id);
    }

    public void deletarVeiculo(Long id) {
        veiculoRepository.deleteById(id);
    }


    public List<Veiculo> buscarComFiltros(String marca, String modelo, Double precoMaximo, Integer ano, String status) {

        List<Veiculo> todosOsVeiculos = veiculoRepository.findAll();


        List<Veiculo> veiculosFiltrados = new ArrayList<>();


        for (Veiculo v : todosOsVeiculos) {


            if (marca != null && !marca.isEmpty() && !v.getMarca().toLowerCase().contains(marca.toLowerCase())) {
                continue;
            }


            if (modelo != null && !modelo.isEmpty() && !v.getModelo().toLowerCase().contains(modelo.toLowerCase())) {
                continue;
            }


            if (precoMaximo != null && v.getPreco() > precoMaximo) {
                continue;
            }


            if (ano != null && !v.getAno().equals(ano)) {
                continue;
            }


            if (status != null && !status.isEmpty() && !v.getStatus().toLowerCase().contains(status.toLowerCase())) {
                continue;
            }


            veiculosFiltrados.add(v);
        }

        return veiculosFiltrados;
    }

    public Veiculo atualizarVeiculo(Long id, Veiculo veiculoAtualizado) {

        Veiculo veiculo = veiculoRepository.findById(id).orElse(null);


        if (veiculo != null) {
            veiculo.setPreco(veiculoAtualizado.getPreco());
            veiculo.setQuilometragem(veiculoAtualizado.getQuilometragem());
            veiculo.setStatus(veiculoAtualizado.getStatus());


            return veiculoRepository.save(veiculo);
        }

        return null;
    }


}