// Pacote onde a interface UsuarioRepository está localizada
package br.uniesp.si.techback.repository;

// Importando as classes necessárias do Spring Data JPA
import br.uniesp.si.techback.model.Usuario;  // Importa a classe Usuario que será usada no repositório
import org.springframework.data.jpa.repository.JpaRepository;  // Importa o JpaRepository que fornece funcionalidades CRUD (Create, Read, Update, Delete)

// Definindo a interface UsuarioRepository, que estende JpaRepository para realizar operações de banco de dados para a entidade Usuario
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    // A interface UsuarioRepository herda os métodos do JpaRepository, como salvar, excluir, encontrar, etc.
    // Não é necessário escrever implementações específicas aqui, pois o Spring Data JPA automaticamente gera a implementação necessária.
}
