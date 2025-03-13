package desafio.itau.springboot.dtos;

import jakarta.validation.constraints.NotNull;

import java.time.OffsetDateTime;

public class TransactionDTO {
    @NotNull
    private Double valor;
    @NotNull
    private OffsetDateTime dataHora;

    public Double getValor() {
        return valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }
}
