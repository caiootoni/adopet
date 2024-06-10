package br.com.caiootoni.adopet.model.dto;

import br.com.caiootoni.adopet.model.entity.Tutor;

public record CriarTutorDto(String nome, String telefone, String nomeAnimal, String mensagem) {
    public Tutor toEntity(){
        return new Tutor(0L,nome,telefone,nomeAnimal,mensagem);
    }
}
