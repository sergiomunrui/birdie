package com.example.birdie.repository;

import com.example.birdie.entity.Ave;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AveRepository extends JpaRepository<Ave,Integer> {
}
