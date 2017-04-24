package com.mkyong;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by dmitry on 22.04.17.
 */
public class ClientConversationSearch {
        private List<String> communicationTypeIncludes = new ArrayList<String>(); //(Array[string], optional): communication types of a conversation which conversation must contain ,
        private List<String> communicationTypeExcludes = new ArrayList<String>(); // (Array[string], optional): communication types of a conversation which conversation must no contain ,
        private List<String> directions = new ArrayList<String>(); // (Array[string], optional): directions of conversations ,
        private String timeZone; // (string, optional): Canonical Timezone ID which is required when time related search used. ,

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

//
//  public Period getPeriod() {
//    return period;
//  }
//
//  public void setPeriod(Period period) {
//    this.period = period;
//  }

  public String getTimeZone() {
    return timeZone;
  }

  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }

  public ClientConversationSearch() {

  }
}