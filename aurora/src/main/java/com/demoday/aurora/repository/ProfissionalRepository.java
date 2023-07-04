package com.demoday.aurora.repository;

import com.demoday.aurora.models.Profissional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.UUID;


@Repository
public interface ProfissionalRepository extends JpaRepository<Profissional, UUID> {


}
