package com.example.rm.movieDB.model;


import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
"file_name",
"photo_description",
"id",
"title",
"original_link",
"error"
})

@Builder
@Data
@Getter @Setter
public class ImageDefaultSchema {

/**
* The file_name schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("file_name")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String fileName = "";
/**
* The photo_description schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("photo_description")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String photoDescription = "";
/**
* The id schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("id")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private Integer id = 0;
/**
* The title schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("title")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String title = "";
/**
* The original_link schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("original_link")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String originalLink = "";
/**
* The error schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("error")
@JsonPropertyDescription("An explanation about the purpose of this instance.")
private String error = "";

/**
* The file_name schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("file_name")
public String getFileName() {
return fileName;
}

/**
* The file_name schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("file_name")
public void setFileName(String fileName) {
this.fileName = fileName;
}

/**
* The photo_description schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("photo_description")
public String getPhotoDescription() {
return photoDescription;
}

/**
* The photo_description schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("photo_description")
public void setPhotoDescription(String photoDescription) {
this.photoDescription = photoDescription;
}

/**
* The id schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("id")
public Integer getId() {
return id;
}

/**
* The id schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("id")
public void setId(Integer id) {
this.id = id;
}

/**
* The title schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("title")
public String getTitle() {
return title;
}

/**
* The title schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("title")
public void setTitle(String title) {
this.title = title;
}

/**
* The original_link schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("original_link")
public String getOriginalLink() {
return originalLink;
}

/**
* The original_link schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("original_link")
public void setOriginalLink(String originalLink) {
this.originalLink = originalLink;
}

/**
* The error schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("error")
public String getError() {
return error;
}

/**
* The error schema
* <p>
* An explanation about the purpose of this instance.
* (Required)
*
*/
@JsonProperty("error")
public void setError(String error) {
this.error = error;
}

}
