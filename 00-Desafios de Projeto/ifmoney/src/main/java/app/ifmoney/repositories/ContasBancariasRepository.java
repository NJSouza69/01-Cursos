package app.ifmoney.repositories;

import app.ifmoney.models.ContasBancariasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.UUID;

@Repository
public interface ContasBancariasRepository extends JpaRepository <ContasBancariasModel, UUID> {

    // Declaração de Métodos de Validação de Contas
    boolean existsByNumeroConta(String numeroConta);

}
