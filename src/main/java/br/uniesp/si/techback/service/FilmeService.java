// Pacote onde a classe FilmeService está localizada
package br.uniesp.si.techback.service;

// Importando as classes necessárias
import br.uniesp.si.techback.model.Filme;  // Importa a classe Filme, que é a entidade a ser manipulada
import br.uniesp.si.techback.repository.FilmeRepository;  // Importa o repositório FilmeRepository para acessar os dados no banco de dados
import jakarta.persistence.EntityNotFoundException;  // Importa a exceção para casos em que a entidade não for encontrada
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;  // Importa a anotação para injeção de dependência
import org.springframework.stereotype.Service;  // Importa a anotação para indicar que a classe é um serviço

import java.util.List;  // Importa a classe List, que é usada para retornar coleções de filmes

// Definindo a classe FilmeService como um serviço Spring
@RequiredArgsConstructor
@Service  // Indica que a classe é um serviço Spring, responsável pela lógica de negócios
public class FilmeService {

    // Injeção de dependência para o repositório FilmeRepository

    private final FilmeRepository repository;

    // Método para cadastrar um filme no banco de dados
    public Filme cadastar(Filme filme) {
        // Chama o método save do repositório para salvar o filme no banco de dados
        return repository.save(filme);
    }

    // Método para alterar um filme no banco de dados
    public Filme alterar(Filme filme) {
        // Verifica se o ID do filme é nulo, o que indica que o filme não existe no banco
        if (filme.getId() == null) {
            // Lança uma exceção caso o filme não tenha ID, ou seja, não existe no banco
            throw new EntityNotFoundException();
        }
        // Chama o método save do repositório para salvar (ou atualizar) o filme no banco
        return repository.save(filme);
    }

    // Método para listar todos os filmes do banco de dados
    public List<Filme> listar() {
        // Chama o método findAll do repositório para buscar todos os filmes
        return repository.findAll();
    }

    // Método para excluir um filme pelo ID
    public void excluir(Integer id) {
        // Chama o método deleteById do repositório para excluir o filme do banco de dados
        repository.deleteById(id);
    }

    public List listarFilmePorTitulo(String titulo){
        return repository.findByTitulo(titulo);
    }
}
