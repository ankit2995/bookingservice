/**
 * 
 */
package com.paypal.bfs.test.bookingserv.api.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ANKIT RATHOD
 *
 */
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String line1;
	private String line2;
	private String city;
	private String state;
	private long zip_code;

	public Address() {

	}

	public Address(long id, String line1, String line2, String city, String state, long zip_code) {
		super();
		this.id = id;
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.zip_code = zip_code;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZip_code() {
		return zip_code;
	}

	public void setZip_code(long zip_code) {
		this.zip_code = zip_code;
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, line1, line2, state, zip_code);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(line1, other.line1)
				&& Objects.equals(line2, other.line2) && Objects.equals(state, other.state)
				&& zip_code == other.zip_code;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state=" + state + ", zip_code="
				+ zip_code + "]";
	}

}
