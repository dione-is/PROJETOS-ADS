package com.ddigGroup.ddigGroup.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ddigGroup.ddigGroup.entidades.Terreno;
import com.ddigGroup.ddigGroup.repositorys.TerrenoRepository;

@Service
@Transactional
public class TerrenoService extends BaseService<Terreno, JpaRepository< Terreno,String>>{
	

}
