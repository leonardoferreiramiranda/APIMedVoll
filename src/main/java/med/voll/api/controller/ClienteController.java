package med.voll.api.controller;


import med.voll.api.cliente.DadosCadastroCliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @PostMapping()
    public void cadastrar(@RequestBody DadosCadastroCliente dados) {
        System.out.println(dados);
    }
}
