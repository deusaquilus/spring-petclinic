package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;

/**
 * One flat row of the owner-details pet/visit projection: one row per (pet,
 * visit) pair, visit columns null for pets without visits (left join).
 */
public class OwnerPetVisitRow {

	private final Integer petId;

	private final String petName;

	private final LocalDate birthDate;

	private final String typeName;

	private final Integer visitId;

	private final LocalDate visitDate;

	private final String visitDescription;

	public OwnerPetVisitRow(Integer petId, String petName, LocalDate birthDate, String typeName,
			Integer visitId, LocalDate visitDate, String visitDescription) {
		this.petId = petId;
		this.petName = petName;
		this.birthDate = birthDate;
		this.typeName = typeName;
		this.visitId = visitId;
		this.visitDate = visitDate;
		this.visitDescription = visitDescription;
	}

	public Integer getPetId() {
		return this.petId;
	}

	public String getPetName() {
		return this.petName;
	}

	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public Integer getVisitId() {
		return this.visitId;
	}

	public LocalDate getVisitDate() {
		return this.visitDate;
	}

	public String getVisitDescription() {
		return this.visitDescription;
	}

}
