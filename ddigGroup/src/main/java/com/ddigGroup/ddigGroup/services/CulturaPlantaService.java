package com.ddigGroup.ddigGroup.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ddigGroup.ddigGroup.entidades.CulturaPlanta;

@Service
@Transactional
public class CulturaPlantaService extends BaseService<CulturaPlanta, JpaRepository<CulturaPlanta,String>>{

}
