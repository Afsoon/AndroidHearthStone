package com.said.data.model;

/**
 * Created by Said on 13/8/15.
 */
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cardId",
        "name",
        "cardSet",
        "type",
        "text",
        "playerClass",
        "locale",
        "mechanics",
        "rarity",
        "health",
        "img",
        "imgGold",
        "faction",
        "collectible",
        "attack",
        "cost",
        "flavor",
        "artist",
        "howToGet",
        "howToGetGold",
        "inPlayText",
        "race",
        "elite"
})
public class CardsJSON {

    @JsonProperty("cardId")
    private String cardId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("cardSet")
    private String cardSet;
    @JsonProperty("type")
    private String type;
    @JsonProperty("text")
    private String text;
    @JsonProperty("playerClass")
    private String playerClass;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("mechanics")
    private List<Mechanic> mechanics = new ArrayList<Mechanic>();
    @JsonProperty("rarity")
    private String rarity;
    @JsonProperty("health")
    private Integer health;
    @JsonProperty("img")
    private String img;
    @JsonProperty("imgGold")
    private String imgGold;
    @JsonProperty("faction")
    private String faction;
    @JsonProperty("collectible")
    private Boolean collectible;
    @JsonProperty("attack")
    private Integer attack;
    @JsonProperty("cost")
    private Integer cost;
    @JsonProperty("flavor")
    private String flavor;
    @JsonProperty("artist")
    private String artist;
    @JsonProperty("howToGet")
    private String howToGet;
    @JsonProperty("howToGetGold")
    private String howToGetGold;
    @JsonProperty("inPlayText")
    private String inPlayText;
    @JsonProperty("race")
    private String race;
    @JsonProperty("elite")
    private Boolean elite;
    @JsonProperty("durability")
    private String durability;

    @JsonProperty("durability")
    public String getDurability() {
        return durability;
    }

    @JsonProperty("durability")
    public void setDurability(String durability) {
        this.durability = durability;
    }

    @JsonProperty("inPlayText")
    public String getInPlayText() {
        return inPlayText;
    }

    /**
     *
     * @param inPlayText
     * The inPlayText
     */
    @JsonProperty("inPlayText")
    public void setInPlayText(String inPlayText) {
        this.inPlayText = inPlayText;
    }

    /**
     *
     * @return
     * The cardId
     */
    @JsonProperty("cardId")
    public String getCardId() {
        return cardId;
    }

    /**
     *
     * @param cardId
     * The cardId
     */
    @JsonProperty("cardId")
    public void setCardId(String cardId) {
        this.cardId = cardId;
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
     * The cardSet
     */
    @JsonProperty("cardSet")
    public String getCardSet() {
        return cardSet;
    }

    /**
     *
     * @param cardSet
     * The cardSet
     */
    @JsonProperty("cardSet")
    public void setCardSet(String cardSet) {
        this.cardSet = cardSet;
    }

    /**
     *
     * @return
     * The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The faction
     */
    @JsonProperty("faction")
    public String getFaction() {
        return faction;
    }

    /**
     *
     * @param faction
     * The faction
     */
    @JsonProperty("faction")
    public void setFaction(String faction) {
        this.faction = faction;
    }

    /**
     *
     * @return
     * The rarity
     */
    @JsonProperty("rarity")
    public String getRarity() {
        return rarity;
    }

    /**
     *
     * @param rarity
     * The rarity
     */
    @JsonProperty("rarity")
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    /**
     *
     * @return
     * The cost
     */
    @JsonProperty("cost")
    public Integer getCost() {
        return cost;
    }

    /**
     *
     * @param cost
     * The cost
     */
    @JsonProperty("cost")
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    /**
     *
     * @return
     * The attack
     */
    @JsonProperty("attack")
    public Integer getAttack() {
        return attack;
    }

    /**
     *
     * @param attack
     * The attack
     */
    @JsonProperty("attack")
    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    /**
     *
     * @return
     * The health
     */
    @JsonProperty("health")
    public Integer getHealth() {
        return health;
    }

    /**
     *
     * @param health
     * The health
     */
    @JsonProperty("health")
    public void setHealth(Integer health) {
        this.health = health;
    }

    /**
     *
     * @return
     * The text
     */
    @JsonProperty("text")
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     * The flavor
     */
    @JsonProperty("flavor")
    public String getFlavor() {
        return flavor;
    }

    /**
     *
     * @param flavor
     * The flavor
     */
    @JsonProperty("flavor")
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     *
     * @return
     * The artist
     */
    @JsonProperty("artist")
    public String getArtist() {
        return artist;
    }

    /**
     *
     * @param artist
     * The artist
     */
    @JsonProperty("artist")
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     *
     * @return
     * The collectible
     */
    @JsonProperty("collectible")
    public Boolean getCollectible() {
        return collectible;
    }

    /**
     *
     * @param collectible
     * The collectible
     */
    @JsonProperty("collectible")
    public void setCollectible(Boolean collectible) {
        this.collectible = collectible;
    }

    /**
     *
     * @return
     * The howToGetGold
     */
    @JsonProperty("howToGetGold")
    public String getHowToGetGold() {
        return howToGetGold;
    }

    /**
     *
     * @param howToGetGold
     * The howToGetGold
     */
    @JsonProperty("howToGetGold")
    public void setHowToGetGold(String howToGetGold) {
        this.howToGetGold = howToGetGold;
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
     * The imgGold
     */
    @JsonProperty("imgGold")
    public String getImgGold() {
        return imgGold;
    }

    /**
     *
     * @param imgGold
     * The imgGold
     */
    @JsonProperty("imgGold")
    public void setImgGold(String imgGold) {
        this.imgGold = imgGold;
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
     * The mechanics
     */
    @JsonProperty("mechanics")
    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    /**
     *
     * @param mechanics
     * The mechanics
     */
    @JsonProperty("mechanics")
    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    /**
     *
     * @return
     * The playerClass
     */
    @JsonProperty("playerClass")
    public String getPlayerClass() {
        return playerClass;
    }

    /**
     *
     * @param playerClass
     * The playerClass
     */
    @JsonProperty("playerClass")
    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
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

    /**
     *
     * @return
     * The race
     */
    @JsonProperty("race")
    public String getRace() {
        return race;
    }

    /**
     *
     * @param race
     * The race
     */
    @JsonProperty("race")
    public void setRace(String race) {
        this.race = race;
    }

    /**
     *
     * @return
     * The elite
     */
    @JsonProperty("elite")
    public Boolean getElite() {
        return elite;
    }

    /**
     *
     * @param elite
     * The elite
     */
    @JsonProperty("elite")
    public void setElite(Boolean elite) {
        this.elite = elite;
    }


}