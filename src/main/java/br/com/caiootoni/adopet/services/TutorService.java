package br.com.caiootoni.adopet.services;

import br.com.caiootoni.adopet.model.dto.TutorDto;
import br.com.caiootoni.adopet.model.representation.CriarTutorRequest;
import br.com.caiootoni.adopet.model.representation.TutorResponse;

public interface TutorService {
    TutorResponse criarTutor(CriarTutorRequest tutor);
}
