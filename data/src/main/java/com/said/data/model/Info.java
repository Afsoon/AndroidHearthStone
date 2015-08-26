package com.said.data.model;

/**
 * Created by Said on 15/8/15.
 */
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "patch",
        "classes",
        "sets",
        "types",
        "factions",
        "qualities",
        "races",
        "locales"
})
public class Info {

    @JsonProperty("patch")
    private String patch;
    @JsonProperty("classes")
    private List<String> classes = new ArrayList<String>();
    @JsonProperty("sets")
    private List<String> sets = new ArrayList<String>();
    @JsonProperty("types")
    private List<String> types = new ArrayList<String>();
    @JsonProperty("factions")
    private List<String> factions = new ArrayList<String>();
    @JsonProperty("qualities")
    private List<String> qualities = new ArrayList<String>();
    @JsonProperty("races")
    private List<String> races = new ArrayList<String>();
    @JsonProperty("locales")
    private List<String> locales = new ArrayList<String>();

    /**
     *
     * @return
     * The patch
     */
    @JsonProperty("patch")
    public String getPatch() {
        return patch;
    }

    /**
     *
     * @param patch
     * The patch
     */
    @JsonProperty("patch")
    public void setPatch(String patch) {
        this.patch = patch;
    }

    /**
     *
     * @return
     * The classes
     */
    @JsonProperty("classes")
    public List<String> getClasses() {
        return classes;
    }

    /**
     *
     * @param classes
     * The classes
     */
    @JsonProperty("classes")
    public void setClasses(List<String> classes) {
        this.classes = classes;
    }

    /**
     *
     * @return
     * The sets
     */
    @JsonProperty("sets")
    public List<String> getSets() {
        return sets;
    }

    /**
     *
     * @param sets
     * The sets
     */
    @JsonProperty("sets")
    public void setSets(List<String> sets) {
        this.sets = sets;
    }

    /**
     *
     * @return
     * The types
     */
    @JsonProperty("types")
    public List<String> getTypes() {
        return types;
    }

    /**
     *
     * @param types
     * The types
     */
    @JsonProperty("types")
    public void setTypes(List<String> types) {
        this.types = types;
    }

    /**
     *
     * @return
     * The factions
     */
    @JsonProperty("factions")
    public List<String> getFactions() {
        return factions;
    }

    /**
     *
     * @param factions
     * The factions
     */
    @JsonProperty("factions")
    public void setFactions(List<String> factions) {
        this.factions = factions;
    }

    /**
     *
     * @return
     * The qualities
     */
    @JsonProperty("qualities")
    public List<String> getQualities() {
        return qualities;
    }

    /**
     *
     * @param qualities
     * The qualities
     */
    @JsonProperty("qualities")
    public void setQualities(List<String> qualities) {
        this.qualities = qualities;
    }

    /**
     *
     * @return
     * The races
     */
    @JsonProperty("races")
    public List<String> getRaces() {
        return races;
    }

    /**
     *
     * @param races
     * The races
     */
    @JsonProperty("races")
    public void setRaces(List<String> races) {
        this.races = races;
    }

    /**
     *
     * @return
     * The locales
     */
    @JsonProperty("locales")
    public List<String> getLocales() {
        return locales;
    }

    /**
     *
     * @param locales
     * The locales
     */
    @JsonProperty("locales")
    public void setLocales(List<String> locales) {
        this.locales = locales;
    }


}