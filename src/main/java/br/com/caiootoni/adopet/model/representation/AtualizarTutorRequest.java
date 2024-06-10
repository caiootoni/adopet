package br.com.caiootoni.adopet.model.representation;

import br.com.caiootoni.adopet.model.dto.AtualizarTutorDto;

public record AtualizarTutorRequest(String nome, String telefone, String nomeAnimal, String mensagem) {
    public AtualizarTutorDto toDto(){
        return new AtualizarTutorDto(nome,telefone,nomeAnimal,mensagem);
    }
}
