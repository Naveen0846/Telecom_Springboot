package com.ibm.cna.telecom.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;
//this is nothing but our pojo class

@Entity
@Table(name = "connection")
@Data
@ToString
public class Connection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "connectionNumber")
	private String connectionNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "connectionPlan")
	private String connectionPlan;

	@Column(name = "name")
	private String name;

	@Column(name = "status")
	private String status;

	@Enumerated(EnumType.STRING)
	private plan plandetails;

}
