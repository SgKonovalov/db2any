package ru.ucs.exe.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.ucs.exe.DAO.TtableService;
import ru.ucs.exe.Model.Answer;

@Controller
@RequestMapping("bykey/getjson")
public class TtableController {

	//Получаем bean для работы с БД и выполнения запросов.
	@Autowired
	private TtableService ttableService;

	/*
	 * Метод для отправки данных Клиенту.
	 * Осуществляет поиск по заданному в поисковом запросе ID.
	 * Как параметр получаем на вход значение ID.
	 * */
	
	@RequestMapping(value = "key={id}", method = RequestMethod.GET)
	@ResponseBody
	public Answer finded(@PathVariable int id) {

		Answer result = new Answer();
		String inResponse;
		
		/*
		 * В блоке try/catch «отлавливаем» все ошибки.
		 * В случае их отстутсвия присваиваем свойству «response» модели Answer значение “ok”.
		 * В случае ошибки – сообщение об ошибке + все данные.
		 * */

		try {
			result.setData(ttableService.findById(id));
			
			//В блоке if/else обрабатываем null-значение из БД (если заданного ID не существует).
			
			if (ttableService.findById(id) == null)
				inResponse = "No data with that ID.";
			else
				inResponse = "ok";
		} catch (Exception allex) {
			inResponse = allex.getMessage();
			}

		result.setResponse(inResponse);
		result.setRequest(id);

		return result;
	}
}