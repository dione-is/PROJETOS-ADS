package com.ddigGroup.ddigGroup.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.ddigGroup.ddigGroup.entidades.MonitoramentoPlantio;

@Service
@Transactional
public class MonitoramentoPlantioService extends BaseService<MonitoramentoPlantio, JpaRepository<MonitoramentoPlantio,String>> {

}
