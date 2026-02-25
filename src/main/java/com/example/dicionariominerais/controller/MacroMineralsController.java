package com.example.dicionariominerais.controller;

import com.example.dicionariominerais.entity.MacroMinerals;
import com.example.dicionariominerais.repository.MacroMineralsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = {"${frontend.master}"})
@RestController
@RequestMapping("/macro-minerals")
public class MacroMineralsController {

    @Autowired
    private MacroMineralsRepository macroMineralsRepository;

    @PostMapping
    public ResponseEntity<MacroMinerals> criarMacroMineral(@RequestBody MacroMinerals mineral) {
        MacroMinerals salvo = macroMineralsRepository.save(mineral);
        return ResponseEntity.ok(salvo);
    }

    @GetMapping
    public ResponseEntity<List<MacroMinerals>> listarMacroMinerais() {
        List<MacroMinerals> minerais = macroMineralsRepository.findAll();
        return ResponseEntity.ok(minerais);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MacroMinerals> buscarPorIdMacroMinerals(@PathVariable Long id) {
        Optional<MacroMinerals> mineral = macroMineralsRepository.findById(id);
        return mineral.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
