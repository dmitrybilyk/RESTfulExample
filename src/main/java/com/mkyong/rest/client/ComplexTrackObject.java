package com.mkyong.rest.client;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * Created by dmitry on 21.04.17.
 */
@XmlRootElement(name = "ComplexTrackObject")
public class ComplexTrackObject {
  private List<TrackClient> trackClients;
  private List<String> stringList;
  private String name;
  private Integer age;

  public ComplexTrackObject() {
  }

  public ComplexTrackObject(String name, Integer age, List<String> stringList, List<TrackClient> trackClients) {
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

  @XmlElement
  public List<String> getStringList() {
    return stringList;
  }

  public void setStringList(List<String> stringList) {
    this.stringList = stringList;
  }

  @XmlElement
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @XmlElement
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }
}
