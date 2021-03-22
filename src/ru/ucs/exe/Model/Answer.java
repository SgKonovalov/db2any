package ru.ucs.exe.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import ru.ucs.exe.DAO.Ttable;

/*
 * ������ ������ ��� ����������� ������ � JSON. �������� bean'�� ��� ���������� Spring.
 * �������� ��������:
 * 1. data � ������ �� ������ ��. ��� ������ ������������ ��������������.
 * 2. response � ��������� ���������� ��������;
 * 3. request � ����� ��������� ID ��� ������.
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