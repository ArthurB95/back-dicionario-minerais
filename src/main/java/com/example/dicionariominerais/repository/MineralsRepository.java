package com.example.dicionariominerais.repository;

import com.example.dicionariominerais.entity.Minerals;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MineralsRepository extends JpaRepository<Minerals, Long> {
}
