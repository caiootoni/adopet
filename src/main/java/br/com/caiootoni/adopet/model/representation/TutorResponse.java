package br.com.caiootoni.adopet.model.representation;

import br.com.caiootoni.adopet.model.dto.TutorDto;

public record TutorResponse(
        Long id,
        String nome,
        String telefone,
        String nomeAnimal,
        String mensagem) {
    public static TutorResponse fromDto(TutorDto dto) {
        return new TutorResponse(dto.id(), dto.nome(), dto.telefone(), dto.nomeAnimal(), dto.mensagem());
    }
}
