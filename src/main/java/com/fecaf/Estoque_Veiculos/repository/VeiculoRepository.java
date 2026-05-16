    package com.fecaf.Estoque_Veiculos.repository;

    import com.fecaf.Estoque_Veiculos.modelo.Veiculo;
    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;

    @Repository
    public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {

}