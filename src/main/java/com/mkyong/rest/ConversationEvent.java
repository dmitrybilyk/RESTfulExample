package com.mkyong.rest;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
//import com.zoomint.encourage.model.conversation.event.ChatEvent;
//import com.zoomint.encourage.model.conversation.event.EmailEvent;
//import com.zoomint.encourage.model.conversation.event.EndedScreenEvent;
//import com.zoomint.encourage.model.conversation.event.JoinedCallEvent;
//import com.zoomint.encourage.model.conversation.event.LeftCallEvent;
//import com.zoomint.encourage.model.conversation.event.MetadataEvent;
//import com.zoomint.encourage.model.conversation.event.PhraseOccurrenceEvent;
//import com.zoomint.encourage.model.conversation.event.StartedCallEvent;
//import com.zoomint.encourage.model.conversation.event.StartedScreenEvent;
//import com.zoomint.encourage.model.conversation.event.TagEvent;

import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

//import static com.esotericsoftware.kryo.serializers.TaggedFieldSerializer.Tag;

//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", visible = true)
//@JsonSubTypes({
//				@JsonSubTypes.Type(MetadataEvent.class),
//		@JsonSubTypes.Type(PhraseOccurrenceEvent.class),
//		@JsonSubTypes.Type(TagEvent.class),
//		@JsonSubTypes.Type(StartedCallEvent.class),
//		@JsonSubTypes.Type(JoinedCallEvent.class),
//		@JsonSubTypes.Type(LeftCallEvent.class),
//		@JsonSubTypes.Type(StartedScreenEvent.class),
//		@JsonSubTypes.Type(EndedScreenEvent.class),
//		@JsonSubTypes.Type(EmailEvent.class),
//		@JsonSubTypes.Type(ChatEvent.class)
//})
public abstract class ConversationEvent {

	/**
	 * (Optional) correlation ID used to group events together.
	 */
//	@Tag(1)
	private Set<String> correlationIds = new HashSet<String>();
	/**
	 * (Optional) start of the event. With no duration, this is also the end of the event.
	 */
//	@Tag(2)
	private ZonedDateTime start;
	/**
	 * (Optional) resource where the event occurred.
	 */
//	@Tag(3)
//	private ConversationResource resource;
	/**
	 * (Optional) participant that caused the event to occur.
	 */
//	@Tag(4)
//	private ConversationParticipant participant;

//	@Tag(5)
	@JsonTypeId
	private String type;

	public ConversationEvent() {
	}

	public ConversationEvent(Set<String> correlationIds,
													 ZonedDateTime start,
//													 ConversationResource resource,
//													 ConversationParticipant participant,
													 String type) {
		this.correlationIds = Objects.requireNonNull(correlationIds);
		this.start = start;
//		this.resource = resource;
//		this.participant = participant;
		this.type = type;
	}

	public String getType() {
		return type;
	}

	public Set<String> getCorrelationIds() {
		return correlationIds;
	}

	public void setCorrelationIds(Set<String> correlationIds) {
		this.correlationIds = Objects.requireNonNull(correlationIds);
	}

	public void addCorrelationId(String correlationId){
		this.correlationIds.add(correlationId);
	}

	public void addCorrelationIds(Collection<String> correlationIds) {
		this.correlationIds.addAll(correlationIds);
	}

	public ZonedDateTime getStart() {
		return start;
	}

	public void setStart(ZonedDateTime start) {
		this.start = start;
	}
//
//	public ConversationResource getResource() {
//		return resource;
//	}
//
//	public void setResource(ConversationResource resource) {
//		this.resource = resource;
//	}

	/**
	 * Returns only the originator participant (f.e. email address from, chat address from, etc)
	 * @return originator participant
	 */
//	public ConversationParticipant getParticipant() {
//		return participant;
//	}
//
//	public void setParticipant(ConversationParticipant participant) {
//		this.participant = participant;
//	}

	/**
	 * Returns all participants. Originator, destinations, etc. Each even can override to provide a specific implementation
	 * @return an unmodifiableSet with all participants in the event. can be only one participant
	 */
//	@JsonIgnore
//	public Set<ConversationParticipant> getAllParticipants() {
//		// this set is just a 'view' of all participants. should not be modified
//		return Collections.unmodifiableSet(Collections.singleton(participant));
//	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ConversationEvent)) {
			return false;
		}

		ConversationEvent that = (ConversationEvent) o;

		return Objects.equals(correlationIds, that.getCorrelationIds())
				&& Objects.equals(start, that.getStart());
//				&& Objects.equals(resource, that.getResource())
//				&& Objects.equals(participant, that.getParticipant());
	}

	@Override
	public int hashCode() {
		return Objects.hash(correlationIds, start);
	}

}