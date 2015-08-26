package com.said.data.model;

/**
 * Created by Said on 11/8/15.
 */
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cardBackId",
        "name",
        "description",
        "source",
        "sourceDescription",
        "enabled",
        "img",
        "imgAnimated",
        "sortCategory",
        "sortOrder",
        "locale",
        "howToGet"
})
public class CardbackJSON {

    @JsonProperty("cardBackId")
    private String cardBackId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("source")
    private String source;
    @JsonProperty("sourceDescription")
    private String sourceDescription;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("img")
    private String img;
    @JsonProperty("imgAnimated")
    private String imgAnimated;
    @JsonProperty("sortCategory")
    private String sortCategory;
    @JsonProperty("sortOrder")
    private String sortOrder;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("howToGet")
    private String howToGet;

    /**
     *
     * @return
     * The cardBackId
     */
    @JsonProperty("cardBackId")
    public String getCardBackId() {
        return cardBackId;
    }

    /**
     *
     * @param cardBackId
     * The cardBackId
     */
    @JsonProperty("cardBackId")
    public void setCardBackId(String cardBackId) {
        this.cardBackId = cardBackId;
    }

    /**
     *
     * @return
     * The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The description
     */
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The source
     */
    @JsonProperty("source")
    public String getSource() {
        return source;
    }

    /**
     *
     * @param source
     * The source
     */
    @JsonProperty("source")
    public void setSource(String source) {
        this.source = source;
    }

    /**
     *
     * @return
     * The sourceDescription
     */
    @JsonProperty("sourceDescription")
    public String getSourceDescription() {
        return sourceDescription;
    }

    /**
     *
     * @param sourceDescription
     * The sourceDescription
     */
    @JsonProperty("sourceDescription")
    public void setSourceDescription(String sourceDescription) {
        this.sourceDescription = sourceDescription;
    }

    /**
     *
     * @return
     * The enabled
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     *
     * @param enabled
     * The enabled
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     *
     * @return
     * The img
     */
    @JsonProperty("img")
    public String getImg() {
        return img;
    }

    /**
     *
     * @param img
     * The img
     */
    @JsonProperty("img")
    public void setImg(String img) {
        this.img = img;
    }

    /**
     *
     * @return
     * The imgAnimated
     */
    @JsonProperty("imgAnimated")
    public String getImgAnimated() {
        return imgAnimated;
    }

    /**
     *
     * @param imgAnimated
     * The imgAnimated
     */
    @JsonProperty("imgAnimated")
    public void setImgAnimated(String imgAnimated) {
        this.imgAnimated = imgAnimated;
    }

    /**
     *
     * @return
     * The sortCategory
     */
    @JsonProperty("sortCategory")
    public String getSortCategory() {
        return sortCategory;
    }

    /**
     *
     * @param sortCategory
     * The sortCategory
     */
    @JsonProperty("sortCategory")
    public void setSortCategory(String sortCategory) {
        this.sortCategory = sortCategory;
    }

    /**
     *
     * @return
     * The sortOrder
     */
    @JsonProperty("sortOrder")
    public String getSortOrder() {
        return sortOrder;
    }

    /**
     *
     * @param sortOrder
     * The sortOrder
     */
    @JsonProperty("sortOrder")
    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     *
     * @return
     * The locale
     */
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    /**
     *
     * @param locale
     * The locale
     */
    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     *
     * @return
     * The howToGet
     */
    @JsonProperty("howToGet")
    public String getHowToGet() {
        return howToGet;
    }

    /**
     *
     * @param howToGet
     * The howToGet
     */
    @JsonProperty("howToGet")
    public void setHowToGet(String howToGet) {
        this.howToGet = howToGet;
    }


}