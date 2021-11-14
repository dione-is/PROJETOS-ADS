package com.ddigGroup.ddigGroup.services;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ddigGroup.ddigGroup.entidades.Funcionario;
import com.ddigGroup.ddigGroup.repositorys.FuncionarioRepository;

import com.ddigGroup.ddigGroup.entidades.Relatorio;

@Service
@Transactional
public class RelatorioService extends BaseService<Relatorio, JpaRepository<Relatorio,String>> {

}
