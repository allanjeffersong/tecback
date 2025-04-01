// Pacote onde a classe EntidadeBase está localizada
package br.uniesp.si.techback.model;

// Importando anotações do Lombok para facilitar a criação de código repetitivo
import lombok.Builder;   // Permite criar um padrão de construção de objetos (Builder)
import lombok.Data;      // Gera automaticamente os métodos getters, setters, toString, equals e hashCode
import lombok.Getter;    // Gera automaticamente o getter para todos os campos
import lombok.Setter;    // Gera automaticamente o setter para todos os campos

// Definindo que a classe EntidadeBase usa as anotações do Lombok para gerar código automaticamente
@Data   // Anotação que combina @Getter, @Setter, @ToString, @EqualsAndHashCode, e @RequiredArgsConstructor
@Builder // Permite usar o padrão Builder para criação de objetos de forma mais legível
@Getter  // Anotação que gera os métodos getters para os campos da classe
@Setter  // Anotação que gera os métodos setters para os campos da classe
public class EntidadeBase {

    // Definindo os atributos da classe EntidadeBase
    private String nome;  // Atributo que representa o nome (do tipo String)
    private int ano;      // Atributo que representa o ano (do tipo int)

}
