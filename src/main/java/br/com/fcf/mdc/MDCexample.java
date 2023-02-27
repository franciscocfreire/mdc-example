package br.com.fcf.mdc;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;

@Slf4j
public class MDCexample {

    public static void main(String[] args) {
        // Define um valor para a chave "idTransacao" no MDC
        MDC.put("idTransacao", "12345");

        // Loga uma mensagem usando o valor definido para "idTransacao"
        log.info("Iniciando processamento da transação");

        // Executa o processamento da transação...

        // Remove o valor da chave "idTransacao" do MDC
        MDC.remove("idTransacao");

        // Loga uma mensagem informando que a transação foi concluída
        log.info("Transação concluída");
    }
}
