package com.lastsys.hexagonal.occ_clone.infraestructure.controllers;

import com.lastsys.hexagonal.occ_clone.application.services.PublicationService;
import com.lastsys.hexagonal.occ_clone.domain.models.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/publications")
public class PublicationController {
    @Autowired
    private final PublicationService publicationService;

    public PublicationController(PublicationService publicationService){
        this.publicationService = publicationService;
    }

    @PostMapping
    public ResponseEntity<Publication> createPublication(@RequestBody Publication publication){
        Publication createPublication = publicationService.createPublication(publication);

        return new ResponseEntity<>(createPublication, HttpStatus.CREATED);
    }

    @GetMapping("/{publicationId}")
    public ResponseEntity<Publication> getPublicationById(@PathVariable Long publicationId){
        return publicationService.getPublication(publicationId)
                .map(publication -> new ResponseEntity<>(publication, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Publication>> getAllPublications(){
        List<Publication> publicatons = publicationService.getAllPublications();
        return new ResponseEntity<>(publicatons, HttpStatus.OK);
    }

    @PutMapping("/{publicationId}")
    public ResponseEntity<Publication> updatePublication(@PathVariable Long publicationId, @RequestBody Publication updatePulication){
        return publicationService.updatePublication(publicationId, updatePulication)
                .map(publication -> new ResponseEntity<>(publication, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{publicationId}")
    public ResponseEntity<Void>  deletePublicationById(@PathVariable Long publicationId){
        if(publicationService.deletePublication(publicationId)){
            return new ResponseEntity<>(HttpStatus.OK);
        }else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
