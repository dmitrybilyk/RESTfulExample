package com.mkyong.rest.client;

import java.util.List;

/**
 * Created by dmitry on 21.04.17.
 */
public class ComplexTrackObject {
  private List<TrackClient> trackClients;
  private List<String> stringList;
  private String name;
  private Integer age;

  public ComplexTrackObject() {
  }

  public ComplexTrackObject(List<TrackClient> trackClients, List<String> stringList, String name, Integer age) {
    this.trackClients = trackClients;
    this.stringList = stringList;
    this.name = name;
    this.age = age;
  }

  public List<TrackClient> getTrackClients() {
    return trackClients;
  }

  public void setTrackClients(List<TrackClient> trackClients) {
    this.trackClients = trackClients;
  }

  public List<String> getStringList() {
    return stringList;
  }

  public void setStringList(List<String> stringList) {
    this.stringList = stringList;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
