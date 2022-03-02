package com.wallaker.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="members_memberships")
public class MembersMemberships {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ownedMembershipId;
	
	@Column(nullable=false)
	private int memberUsername;
	
	@Column
	private String membershipOwned;
	
	@Column(nullable=false)
	private String datePurchased;
	
	@Column
	private String dateExpires;
	
	@Column
	private String classesLeft;
	
	

}
