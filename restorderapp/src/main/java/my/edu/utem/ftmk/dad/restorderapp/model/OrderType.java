package my.edu.utem.ftmk.dad.restorderapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
@Entity
@Table(name="ordertype")
/*This class is for the ordertype and it will auto-increment the id and 
the orderTypeId is the primary key */
public class OrderType {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="OrderTypeId") 
	private int orderTypeId;
	@Column(name="Code") 
	private String code;
	@Column(name="Name") 
	private String name;
	public int getOrderTypeId() {
		return orderTypeId;
	}
	public void setOrderTypeId(int orderTypeId) {
		this.orderTypeId = orderTypeId;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
