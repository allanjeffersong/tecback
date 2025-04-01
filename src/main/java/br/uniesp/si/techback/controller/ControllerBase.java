// Pacote onde a classe ControllerBase está localizada
package br.uniesp.si.techback.controller;

// Importando a classe EntidadeBase e a classe de manipulação do Spring Web
import br.uniesp.si.techback.model.EntidadeBase;
import org.springframework.web.bind.annotation.*;

// Definindo que esta classe é um controlador REST com as anotações do Spring
@RestController

// Definindo que todas as requisições feitas a este controlador começarão com a URL "/base"
@RequestMapping("/base")
public class ControllerBase {

    // Método que irá responder a requisições GET para a URL "/base"
    @GetMapping
    public EntidadeBase exemploMetodoGET() {
        // Criando e retornando um objeto da classe EntidadeBase com os dados especificados
        return EntidadeBase
                .builder()  // Iniciando o builder (padrão de projeto que facilita a construção do objeto)
                .nome("Aula BackEnd")  // Atribuindo o nome "Aula BackEnd"
                .ano(2025)  // Atribuindo o ano 2025
                .build();  // Finalizando a construção e retornando o objeto
    }

    // Método que irá responder a requisições POST para a URL "/base"
    @PostMapping
    public EntidadeBase exemploMetodoPost(@RequestBody EntidadeBase entidadeBase) {
        // O parâmetro "entidadeBase" é automaticamente preenchido com o corpo da requisição,
        // que deve conter um objeto no formato JSON que será convertido para a classe EntidadeBase.

        // O método retorna o mesmo objeto recebido na requisição
        return entidadeBase;
    }
}
