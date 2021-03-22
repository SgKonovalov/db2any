package ru.ucs.exe.DAO;

import static javax.persistence.GenerationType.IDENTITY;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Сущности из таблицы БД.
 * Реализация с помощью Hibernate.
 * */

@Entity
@Table(name="ttable")
public class Ttable implements Serializable {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name="id_column")
	private int ID;
	
	@Column(name="value_column")
	private String VALUE;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getVALUE() {
		return VALUE;
	}
	public void setVALUE(String vALUE) {
		VALUE = vALUE;
	}
}