/**
 * 
 */
package com.paypal.bfs.test.bookingserv.api.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author ANKIT RATHOD
 *
 */
@Entity
public class BookingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotBlank(message = "first name should not be blank")
	@NotEmpty(message = "first name should be empty")
	@NotNull(message = "first name is mandatory")
	private String first_name;
	@NotBlank(message = "last name should not be blank")
	@NotEmpty(message = "last  name should be empty")
	@NotNull(message = "last name is mandatory")
	private String last_name;
	private LocalDate dateOfBirth;
	private LocalDateTime checkinDate;
	private LocalDateTime checkoutDate;
	private double totalPrice;
	private double deposit;
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public BookingEntity() {

	}

	public BookingEntity(long id, String first_name, String last_name, LocalDate dateOfBirth, LocalDateTime checkinDate,
			LocalDateTime checkoutDate, double totalPrice, double deposit, Address address) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dateOfBirth = dateOfBirth;
		this.checkinDate = checkinDate;
		this.checkoutDate = checkoutDate;
		this.totalPrice = totalPrice;
		this.deposit = deposit;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDateTime getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(LocalDateTime checkinDate) {
		this.checkinDate = checkinDate;
	}

	public LocalDateTime getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(LocalDateTime checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, checkinDate, checkoutDate, dateOfBirth, deposit, first_name, id, last_name,
				totalPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookingEntity other = (BookingEntity) obj;
		return Objects.equals(address, other.address) && Objects.equals(checkinDate, other.checkinDate)
				&& Objects.equals(checkoutDate, other.checkoutDate) && Objects.equals(dateOfBirth, other.dateOfBirth)
				&& Double.doubleToLongBits(deposit) == Double.doubleToLongBits(other.deposit)
				&& Objects.equals(first_name, other.first_name) && id == other.id
				&& Objects.equals(last_name, other.last_name)
				&& Double.doubleToLongBits(totalPrice) == Double.doubleToLongBits(other.totalPrice);
	}

	@Override
	public String toString() {
		return "BookingEntity [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", dateOfBirth="
				+ dateOfBirth + ", checkinDate=" + checkinDate + ", checkoutDate=" + checkoutDate + ", totalPrice="
				+ totalPrice + ", deposit=" + deposit + ", address=" + address + "]";
	}

}
