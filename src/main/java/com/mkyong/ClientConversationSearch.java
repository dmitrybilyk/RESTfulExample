package com.mkyong;

import java.time.LocalTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 22.04.17.
 */
public class ClientConversationSearch {
  private String conversationId; // (string, optional): // ID of the conversation ,
  private List<SearchableMetadata> metadata = new ArrayList<SearchableMetadata>(); // metadata (Array[SearchableMetadata], optional),
  private Integer shorterThan; // (integer, optional): conversation shorter than the specified seconds here ,
        private Integer longerThan; // (integer, optional): conversation longer than the specified seconds here ,
        private List<String> communicationTypeIncludes = new ArrayList<String>(); //(Array[string], optional): communication types of a conversation which conversation must contain ,
        private List<String> communicationTypeExcludes = new ArrayList<String>(); // (Array[string], optional): communication types of a conversation which conversation must no contain ,
        private List<String> directions = new ArrayList<String>(); // (Array[string], optional): directions of conversations ,
        private List<SearchablePhrase> phrases = new ArrayList<SearchablePhrase>(); // (Array[SearchablePhrase], optional): speech phrases ,
        private List<Integer> labels = new ArrayList<Integer>(); // (Array[integer], optional),
        private String comment; // (string, optional),
        private List<String> phoneNumbers = new ArrayList<String>(); // (Array[string], optional),
        private List<Integer> userIds = new ArrayList<Integer>(); // (Array[integer], optional),
        private List<Integer> groupIds = new ArrayList<Integer>(); // (Array[integer], optional): groups ids of the agents in the moment of recording the call ,
        private String fulltext; // (string, optional): full text search on subjects and text bodies ,
        private String customSearch; // (string, optional),
        private Period period; // (Period, optional): Period where conversations has to occur. ,
        private String timeZone; // (string, optional): Canonical Timezone ID which is required when time related search used. ,
        private List<String> daysOfWeek = new ArrayList<String>(); // (Array[string], optional): Days of the week to include in search results ,
        private LocalTime timeOfDayFrom; // (LocalTime, optional): Minimum time of day (inclusive) to include in search results. Null means no minimum. ISO 8601 format, e.g.: 12:34:56 ,
        private LocalTime timeOfDayTo; // (LocalTime, optional): Maximum time of day (exclusive) to include in search results. Null means no maximum. ISO 8601 format, e.g.: 12:34:56
//        }
//        SearchableMetadata {
//        key (string, optional, read only),
//        compareOperator (string, optional, read only) = ['STARTS_WITH', 'CONTAINS', 'EQUALS', 'GREATER_THAN', 'GREATER_OR_EQUAL', 'LESS_THAN', 'LESS_OR_EQUAL'],
//        values (Array[string], optional, read only)
//        }
//        SearchablePhrase {
//        private Integer phraseId; // (integer): speech phrase ID ,
//        private Integer confidenceFrom; // (integer, optional): confidence about speech phrase in percents (0 - 100) - from ,
//        private Integer confidenceTo; // (integer, optional): confidence about speech phrase in percents (0 - 100) - to ,
//        private String participantType; // (string, optional): type of the participant of the speech phrase = ['UNKNOWN', 'AGENT', 'CUSTOMER']
//        }
//        Period {}   ???
//        private LocalTime localTime;
//        {
//        hour (integer, optional),
//        minute (integer, optional),
//        second (integer, optional),
//        nano (integer, optional)
//        }

  public String getConversationId() {
    return conversationId;
  }

  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }

  public List<SearchableMetadata> getMetadata() {
    return metadata;
  }

  public void setMetadata(List<SearchableMetadata> metadata) {
    this.metadata = metadata;
  }

  public Integer getShorterThan() {
    return shorterThan;
  }

  public void setShorterThan(Integer shorterThan) {
    this.shorterThan = shorterThan;
  }

  public Integer getLongerThan() {
    return longerThan;
  }

  public void setLongerThan(Integer longerThan) {
    this.longerThan = longerThan;
  }

  public List<String> getCommunicationTypeIncludes() {
    return communicationTypeIncludes;
  }

  public void setCommunicationTypeIncludes(List<String> communicationTypeIncludes) {
    this.communicationTypeIncludes = communicationTypeIncludes;
  }

  public List<String> getCommunicationTypeExcludes() {
    return communicationTypeExcludes;
  }

  public void setCommunicationTypeExcludes(List<String> communicationTypeExcludes) {
    this.communicationTypeExcludes = communicationTypeExcludes;
  }

  public List<String> getDirections() {
    return directions;
  }

  public void setDirections(List<String> directions) {
    this.directions = directions;
  }

  public List<SearchablePhrase> getPhrases() {
    return phrases;
  }

  public void setPhrases(List<SearchablePhrase> phrases) {
    this.phrases = phrases;
  }

  public List<Integer> getLabels() {
    return labels;
  }

  public void setLabels(List<Integer> labels) {
    this.labels = labels;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public List<String> getPhoneNumbers() {
    return phoneNumbers;
  }

  public void setPhoneNumbers(List<String> phoneNumbers) {
    this.phoneNumbers = phoneNumbers;
  }

  public List<Integer> getUserIds() {
    return userIds;
  }

  public void setUserIds(List<Integer> userIds) {
    this.userIds = userIds;
  }

  public List<Integer> getGroupIds() {
    return groupIds;
  }

  public void setGroupIds(List<Integer> groupIds) {
    this.groupIds = groupIds;
  }

  public String getFulltext() {
    return fulltext;
  }

  public void setFulltext(String fulltext) {
    this.fulltext = fulltext;
  }

  public String getCustomSearch() {
    return customSearch;
  }

  public void setCustomSearch(String customSearch) {
    this.customSearch = customSearch;
  }

  public Period getPeriod() {
    return period;
  }

  public void setPeriod(Period period) {
    this.period = period;
  }

  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public List<String> getDaysOfWeek() {
    return daysOfWeek;
  }

  public void setDaysOfWeek(List<String> daysOfWeek) {
    this.daysOfWeek = daysOfWeek;
  }

  public LocalTime getTimeOfDayFrom() {
    return timeOfDayFrom;
  }

  public void setTimeOfDayFrom(LocalTime timeOfDayFrom) {
    this.timeOfDayFrom = timeOfDayFrom;
  }

  public LocalTime getTimeOfDayTo() {
    return timeOfDayTo;
  }

  public void setTimeOfDayTo(LocalTime timeOfDayTo) {
    this.timeOfDayTo = timeOfDayTo;
  }

  public ClientConversationSearch() {

  }
}