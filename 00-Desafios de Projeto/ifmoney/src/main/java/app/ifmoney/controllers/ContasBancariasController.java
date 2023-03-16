package app.ifmoney.controllers;

import app.ifmoney.dtos.ContasBancariasDto;
import app.ifmoney.models.ContasBancariasModel;
import app.ifmoney.services.ContasBancariasService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/contas")
public class ContasBancariasController {

    final ContasBancariasService contasBancariasService;

    public ContasBancariasController(ContasBancariasService contasBancariasService) {
        this.contasBancariasService = contasBancariasService;
    }

    @PostMapping
    public ResponseEntity<Object> saveContasBancarias(@RequestBody @Valid ContasBancariasDto contasBancariasDto) {

        // Validações antes de Salvar
        if(contasBancariasService.existsByNumeroConta(contasBancariasDto.getNumeroConta())){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflito: Número Conta já está em uso!");
        }

        // Grava na Base de Dados
        var contasBancariasModel = new ContasBancariasModel();
        BeanUtils.copyProperties(contasBancariasDto, contasBancariasModel);
        contasBancariasModel.setDataCriacao(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(contasBancariasService.save(contasBancariasModel));
    }

    @GetMapping
    public ResponseEntity<List<ContasBancariasModel>> getAllContasBancarias() {
        return ResponseEntity.status(HttpStatus.OK).body(contasBancariasService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneContasBancarias(@PathVariable(value = "id")UUID pkConta){
        Optional<ContasBancariasModel> contasBancariasModelOptional = contasBancariasService.findById(pkConta);
        if(!contasBancariasModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Conta não foi encontrada!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(contasBancariasModelOptional.get());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteContasBancarias(@PathVariable(value = "id")UUID pkConta){
        Optional<ContasBancariasModel> contasBancariasModelOptional = contasBancariasService.findById(pkConta);
        if(!contasBancariasModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Conta não foi encontrada!");
        }
        contasBancariasService.delete(contasBancariasModelOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Conta deletada com sucesso!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateContasBancarias(@PathVariable(value = "id")UUID pkConta,
                                                        @RequestBody @Valid ContasBancariasDto contasBancariasDto){
        Optional<ContasBancariasModel> contasBancariasModelOptional = contasBancariasService.findById(pkConta);
        if(!contasBancariasModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Conta não foi encontrada!");
        }
        // Primeiro Método (Obtenção de cada campo individualmente) NÃO FUNCIONOU
/*        var contasBancariasModel = contasBancariasModelOptional.get();
        contasBancariasModel.setFkTipoConta(contasBancariasDto.getFkTipoConta());
        contasBancariasModel.setBancoNumero(contasBancariasDto.getBancoNumero());
        contasBancariasModel.setAgenciaNumero(contasBancariasDto.getAgenciaNumero());
        contasBancariasModel.setNumeroConta(contasBancariasDto.getNumeroConta());
        contasBancariasModel.setSaldoInicial(contasBancariasDto.getSaldoInicial());
        contasBancariasModel.setDescricaoBanco(contasBancariasDto.getDescricaoBanco());
        contasBancariasModel.setContaAtiva(contasBancariasDto.getContaAtiva());
        return ResponseEntity.status(HttpStatus.OK).body("Conta atualizada com sucesso!");
*/
        // Segundo Método
        var contasBancariasModel = new ContasBancariasModel();
        BeanUtils.copyProperties(contasBancariasDto, contasBancariasModel);
        contasBancariasModel.setPkConta(contasBancariasModelOptional.get().getPkConta());
        contasBancariasModel.setDataCriacao(contasBancariasModelOptional.get().getDataCriacao());
        return ResponseEntity.status(HttpStatus.OK).body(contasBancariasService.save(contasBancariasModel));
    }

}
