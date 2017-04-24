package com.mkyong.rest;

//import com.sun.istack.NotNull;

import java.beans.ConstructorProperties;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Objects;

//@ApiModel(description = "Allows to search for data from range that is set by start and end parameters.", parent = Period.class)
public class CustomPeriod extends Period {

//	@ApiModelProperty(value = "First day (inclusive) of the period in the client's timezone. Defaults to the beginning of all time.")
	private final LocalDate start;
//	@ApiModelProperty(value = "Last day (exclusive) of the period in the client's timezone. Defaults to the end of all time.")
	private final LocalDate end;

	@ConstructorProperties({"start", "end"})
	public CustomPeriod(LocalDate start, LocalDate end) {
		this.start = start;
		this.end = end;
	}

//	/**
//	 * Constructor.
//	 *
//	 * @param years  the amount
//	 * @param months the amount
//	 * @param days   the amount
//	 */
//	private CustomPeriod(int years, int months, int days) {
//		super(years, months, days);
//	}

//	@Nullable
//	@Override
//	public ZonedDateTime getStart(@NotNull ZonedDateTime now) {
//		return start != null ? start.atStartOfDay(now.getZone()) : null;
//	}
//
//	@Nullable
//	@Override
//	public ZonedDateTime getEnd(@NotNull ZonedDateTime now) {
//		return end != null ? end.plusDays(1).atStartOfDay(now.getZone()) : null;
//	}


	public LocalDate getStart() {
		return start;
	}

	public LocalDate getEnd() {
		return end;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (other == null || getClass() != other.getClass()) {
			return false;
		}
		CustomPeriod that = (CustomPeriod) other;
		return Objects.equals(start, that.start)
				&& Objects.equals(end, that.end);
	}

	@Override
	public ZonedDateTime getStart(ZonedDateTime now) {
		return null;
	}

	@Override
	public int hashCode() {
		return Objects.hash(start, end);
	}
}