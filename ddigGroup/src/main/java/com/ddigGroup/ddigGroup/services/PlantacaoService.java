package com.ddigGroup.ddigGroup.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ddigGroup.ddigGroup.entidades.Plantacao;

@Service
@Transactional
public class PlantacaoService extends BaseService<Plantacao, JpaRepository<Plantacao,String>> {

}
