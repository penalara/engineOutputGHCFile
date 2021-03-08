
package com.penalara.ghc.jsonghcfile.engineoutput;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * EngineOutputGHCSchema
 * <p>
 * Schema document to format in Json the timetable created by PenalaraGHC.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "timetable"
})
public class EngineOutputGHCSchema {

    /**
     * JsonGenerationDate
     * <p>
     * Date of timetable creation.
     * (Required)
     * 
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX", timezone = "UTC")
    @JsonProperty("date")
    @JsonPropertyDescription("Date of timetable creation.")
    private Date date;
    /**
     * GeneratedJsonTimetable
     * <p>
     * Object with timetable specification resolved.
     * (Required)
     * 
     */
    @JsonProperty("timetable")
    @JsonPropertyDescription("Object with timetable specification resolved.")
    private GeneratedJsonTimetable timetable;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public EngineOutputGHCSchema() {
    }

    /**
     * 
     * @param date
     * @param timetable
     */
    public EngineOutputGHCSchema(Date date, GeneratedJsonTimetable timetable) {
        super();
        this.date = date;
        this.timetable = timetable;
    }

    /**
     * JsonGenerationDate
     * <p>
     * Date of timetable creation.
     * (Required)
     * 
     */
    @JsonProperty("date")
    public Date getDate() {
        return date;
    }

    /**
     * JsonGenerationDate
     * <p>
     * Date of timetable creation.
     * (Required)
     * 
     */
    @JsonProperty("date")
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * GeneratedJsonTimetable
     * <p>
     * Object with timetable specification resolved.
     * (Required)
     * 
     */
    @JsonProperty("timetable")
    public GeneratedJsonTimetable getTimetable() {
        return timetable;
    }

    /**
     * GeneratedJsonTimetable
     * <p>
     * Object with timetable specification resolved.
     * (Required)
     * 
     */
    @JsonProperty("timetable")
    public void setTimetable(GeneratedJsonTimetable timetable) {
        this.timetable = timetable;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
