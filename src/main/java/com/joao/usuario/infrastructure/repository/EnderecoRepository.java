package com.joao.usuario.infrastructure.repository;

import com.joao.usuario.infrastructure.entity.Endereco;
import com.joao.usuario.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
