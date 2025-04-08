// Pacote onde a classe FilmeController está localizada
package br.uniesp.si.techback.controller;

// Importando classes do modelo, repositório e serviço do Spring
import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.repository.FilmeRepository;
import br.uniesp.si.techback.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Definindo que esta classe é um controlador REST com as anotações do Spring
@RestController

// Definindo que todas as requisições feitas a este controlador começarão com a URL "/filmes"
@RequestMapping("/filmes")
public class FilmeController {

    // Injetando o serviço FilmeService na classe, o Spring vai gerenciar esta dependência automaticamente
    @Autowired  // Iremos remover essa anotação na próxima aula (comentário sobre remoção futura)
    private FilmeService service;

    // Método que irá responder a requisições GET para a URL "/filmes"
    @GetMapping
    public List<Filme> listar() {
        // Chama o serviço para listar todos os filmes e retorna a lista de filmes
        return service.listar();
    }

    // Método que irá responder a requisições POST para a URL "/filmes"
    @PostMapping
    public Filme inserir(@RequestBody Filme filme) {
        // Recebe um objeto Filme no corpo da requisição e chama o serviço para cadastrar esse filme
        return service.cadastar(filme);
    }

    // Método para alterar um filme. No entanto, falta a anotação de mapeamento
    public Filme alterar(@RequestBody Filme filme) {
        // Chama o serviço para alterar os dados de um filme
        return service.alterar(filme);
    }

    // Método que irá responder a requisições DELETE para a URL "/filmes/{id}"
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        // Chama o serviço para excluir um filme com base no ID
        service.excluir(id);
        // Retorna uma resposta HTTP 200 (OK) indicando que a operação foi bem-sucedida
        return ResponseEntity.ok().build();
    }
}
