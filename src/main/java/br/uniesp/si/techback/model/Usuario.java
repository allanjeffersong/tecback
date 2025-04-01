// Pacote onde a classe Usuario está localizada
package br.uniesp.si.techback.model;

// Importando anotações do JPA para mapeamento de entidade e persistência no banco de dados
import jakarta.persistence.*;  // Anotações do JPA para mapear as entidades para a tabela do banco de dados
import lombok.Data;  // Anotação do Lombok para gerar getters, setters e outros métodos automaticamente

// Definindo que a classe Usuario é uma entidade JPA e será mapeada para uma tabela no banco de dados
@Data  // Gera automaticamente os métodos getters, setters, toString, equals e hashCode
@Entity  // Define que esta classe é uma entidade JPA, que será mapeada para uma tabela do banco de dados
@Table(name = "tb_usuario")  // Define o nome da tabela no banco de dados
public class Usuario {

    // Definindo o atributo id como a chave primária da tabela
    @Id  // Define que o campo 'Id' é a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Define que o valor do 'Id' será gerado automaticamente pelo banco de dados
    private Integer Id;  // Atributo que representa o ID do usuário

    // Definindo o atributo 'Nome' que representa o nome do usuário
    private String Nome;  // Atributo para armazenar o nome do usuário

    // Definindo o atributo 'Email' que representa o email do usuário
    private String Email;  // Atributo para armazenar o email do usuário
}
