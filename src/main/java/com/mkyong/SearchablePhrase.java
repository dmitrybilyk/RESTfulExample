package com.mkyong;

/**
 * Created by dmitry on 22.04.17.
 */
public class SearchablePhrase {
  private Integer phraseId; // (integer): speech phrase ID ,
  private Integer confidenceFrom; // (integer, optional): confidence about speech phrase in percents (0 - 100) - from ,
  private Integer confidenceTo; // (integer, optional): confidence about speech phrase in percents (0 - 100) - to ,

  public SearchablePhrase() {
  }

  public String getParticipantType() {

    return participantType;
  }

  public void setParticipantType(String participantType) {
    this.participantType = participantType;
  }

  public Integer getConfidenceTo() {
    return confidenceTo;
  }

  public void setConfidenceTo(Integer confidenceTo) {
    this.confidenceTo = confidenceTo;
  }

  public Integer getConfidenceFrom() {
    return confidenceFrom;
  }

  public void setConfidenceFrom(Integer confidenceFrom) {
    this.confidenceFrom = confidenceFrom;
  }

  public Integer getPhraseId() {
    return phraseId;
  }

  public void setPhraseId(Integer phraseId) {
    this.phraseId = phraseId;
  }

  private String participantType; // (string, optional): type of the participant of the speech phrase = ['UNKNOWN', 'AGENT', 'CUSTOMER']
}
