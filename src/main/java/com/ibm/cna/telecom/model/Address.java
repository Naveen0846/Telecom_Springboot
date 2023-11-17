package com.ibm.cna.telecom.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "address")
@Data

public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private Integer add_id;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "zip_code")
	private Integer zipCode;

}
