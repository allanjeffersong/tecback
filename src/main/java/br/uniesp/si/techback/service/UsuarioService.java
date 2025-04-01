// Pacote onde a classe UsuarioService está localizada
package br.uniesp.si.techback.service;

// Importando as classes necessárias
import br.uniesp.si.techback.model.Usuario;  // Importa a classe Usuario, que é a entidade a ser manipulada
import br.uniesp.si.techback.repository.UsuarioRepository;  // Importa o repositório UsuarioRepository para acessar os dados no banco de dados
import jakarta.persistence.EntityNotFoundException;  // Importa a exceção para casos em que a entidade não for encontrada
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;  // Importa a anotação para injeção de dependência
import org.springframework.stereotype.Service;  // Importa a anotação para indicar que a classe é um serviço

import java.util.List;  // Importa a classe List, que é usada para retornar coleções de usuários

// Definindo a classe UsuarioService como um serviço Spring
@Service  // Indica que a classe é um componente de serviço Spring, responsável pela lógica de negócios
@RequiredArgsConstructor
public class UsuarioService {

    // Injeção de dependência para o repositório UsuarioRepository

    private final UsuarioRepository repository;

    // Método para cadastrar um usuário no banco de dados
    public Usuario cadastar(Usuario usuario) {
        // Chama o método save do repositório para salvar o usuário no banco de dados
        return repository.save(usuario);
    }

    // Método para alterar um usuário no banco de dados
    public Usuario alterar(Usuario usuario) {
        // Verifica se o ID do usuário é nulo, o que indica que o usuário não existe no banco
        if (usuario.getId() == null) {
            // Lança uma exceção caso o usuário não tenha ID, ou seja, não existe no banco
            throw new EntityNotFoundException();
        }
        // Chama o método save do repositório para salvar (ou atualizar) o usuário no banco
        return repository.save(usuario);
    }

    // Método para listar todos os usuários do banco de dados
    public List<Usuario> listar() {
        // Chama o método findAll do repositório para buscar todos os usuários
        return repository.findAll();
    }

    // Método para excluir um usuário pelo ID
    public void excluir(Integer id) {
        // Chama o método deleteById do repositório para excluir o usuário do banco de dados
        repository.deleteById(id);
    }
}
