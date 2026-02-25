package com.example.dicionariominerais.controller;

import com.example.dicionariominerais.entity.Minerals;
import com.example.dicionariominerais.repository.MineralsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"${frontend.staging}"})
@RestController
@RequestMapping("/minerals")
public class MineralsController {
    @Autowired
    private MineralsRepository mineralsRepository;

    @PostMapping
    public ResponseEntity<Minerals> criarMineral(@RequestBody Minerals mineral) {
        Minerals salvo = mineralsRepository.save(mineral);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping
    public ResponseEntity<List<Minerals>> listarMinerais() {
        List<Minerals> minerais = mineralsRepository.findAll();
        return ResponseEntity.ok(minerais);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Minerals> buscarPorId(@PathVariable Long id) {
        Optional<Minerals> mineral = mineralsRepository.findById(id);
        return mineral.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
