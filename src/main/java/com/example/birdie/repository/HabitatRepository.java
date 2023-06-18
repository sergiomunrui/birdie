package com.example.birdie.repository;

import com.example.birdie.entity.Habitat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitatRepository extends JpaRepository<Habitat,Integer> {
}
