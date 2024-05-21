package br.com.caiootoni.adopet.model.representation;

public class TutorResponse {
    private String nome;
    private String telefone;
    private String nomeAnimal;
    private String mensagem;

    public TutorResponse() {
    }

    public TutorResponse(String nome, String telefone, String nomeAnimal, String mensagem) {
        this.nome = nome;
        this.telefone = telefone;
        this.nomeAnimal = nomeAnimal;
        this.mensagem = mensagem;
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
