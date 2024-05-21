package br.com.caiootoni.adopet.services;

import br.com.caiootoni.adopet.model.dto.TutorDto;
import br.com.caiootoni.adopet.model.entity.Tutor;
import br.com.caiootoni.adopet.model.representation.CriarTutorRequest;
import br.com.caiootoni.adopet.model.representation.TutorResponse;
import br.com.caiootoni.adopet.repository.TutorRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class TutorServiceImpl implements TutorService{
    private TutorRepository repository;
    private ModelMapper modelMapper = new ModelMapper();

    public TutorServiceImpl(TutorRepository repository) {
        this.repository = repository;
    }

    @Override
    public TutorResponse criarTutor(CriarTutorRequest criarTutorRequest) {
        var tutor = this.modelMapper.map(criarTutorRequest,Tutor.class);
        var tutorSalvo = repository.save(tutor);

        return this.modelMapper.map(tutorSalvo, TutorResponse.class);

    }
}
