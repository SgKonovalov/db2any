package ru.ucs.exe.DAO;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

/*
 * Сервис, предоставляющий методы для обработки данных из БД.
 * */

public interface TtableService {
	
	/*В нашем случае - штатный метод Spring Data для поиска по ID
	 * Настоящий метод = SELECT * FROM ttable WHERE id = ?
	 * На входе получает параметр ID для работы.
	 * */

	public Ttable findById(int ID);

}