
package domain;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Access(AccessType.PROPERTY)
public class Enrolment extends DomainEntity {

	private Date			creationMoment;
	private String			position;
	private StatusEnrolment	statusEnrolment;
	private Date			dropOutDate;

	private Member			member;
	private Brotherhood		brotherhood;


	@Past
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getCreationMoment() {
		return this.creationMoment;
	}

	public void setCreationMoment(final Date creationMoment) {
		this.creationMoment = creationMoment;
	}

	@Valid
	public String getPosition() {
		return this.position;
	}

	public void setPosition(final String position) {
		this.position = position;
	}

	@Valid
	@Enumerated(EnumType.STRING)
	public StatusEnrolment getStatusEnrolment() {
		return this.statusEnrolment;
	}

	public void setStatusEnrolment(final StatusEnrolment statusEnrolment) {
		this.statusEnrolment = statusEnrolment;
	}

	@Past
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	public Date getDropOutDate() {
		return this.dropOutDate;
	}

	public void setDropOutDate(final Date dropOutDate) {
		this.dropOutDate = dropOutDate;
	}

	@NotNull
	@ManyToOne(optional = false)
	public Member getMember() {
		return this.member;
	}

	public void setMember(final Member member) {
		this.member = member;
	}

	@NotNull
	@ManyToOne(optional = false)
	public Brotherhood getBrotherhood() {
		return this.brotherhood;
	}

	public void setBrotherhood(final Brotherhood brotherhood) {
		this.brotherhood = brotherhood;
	}

}