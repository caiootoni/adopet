package br.com.caiootoni.adopet.services;

import br.com.caiootoni.adopet.model.dto.AtualizarTutorDto;
import br.com.caiootoni.adopet.model.dto.CriarTutorDto;
import br.com.caiootoni.adopet.model.dto.TutorDto;
import br.com.caiootoni.adopet.model.entity.Tutor;
import br.com.caiootoni.adopet.repository.TutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TutorServiceImpl implements TutorService{
    private TutorRepository repository;
    public TutorServiceImpl(TutorRepository repository) {
        this.repository = repository;
    }

    @Override
    public TutorDto criarTutor(CriarTutorDto criarTutorDto) {
        Tutor tutor = repository.save(criarTutorDto.toEntity());
        return TutorDto.fromEntity(tutor);
    }

    @Override
    public List<TutorDto> exibirTutor() {
        List<Tutor> tutores = repository.findAll();
        return tutores.stream().map(TutorDto::fromEntity).collect(Collectors.toList());
    }

    @Override
    public TutorDto exibirTutorPorId(Long id) {
        Optional<Tutor> tutor = repository.findById(id);
        return TutorDto.fromEntity(tutor.get());
    }

    @Override
    public TutorDto atualizarTutorPorId(Long id, AtualizarTutorDto atualizarTutorDto) {
        Tutor tutor = repository.findById(id).get();
        tutor.setNome(atualizarTutorDto.nome());
        tutor.setTelefone(atualizarTutorDto.telefone());
        tutor.setNomeAnimal(atualizarTutorDto.nomeAnimal());
        tutor.setMensagem(atualizarTutorDto.mensagem());
        repository.save(tutor);
        return TutorDto.fromEntity(tutor);

    }

    @Override
    public void removerTutor(Long id) {
        repository.deleteById(id);
    }


}
