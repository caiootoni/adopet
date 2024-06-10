package br.com.caiootoni.adopet.services;

import br.com.caiootoni.adopet.model.dto.AtualizarTutorDto;
import br.com.caiootoni.adopet.model.dto.CriarTutorDto;
import br.com.caiootoni.adopet.model.dto.TutorDto;
import br.com.caiootoni.adopet.model.representation.CriarTutorRequest;
import br.com.caiootoni.adopet.model.representation.TutorResponse;

import java.util.List;
import java.util.Optional;

public interface TutorService {
    TutorDto criarTutor(CriarTutorDto criarTutorDto);
    List<TutorDto> exibirTutor();
    TutorDto exibirTutorPorId(Long id);
    TutorDto atualizarTutorPorId(Long id, AtualizarTutorDto atualizarTutorDto);
    void removerTutor(Long id);
}
