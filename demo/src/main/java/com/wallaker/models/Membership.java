package com.wallaker.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="memberships")
public class Membership {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private int membershipId;
	
	@Column(nullable=false, unique=true)
	private String membership;

	
	@Column
	private String exclusions;
	
	

}
