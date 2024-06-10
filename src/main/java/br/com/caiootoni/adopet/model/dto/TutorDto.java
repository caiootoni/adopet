package br.com.caiootoni.adopet.model.dto;

import br.com.caiootoni.adopet.model.entity.Tutor;

public record TutorDto (
     Long id,
     String nome,
     String telefone,
     String nomeAnimal,
     String mensagem){
    public static TutorDto fromEntity(Tutor tutor){
        return new TutorDto(tutor.getId(), tutor.getNome(), tutor.getTelefone(), tutor.getNomeAnimal(), tutor.getMensagem());
    }
}
