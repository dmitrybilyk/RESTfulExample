package com.mkyong;

import java.util.List;

/**
 * Created by dmitry on 22.04.17.
 */
public class SearchableMetadata {
  private String key; // (string, optional, read only),
  private String compareOperator;// (string, optional, read only) = ['STARTS_WITH', 'CONTAINS', 'EQUALS', 'GREATER_THAN', 'GREATER_OR_EQUAL', 'LESS_THAN', 'LESS_OR_EQUAL'],
  private List<String> values; // (Array[string], optional, read only)

  public SearchableMetadata() {
  }

  public String getKey() {

    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getCompareOperator() {
    return compareOperator;
  }

  public void setCompareOperator(String compareOperator) {
    this.compareOperator = compareOperator;
  }

  public List<String> getValues() {
    return values;
  }

  public void setValues(List<String> values) {
    this.values = values;
  }
}
