package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Address
 */

@JsonTypeName("address")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-11-12T21:32:54.191+01:00[Europe/Berlin]")
public class Address {

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("street")
  private String street;

  @JsonProperty("houseNumber")
  private String houseNumber;

  @JsonProperty("postCode")
  private Integer postCode;

  @JsonProperty("city")
  private String city;

  public Address id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @NotNull 
  @Schema(name = "id", example = "0", required = true)
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Address street(String street) {
    this.street = street;
    return this;
  }

  /**
   * Get street
   * @return street
  */
  
  @Schema(name = "street", example = "Duisburgerstraße", required = false)
  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public Address houseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
    return this;
  }

  /**
   * Get houseNumber
   * @return houseNumber
  */
  
  @Schema(name = "houseNumber", example = "145", required = false)
  public String getHouseNumber() {
    return houseNumber;
  }

  public void setHouseNumber(String houseNumber) {
    this.houseNumber = houseNumber;
  }

  public Address postCode(Integer postCode) {
    this.postCode = postCode;
    return this;
  }

  /**
   * Get postCode
   * @return postCode
  */
  
  @Schema(name = "postCode", example = "40477", required = false)
  public Integer getPostCode() {
    return postCode;
  }

  public void setPostCode(Integer postCode) {
    this.postCode = postCode;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
  */
  
  @Schema(name = "city", example = "Düsseldorf", required = false)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.id, address.id) &&
        Objects.equals(this.street, address.street) &&
        Objects.equals(this.houseNumber, address.houseNumber) &&
        Objects.equals(this.postCode, address.postCode) &&
        Objects.equals(this.city, address.city);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, street, houseNumber, postCode, city);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    houseNumber: ").append(toIndentedString(houseNumber)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
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
