package ru.ucs.exe.DAO;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

/*
 * ������, ��������������� ������ ��� ��������� ������ �� ��.
 * */

public interface TtableService {
	
	/*� ����� ������ - ������� ����� Spring Data ��� ������ �� ID
	 * ��������� ����� = SELECT * FROM ttable WHERE id = ?
	 * �� ����� �������� �������� ID ��� ������.
	 * */

	public Ttable findById(int ID);

}