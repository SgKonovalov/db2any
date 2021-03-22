package ru.ucs.exe.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.ucs.exe.DAO.Ttable;

/*
 * ћодель данных дл€ составлени€ ответа в JSON. явл€етс€ bean'ом дл€ контейнера Spring.
 * —одержит свойства:
 * 1. data Ц данные из строки Ѕƒ. ƒл€ работы использовано автосв€зывание.
 * 2. response Ц результат выполнени€ операции;
 * 3. request Ц номер заданного ID при поиске.
 * */

@Component("answer")
public class Answer {

	@Autowired
	private Ttable data;

	private String response;

	private int request;

	public Ttable getData() {
		return data;
	}

	public void setData(Ttable data) {
		this.data = data;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public int getRequest() {
		return request;
	}

	public void setRequest(int request) {
		this.request = request;
	}
}