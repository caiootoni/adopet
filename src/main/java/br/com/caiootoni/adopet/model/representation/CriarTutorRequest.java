package br.com.caiootoni.adopet.model.representation;

import br.com.caiootoni.adopet.model.dto.CriarTutorDto;

public record CriarTutorRequest(String nome, String telefone, String nomeAnimal, String mensagem){
    public CriarTutorDto toDto(){
        return new CriarTutorDto(nome, telefone, nomeAnimal, mensagem);
    }
}

