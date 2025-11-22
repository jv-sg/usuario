package com.joao.usuario.infrastructure.repository;

import com.joao.usuario.infrastructure.entity.Telefone;
import com.joao.usuario.infrastructure.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}