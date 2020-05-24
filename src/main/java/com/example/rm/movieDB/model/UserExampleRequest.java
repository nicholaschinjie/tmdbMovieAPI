package com.example.rm.movieDB.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


/**
* The root schema
* <p>
* The root schema comprises the entire JSON document.
*
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"filesize",
"category"
})
@Builder
@Data
@Getter @Setter
public class UserExampleRequest {

/**
* The filesize schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("filesize")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String filesize = "";
/**
* The category schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("category")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String category = "";

/**
* The filesize schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("filesize")
public String getFilesize() {
return filesize;
}

/**
* The filesize schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("filesize")
public void setFilesize(String filesize) {
this.filesize = filesize;
}

/**
* The category schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("category")
public String getCategory() {
return category;
}

/**
* The category schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("category")
public void setCategory(String category) {
this.category = category;
}

}

