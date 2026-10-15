package org.springframework.samples.petclinic.owner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * View model for one pet row of the owner details page, grouped from flat
 * {@link OwnerPetVisitRow}s. Property names mirror the template's usage:
 * pet.id, pet.name, pet.birthDate (LocalDate for #temporals), pet.type (the
 * type name string, as NamedEntity.toString() rendered before), pet.visits
 * with visit.date / visit.description.
 */
public class PetSummary {

	private final Integer id;

	private final String name;

	private final LocalDate birthDate;

	private final String type;

	private final List<VisitSummary> visits = new ArrayList<>();

	public PetSummary(Integer id, String name, LocalDate birthDate, String type) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.type = type;
	}

	public Integer getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	public String getType() {
		return this.type;
	}

	public List<VisitSummary> getVisits() {
		return this.visits;
	}

	public void addVisit(VisitSummary visit) {
		this.visits.add(visit);
	}

	public static class VisitSummary {

		private final Integer id;

		private final LocalDate date;

		private final String description;

		public VisitSummary(Integer id, LocalDate date, String description) {
			this.id = id;
			this.date = date;
			this.description = description;
		}

		public Integer getId() {
			return this.id;
		}

		public LocalDate getDate() {
			return this.date;
		}

		public String getDescription() {
			return this.description;
		}

	}

}
