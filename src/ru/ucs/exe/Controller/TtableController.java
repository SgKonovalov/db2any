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

	//�������� bean ��� ������ � �� � ���������� ��������.
	@Autowired
	private TtableService ttableService;

	/*
	 * ����� ��� �������� ������ �������.
	 * ������������ ����� �� ��������� � ��������� ������� ID.
	 * ��� �������� �������� �� ���� �������� ID.
	 * */
	
	@RequestMapping(value = "key={id}", method = RequestMethod.GET)
	@ResponseBody
	public Answer finded(@PathVariable int id) {

		Answer result = new Answer();
		String inResponse;
		
		/*
		 * � ����� try/catch ������������ ��� ������.
		 * � ������ �� ���������� ����������� �������� �response� ������ Answer �������� �ok�.
		 * � ������ ������ � ��������� �� ������ + ��� ������.
		 * */

		try {
			result.setData(ttableService.findById(id));
			
			//� ����� if/else ������������ null-�������� �� �� (���� ��������� ID �� ����������).
			
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