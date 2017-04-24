package com.mkyong.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
//import com.zoomint.encourage.model.search.CommunicationType;
//import com.zoomint.encourage.model.search.Direction;
//import org.apache.commons.lang3.StringUtils;
//import org.jetbrains.annotations.NotNull;
//import org.jetbrains.annotations.Nullable;
//import org.springframework.data.annotation.Id;
//import org.springframework.data.annotation.LastModifiedDate;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//import static com.esotericsoftware.kryo.serializers.TaggedFieldSerializer.Tag;
import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toSet;

public class Conversation {

	private String conversationId;
	/**
	 * Time of the last recorded change to this conversation or any part of it, such a new event being registered.
	 */
	private Instant lastUpdated;

	private Instant start;

	/**
	 * Duration of the conversation, including the time in-between separate instances of communication (e.g., calls).
	 */
	private Duration duration;

	/**
	 * Direction of the conversation, usually based on the first communication (e.g., call) within the conversation.
	 */
//	private Direction direction;

	/**
	 * List of communication types in this conversation, each type of communication can repeat multiple times.
	 * For example, 3 calls with screen recording it could look like Call, Screen, Call, Screen, Call, Screen.
	 */
	@JsonDeserialize(as = LinkedHashSet.class)
	private Set<CommunicationType> communicationTypes;

	/**
	 * All (distinct) participants in the order in which they joined the conversation.
	 */
//	private List<ConversationParticipant> participants;
//
//	// ignore the value when de-serialize
//	@JsonProperty(access = JsonProperty.Access.READ_ONLY)
//	private Float score;

	/** This constructor does not set any default data.
	 *
	 * @param conversationId id of conversation
	 */

	public Conversation (String conversationId){
		this.conversationId = conversationId;

	}

	/**
	 * Creates a new conversation with {@link Instant#now()} lastUpdated and empty mutable list of events.
	 */
//	public Conversation() {
//		this(null, Instant.now(), new ArrayList<>());
//	}

//	public Conversation( String conversationId,  Instant lastUpdated,
//	                     List<ConversationEvent> events,
//	                     Direction direction,  Instant start, Duration duration,
//	                     Set<CommunicationType> communicationTypes,
//	                     List<ConversationParticipant> participants) {
//		this.conversationId = conversationId;
//		this.lastUpdated = requireNonNull(lastUpdated);
//		this.direction = requireNonNull(direction);
//		this.start = start;
//		this.duration = duration;
//		this.communicationTypes = requireNonNull(communicationTypes);
//		this.participants = requireNonNull(participants);
//	}

//	@NotNull
	private List<ConversationEvent> events;

	@JsonIgnore
	public List<ConversationEvent> getEvents() {
		return events;
	}

	public void setEvents(List<ConversationEvent> events) {
		this.events = events;
	}

	public String getConversationId() {
		return conversationId;
	}

	public void setConversationId( String conversationId) {
		this.conversationId = conversationId;
	}

	@JsonIgnore
	public Instant getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated( Instant lastUpdated) {
		this.lastUpdated = requireNonNull(lastUpdated);
	}

	@JsonIgnore
	public Instant getStart() {
		return start;
	}

	public void setStart( Instant start) {
		this.start = start;
	}

	@JsonIgnore
	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	
//	public Direction getDirection() {
//		return direction;
//	}
//
//	public void setDirection( Direction direction) {
//		this.direction = requireNonNull(direction);
//	}

	@JsonIgnore
	public Set<CommunicationType> getCommunicationTypes() {
		return communicationTypes;
	}

	public void setCommunicationTypes( Set<CommunicationType> communicationTypes) {
		this.communicationTypes = requireNonNull(communicationTypes);
	}

//
//	public List<ConversationParticipant> getParticipants() {
//		return participants;
//	}
//
//	public void setParticipants( List<ConversationParticipant> participants) {
//		this.participants = requireNonNull(participants);
//	}
//
//	public Float getScore() {
//		return score;
//	}
//
//	public void setScore(Float score) {
//		this.score = score;
//	}

	@Override
	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		return other instanceof Conversation
				&& conversationId != null
				&& conversationId.equals(((Conversation) other).getConversationId());
	}

	@Override
	public int hashCode() {
		return conversationId != null ? conversationId.hashCode() : super.hashCode();
	}

	@Override
	public String toString() {
		return "Conversation{" +
				"conversationId='" + conversationId + '\'' +
				", lastUpdated=" + lastUpdated +
//				", events=" + events +
				", start=" + start +
				", duration=" + duration +
//				", direction=" + direction +
				", communicationTypes=" + communicationTypes +
//				", participants=" + participants +
//				", score=" + score +
				'}';
	}
}