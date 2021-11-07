package com.ddigGroup.ddigGroup.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ddigGroup.ddigGroup.entidades.AnaliseSolo;

@Service
@Transactional
public class AnaliseSoloService extends BaseService<AnaliseSolo, JpaRepository<AnaliseSolo,String>> {

}
