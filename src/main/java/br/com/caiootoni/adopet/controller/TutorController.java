package br.com.caiootoni.adopet.controller;

import br.com.caiootoni.adopet.model.dto.CriarTutorDto;
import br.com.caiootoni.adopet.model.dto.TutorDto;
import br.com.caiootoni.adopet.model.entity.Tutor;
import br.com.caiootoni.adopet.model.representation.AtualizarTutorRequest;
import br.com.caiootoni.adopet.model.representation.CriarTutorRequest;
import br.com.caiootoni.adopet.model.representation.TutorResponse;
import br.com.caiootoni.adopet.services.TutorService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    private final TutorService service;

    public TutorController(TutorService service) {
        this.service = service;
    }

    @PostMapping
    @Transactional
    public ResponseEntity<TutorResponse> criarTutor(@RequestBody  @Valid CriarTutorRequest criarTutorRequest){
        TutorResponse tutorResponse = TutorResponse.fromDto(service.criarTutor(criarTutorRequest.toDto()));
        return ResponseEntity.ok(tutorResponse);
    }
    @GetMapping
    @Transactional
    public ResponseEntity<List<TutorResponse>> exibirTutores(){
        List<TutorResponse> responses = service.exibirTutor().stream().map(TutorResponse::fromDto).collect(Collectors.toList());
        return ResponseEntity.ok(responses);

    }
    @GetMapping("/{id}")
    @Transactional
    public ResponseEntity<TutorResponse> exibirTutorPorId(@PathVariable("id") Long id){
        TutorResponse response = TutorResponse.fromDto(service.exibirTutorPorId(id));
        return ResponseEntity.ok(response);
    }
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity<TutorResponse> atualizarTutorPorId(@PathVariable("id") Long id, @RequestBody  @Valid AtualizarTutorRequest atualizarTutorRequest){
        TutorResponse response = TutorResponse.fromDto(service.atualizarTutorPorId(id, atualizarTutorRequest.toDto()));
        return ResponseEntity.ok(response);
    }
    @DeleteMapping("/{id}")
    @Transactional
    public ResponseEntity<Void> excluirTutorPorId(@PathVariable("id") Long id){
        service.removerTutor(id);
        return ResponseEntity.noContent().build();
    }
}
