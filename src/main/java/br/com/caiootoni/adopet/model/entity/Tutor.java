package br.com.caiootoni.adopet.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tutores")
public class Tutor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 2, max = 50, message = "O nome deve ter entre 2 e 50 caracteres")
    private String nome;

    @NotBlank(message = "O telefone é obrigatório")
    @Pattern(regexp = "\\(\\d{2}\\) \\d{4,5}-\\d{4}", message = "O telefone deve seguir o padrão (XX) XXXXX-XXXX")
    private String telefone;

    @NotBlank(message = "O nome é obrigatório")
    @Size(min = 2, max = 50, message = "O nome deve ter entre 2 e 50 caracteres")
    private String nomeAnimal;

    @NotBlank(message = "A mensagem é obrigatória")
    @Size(max = 500, message = "A mensagem não deve exceder 500 caracteres")
    private String mensagem;

    public Tutor() {
    }

    public Tutor(Long id,String nome, String telefone, String nomeAnimal, String mensagem) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.nomeAnimal = nomeAnimal;
        this.mensagem = mensagem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
}
