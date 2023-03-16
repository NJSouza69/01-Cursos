package ifmoney.apirest.handler;

public class CamposRequeridosException extends BusinessException{
    public CamposRequeridosException(String campo) {
        super("O campo %s é Obrigatório", campo);
    }
}
