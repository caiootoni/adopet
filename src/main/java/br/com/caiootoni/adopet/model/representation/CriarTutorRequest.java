package br.com.caiootoni.adopet.model.representation;

public class CriarTutorRequest{
    private String telefone;
    private String nome;
    private String nomeAnimal;
    private String mensagem;

    public CriarTutorRequest() {
    }

    public CriarTutorRequest(String telefone, String nome, String nomeAnimal, String mensagem) {
        this.telefone = telefone;
        this.nome = nome;
        this.nomeAnimal = nomeAnimal;
        this.mensagem = mensagem;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

