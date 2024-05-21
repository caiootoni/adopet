package br.com.caiootoni.adopet.model.dto;

public class TutorDto {
    private Long id;
    private String nome;
    private String telefone;
    private String nomeAnimal;
    private String mensagem;

    public TutorDto() {
    }

    public TutorDto(Long id, String nome, String telefone, String nomeAnimal, String mensagem) {
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
