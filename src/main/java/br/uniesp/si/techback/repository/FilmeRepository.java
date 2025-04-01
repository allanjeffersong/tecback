// Pacote onde a interface FilmeRepository está localizada
package br.uniesp.si.techback.repository;

// Importando as classes necessárias do Spring Data JPA
import br.uniesp.si.techback.model.Filme;  // Importa a classe Filme que será usada no repositório
import org.springframework.data.jpa.repository.JpaRepository;  // Importa o JpaRepository que fornece funcionalidades CRUD (Create, Read, Update, Delete)

// Definindo a interface FilmeRepository, que estende JpaRepository para realizar operações de banco de dados para a entidade Filme
public interface FilmeRepository extends JpaRepository<Filme, Integer> {

    // A interface FilmeRepository herda os métodos do JpaRepository, como salvar, excluir, encontrar, etc.
    // Não é necessário escrever implementações específicas aqui, pois o Spring Data JPA automaticamente gera a implementação necessária.
}
