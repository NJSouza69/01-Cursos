package app.ifmoney.services;

import app.ifmoney.models.ContasBancariasModel;
import app.ifmoney.repositories.ContasBancariasRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ContasBancariasService {

    final ContasBancariasRepository contasBancariasRepository;

    public ContasBancariasService(ContasBancariasRepository contasBancariasRepository) {
        this.contasBancariasRepository = contasBancariasRepository;
    }

    @Transactional
    public Object save(ContasBancariasModel contasBancariasModel) {
        return contasBancariasRepository.save(contasBancariasModel);
    }

    // Declaração de Métodos de Validação
    public boolean existsByNumeroConta(String numeroConta) {
         return contasBancariasRepository.existsByNumeroConta(numeroConta);
    }

    public List<ContasBancariasModel> findAll() {
        return contasBancariasRepository.findAll();
    }

    public Optional<ContasBancariasModel> findById(UUID pkConta) {
        return contasBancariasRepository.findById(pkConta);
    }

    @Transactional
    public void delete(ContasBancariasModel contasBancariasModel) {
        contasBancariasRepository.delete(contasBancariasModel);
    }
}
