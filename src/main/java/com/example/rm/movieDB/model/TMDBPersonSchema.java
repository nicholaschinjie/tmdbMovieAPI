package com.example.rm.movieDB.model;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

	/**
	* The root schema
	* <p>
	* The root schema comprises the entire JSON document.
	*
	*/
	@JsonInclude(JsonInclude.Include.NON_NULL)
	@JsonPropertyOrder({
	"birthday",
	"known_for_department",
	"deathday",
	"id",
	"name",
	"also_known_as",
	"gender",
	"biography",
	"popularity",
	"place_of_birth",
	"profile_path",
	"adult",
	"imdb_id",
	"homepage"
	})
	public class TMDBPersonSchema {

	/**
	* The birthday schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("birthday")
	@JsonPropertyDescription("An explanation about the purpose of this instance.")
	private String birthday = "";
	/**
	* The known_for_department schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("known_for_department")
	@JsonPropertyDescription("An explanation about the purpose of this instance.")
	private String knownForDepartment = "";
	/**
	* The deathday schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("deathday")
	@JsonPropertyDescription("An explanation about the purpose of this instance.")
	private Object deathday = null;
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
	* The name schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("name")
	@JsonPropertyDescription("An explanation about the purpose of this instance.")
	private String name = "";
	/**
	* The also_known_as schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("also_known_as")
	@JsonPropertyDescription("An explanation about the purpose of this instance.")
	private List<Object> alsoKnownAs = null;
	/**
	* The gender schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("gender")
	@JsonPropertyDescription("An explanation about the purpose of this instance.")
	private Integer gender = 0;
	/**
	* The biography schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("biography")
	@JsonPropertyDescription("An explanation about the purpose of this instance.")
	private String biography = "";
	/**
	* The popularity schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("popularity")
	@JsonPropertyDescription("An explanation about the purpose of this instance.")
	private Double popularity = 0.0D;
	/**
	* The place_of_birth schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("place_of_birth")
	@JsonPropertyDescription("An explanation about the purpose of this instance.")
	private String placeOfBirth = "";
	/**
	* The profile_path schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("profile_path")
	@JsonPropertyDescription("An explanation about the purpose of this instance.")
	private String profilePath = "";
	/**
	* The adult schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("adult")
	@JsonPropertyDescription("An explanation about the purpose of this instance.")
	private Boolean adult = false;
	/**
	* The imdb_id schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("imdb_id")
	@JsonPropertyDescription("An explanation about the purpose of this instance.")
	private String imdbId = "";
	/**
	* The homepage schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("homepage")
	@JsonPropertyDescription("An explanation about the purpose of this instance.")
	private Object homepage = null;

	/**
	* The birthday schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("birthday")
	public String getBirthday() {
	return birthday;
	}

	/**
	* The birthday schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("birthday")
	public void setBirthday(String birthday) {
	this.birthday = birthday;
	}

	/**
	* The known_for_department schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("known_for_department")
	public String getKnownForDepartment() {
	return knownForDepartment;
	}

	/**
	* The known_for_department schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("known_for_department")
	public void setKnownForDepartment(String knownForDepartment) {
	this.knownForDepartment = knownForDepartment;
	}

	/**
	* The deathday schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("deathday")
	public Object getDeathday() {
	return deathday;
	}

	/**
	* The deathday schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("deathday")
	public void setDeathday(Object deathday) {
	this.deathday = deathday;
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
	* The name schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("name")
	public String getName() {
	return name;
	}

	/**
	* The name schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("name")
	public void setName(String name) {
	this.name = name;
	}

	/**
	* The also_known_as schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("also_known_as")
	public List<Object> getAlsoKnownAs() {
	return alsoKnownAs;
	}

	/**
	* The also_known_as schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("also_known_as")
	public void setAlsoKnownAs(List<Object> alsoKnownAs) {
	this.alsoKnownAs = alsoKnownAs;
	}

	/**
	* The gender schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("gender")
	public Integer getGender() {
	return gender;
	}

	/**
	* The gender schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("gender")
	public void setGender(Integer gender) {
	this.gender = gender;
	}

	/**
	* The biography schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("biography")
	public String getBiography() {
	return biography;
	}

	/**
	* The biography schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("biography")
	public void setBiography(String biography) {
	this.biography = biography;
	}

	/**
	* The popularity schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("popularity")
	public Double getPopularity() {
	return popularity;
	}

	/**
	* The popularity schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("popularity")
	public void setPopularity(Double popularity) {
	this.popularity = popularity;
	}

	/**
	* The place_of_birth schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("place_of_birth")
	public String getPlaceOfBirth() {
	return placeOfBirth;
	}

	/**
	* The place_of_birth schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("place_of_birth")
	public void setPlaceOfBirth(String placeOfBirth) {
	this.placeOfBirth = placeOfBirth;
	}

	/**
	* The profile_path schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("profile_path")
	public String getProfilePath() {
	return profilePath;
	}

	/**
	* The profile_path schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("profile_path")
	public void setProfilePath(String profilePath) {
	this.profilePath = profilePath;
	}

	/**
	* The adult schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("adult")
	public Boolean getAdult() {
	return adult;
	}

	/**
	* The adult schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("adult")
	public void setAdult(Boolean adult) {
	this.adult = adult;
	}

	/**
	* The imdb_id schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("imdb_id")
	public String getImdbId() {
	return imdbId;
	}

	/**
	* The imdb_id schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("imdb_id")
	public void setImdbId(String imdbId) {
	this.imdbId = imdbId;
	}

	/**
	* The homepage schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("homepage")
	public Object getHomepage() {
	return homepage;
	}

	/**
	* The homepage schema
	* <p>
	* An explanation about the purpose of this instance.
	* (Required)
	*
	*/
	@JsonProperty("homepage")
	public void setHomepage(Object homepage) {
	this.homepage = homepage;
	}

}

