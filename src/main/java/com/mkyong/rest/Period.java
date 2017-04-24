package com.mkyong.rest;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.sun.istack.NotNull;
import com.sun.istack.Nullable;

import java.time.ZonedDateTime;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = CustomPeriod.class, name = "CUSTOM_PERIOD")})
//		@JsonSubTypes.Type(value = PreviousMonth.class, name = "PREVIOUS_MONTH"),
//		@JsonSubTypes.Type(value = PreviousQuarter.class, name = "PREVIOUS_QUARTER"),
//		@JsonSubTypes.Type(value = PreviousWeek.class, name = "PREVIOUS_WEEK"),
//		@JsonSubTypes.Type(value = PreviousYear.class, name = "PREVIOUS_YEAR"),
//		@JsonSubTypes.Type(value = ThisMonth.class, name = "THIS_MONTH"),
//		@JsonSubTypes.Type(value = ThisQuarter.class, name = "THIS_QUARTER"),
//		@JsonSubTypes.Type(value = ThisWeek.class, name = "THIS_WEEK"),
//		@JsonSubTypes.Type(value = ThisYear.class, name = "THIS_YEAR"),
//		@JsonSubTypes.Type(value = Yesterday.class, name = "YESTERDAY"),
//		@JsonSubTypes.Type(value = Today.class, name = "TODAY")})
//@ApiModel(description = "Represents Timerange defined by upper and lower time boundaries. Use subclasses.", discriminator = "type")
////todo https://github.com/swagger-api/swagger-ui/issues/1052 - wee need to display model  see ENC-3663
public abstract class Period {

	/**
	 * @param now time relative to which to calculate start of this period
	 * @return start of the period, relative to the specified time
	 */
	@Nullable
	public abstract ZonedDateTime getStart(@NotNull ZonedDateTime now);

	/**
	 * @param now time relative to which to calculate end of this period
	 * @return end of the period, relative to the specified time
	 */
	@Nullable
	public ZonedDateTime getEnd(@NotNull ZonedDateTime now) {
		return null;
	}

	@Override
	public int hashCode() {
		return this.getClass().hashCode();
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		return other != null && other.getClass() == this.getClass();
	}
}