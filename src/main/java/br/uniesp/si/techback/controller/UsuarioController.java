// Pacote onde a classe UsuarioController está localizada
package br.uniesp.si.techback.controller;

// Importando classes do modelo, repositório e serviço do Spring
import br.uniesp.si.techback.model.Filme; // Importa a classe Filme (não utilizada diretamente no controlador, mas usada no método alterar)
import br.uniesp.si.techback.model.Usuario; // Importa a classe Usuario, que representa um usuário
import br.uniesp.si.techback.service.FilmeService; // Importa o serviço FilmeService (não utilizado diretamente aqui)
import br.uniesp.si.techback.service.UsuarioService; // Importa o serviço UsuarioService que contém a lógica de negócio
import org.springframework.beans.factory.annotation.Autowired; // Importa a anotação para injeção de dependência
import org.springframework.http.ResponseEntity; // Importa a classe ResponseEntity para controlar a resposta HTTP
import org.springframework.web.bind.annotation.*; // Importa as anotações do Spring para mapear rotas HTTP

import java.util.List; // Importa List para lidar com listas de usuários

// Definindo que esta classe é um controlador REST com as anotações do Spring
@RestController

// Definindo que todas as requisições feitas a este controlador começarão com a URL "/usuarios"
@RequestMapping("/usuarios")
public class UsuarioController {

    // Injetando o serviço UsuarioService na classe, o Spring vai gerenciar essa dependência automaticamente
    @Autowired  // Iremos remover essa anotação na próxima aula (comentário sobre remoção futura)
    private UsuarioService service;

    // Método que irá responder a requisições GET para a URL "/usuarios"
    @GetMapping
    public List<Usuario> lista() {
        // Chama o serviço para listar todos os usuários e retorna a lista de usuários
        return service.listar();
    }

    // Método que irá responder a requisições POST para a URL "/usuarios"
    @PostMapping
    public Usuario inserir(@RequestBody Usuario usuario) {
        // Recebe um objeto Usuario no corpo da requisição e chama o serviço para cadastrar esse usuário
        return service.cadastar(usuario);
    }

    // Método para alterar um usuário. Este método está usando a classe Filme, o que parece ser um erro
    // Deveria estar usando Usuario ao invés de Filme, mas está utilizando Filme de forma errada.
    public Usuario alterar(@RequestBody Filme filme) {
        // O método recebe um Filme, mas deveria ser um Usuario, e chama o serviço para alterar um usuário
        return service.alterar(new Usuario());
    }

    // Método que irá responder a requisições DELETE para a URL "/usuarios/{id}"
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Integer id) {
        // Chama o serviço para excluir um usuário com base no ID
        service.excluir(id);
        // Retorna uma resposta HTTP 200 (OK) indicando que a operação foi bem-sucedida
        return ResponseEntity.ok().build();
    }
}
