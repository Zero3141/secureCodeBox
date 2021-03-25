/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.18.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.securecodebox.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * FindingSeverities indicates the count of finding with the respective severity
 */
@ApiModel(description = "FindingSeverities indicates the count of finding with the respective severity")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-18T15:41:43.082Z[Etc/UTC]")
public class V1ScanStatusFindingsSeverities {
  public static final String SERIALIZED_NAME_HIGH = "high";
  @SerializedName(SERIALIZED_NAME_HIGH)
  private Long high;

  public static final String SERIALIZED_NAME_INFORMATIONAL = "informational";
  @SerializedName(SERIALIZED_NAME_INFORMATIONAL)
  private Long informational;

  public static final String SERIALIZED_NAME_LOW = "low";
  @SerializedName(SERIALIZED_NAME_LOW)
  private Long low;

  public static final String SERIALIZED_NAME_MEDIUM = "medium";
  @SerializedName(SERIALIZED_NAME_MEDIUM)
  private Long medium;


  public V1ScanStatusFindingsSeverities high(Long high) {
    
    this.high = high;
    return this;
  }

   /**
   * Get high
   * @return high
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getHigh() {
    return high;
  }


  public void setHigh(Long high) {
    this.high = high;
  }


  public V1ScanStatusFindingsSeverities informational(Long informational) {
    
    this.informational = informational;
    return this;
  }

   /**
   * Get informational
   * @return informational
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getInformational() {
    return informational;
  }


  public void setInformational(Long informational) {
    this.informational = informational;
  }


  public V1ScanStatusFindingsSeverities low(Long low) {
    
    this.low = low;
    return this;
  }

   /**
   * Get low
   * @return low
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getLow() {
    return low;
  }


  public void setLow(Long low) {
    this.low = low;
  }


  public V1ScanStatusFindingsSeverities medium(Long medium) {
    
    this.medium = medium;
    return this;
  }

   /**
   * Get medium
   * @return medium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getMedium() {
    return medium;
  }


  public void setMedium(Long medium) {
    this.medium = medium;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1ScanStatusFindingsSeverities v1ScanStatusFindingsSeverities = (V1ScanStatusFindingsSeverities) o;
    return Objects.equals(this.high, v1ScanStatusFindingsSeverities.high) &&
        Objects.equals(this.informational, v1ScanStatusFindingsSeverities.informational) &&
        Objects.equals(this.low, v1ScanStatusFindingsSeverities.low) &&
        Objects.equals(this.medium, v1ScanStatusFindingsSeverities.medium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(high, informational, low, medium);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScanStatusFindingsSeverities {\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    informational: ").append(toIndentedString(informational)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

