// Pacote onde a classe Filme está localizada
package br.uniesp.si.techback.model;

// Importando anotações do JPA para mapeamento de entidade e persistência no banco de dados
import jakarta.persistence.*;  // Anotações do JPA para mapear as entidades para a tabela do banco de dados
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;  // Anotação do Lombok para gerar getters, setters e outros métodos automaticamente

// Definindo que a classe Filme é uma entidade JPA e será mapeada para uma tabela no banco de dados
@Data  // Gera automaticamente os métodos getters, setters, toString, equals e hashCode
@Entity  // Define que esta classe é uma entidade JPA, que será mapeada para uma tabela do banco de dados
@Table(name = "tb_filme")  // Define o nome da tabela no banco de dados
@NotEmpty
public class Filme {

    // Definindo o atributo id como a chave primária da tabela
    @Id  // Define que o campo 'id' é a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Define que o valor do id será gerado automaticamente pelo banco de dados
    private Integer id;  // Atributo que representa o ID do filme

    // Definindo o atributo 'titulo' que representa o título do filme
    private String titulo;  // Atributo para armazenar o título do filme

    // Definindo o atributo 'autor' que representa o autor do filme (ou diretor)
    private String autor;  // Atributo para armazenar o autor do filme

    private Integer anolancamento;
}
