package br.com.caiootoni.adopet.controller;

import br.com.caiootoni.adopet.model.dto.TutorDto;
import br.com.caiootoni.adopet.model.representation.CriarTutorRequest;
import br.com.caiootoni.adopet.model.representation.TutorResponse;
import br.com.caiootoni.adopet.services.TutorService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    private final TutorService service;
    private ModelMapper modelMapper = new ModelMapper();

    public TutorController(TutorService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<TutorResponse> criarTutor(@RequestBody CriarTutorRequest criarTutorRequest){
        var response = service.criarTutor(criarTutorRequest);
        return ResponseEntity.status(200).body(response);
    }
}
