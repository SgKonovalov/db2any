package ru.ucs.exe.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
@Service("ttableService")
public class RealService implements TtableService {

	// С помощью автосвязывания, получаем TtableRepository для работы с БД.
	
	@Autowired
	private TtableRepository ttableRepository;
	
	//Реализация метода. readOnly для минимизации блокировок при работе с БД.
	
	@Override
	@Transactional(readOnly=true)
	public Ttable findById(int ID) {
		return ttableRepository.findOne(ID);
	}
}