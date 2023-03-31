package med.voll.api.cliente;

import med.voll.api.endereco.DadosEndereco;

public record DadosCadastroCliente(String nome, String cpf, String email, String telefone, DadosEndereco endereco) {
}
