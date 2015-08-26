package com.said.ahs.model;

import com.said.data.model.CardsJSON;

import org.parceler.Parcel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Said on 20/8/15.
 */
@Parcel
public class Cards {

    String cardId;
    String name;
    String cardSet;
    String type;
    String faction;
    String rarity;
    Integer cost;
    Integer attack;
    Integer health;
    String text;
    String flavor;
    String artist;
    Boolean collectible;
    String howToGetGold;
    String img;
    String imgGold;
    String locale;
    List<Mechanic> mechanics = new ArrayList<>();
    String playerClass;
    String howToGet;
    String race;
    Boolean elite;
    String inPlayText;
    String durability;

    public Cards() {
    }

    public Cards(CardsJSON cardsJSON){
        this.cardId = cardsJSON.getCardId();
        this.name = cardsJSON.getName();
        this.cardSet = cardsJSON.getCardSet();
        this.type = cardsJSON.getType();
        this.faction = cardsJSON.getFaction();
        this.rarity = cardsJSON.getRarity();
        this.cost = cardsJSON.getCost();
        this.attack = cardsJSON.getAttack();
        this.health = cardsJSON.getHealth();
        this.text = cardsJSON.getText();
        this.flavor = cardsJSON.getFlavor();
        this.artist = cardsJSON.getArtist();
        this.collectible = cardsJSON.getCollectible();
        this.howToGetGold = cardsJSON.getHowToGetGold();
        this.img = cardsJSON.getImg();
        this.imgGold = cardsJSON.getImgGold();
        this.locale = cardsJSON.getLocale();
        List<Mechanic> mechanics = new ArrayList<>();
        for(com.said.data.model.Mechanic mechanic : cardsJSON.getMechanics()){
            mechanics.add(new Mechanic(mechanic.getName()));
        }
        this.mechanics = mechanics;
        this.playerClass = cardsJSON.getPlayerClass();
        this.howToGet = cardsJSON.getHowToGet();
        this.race = cardsJSON.getRace();
        this.elite = cardsJSON.getElite();
        this.inPlayText = cardsJSON.getInPlayText();
        this.durability = cardsJSON.getDurability();
    }

    public Cards(String cardId, String name, String cardSet, String type, String faction,
                 String rarity, Integer cost, Integer attack, Integer health, String text,
                 String flavor, String artist, Boolean collectible, String howToGetGold,
                 String img, String imgGold, String locale, List<Mechanic> mechanics,
                 String playerClass, String howToGet, String race, Boolean elite) {
        this.cardId = cardId;
        this.name = name;
        this.cardSet = cardSet;
        this.type = type;
        this.faction = faction;
        this.rarity = rarity;
        this.cost = cost;
        this.attack = attack;
        this.health = health;
        this.text = text;
        this.flavor = flavor;
        this.artist = artist;
        this.collectible = collectible;
        this.howToGetGold = howToGetGold;
        this.img = img;
        this.imgGold = imgGold;
        this.locale = locale;
        this.mechanics = mechanics;
        this.playerClass = playerClass;
        this.howToGet = howToGet;
        this.race = race;
        this.elite = elite;
    }

    /**
     *
     * @return
     * The cardId
     */
    public String getCardId() {
        return cardId;
    }

    /**
     *
     * @param cardId
     * The cardId
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The cardSet
     */
    public String getCardSet() {
        return cardSet;
    }

    /**
     *
     * @param cardSet
     * The cardSet
     */
    public void setCardSet(String cardSet) {
        this.cardSet = cardSet;
    }

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The faction
     */
    public String getFaction() {
        return faction;
    }

    /**
     *
     * @param faction
     * The faction
     */
    public void setFaction(String faction) {
        this.faction = faction;
    }

    /**
     *
     * @return
     * The rarity
     */
    public String getRarity() {
        return rarity;
    }

    /**
     *
     * @param rarity
     * The rarity
     */
    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    /**
     *
     * @return
     * The cost
     */
    public Integer getCost() {
        return cost;
    }

    /**
     *
     * @param cost
     * The cost
     */
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    /**
     *
     * @return
     * The attack
     */
    public Integer getAttack() {
        return attack;
    }

    /**
     *
     * @param attack
     * The attack
     */
    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    /**
     *
     * @return
     * The health
     */
    public Integer getHealth() {
        return health;
    }

    /**
     *
     * @param health
     * The health
     */
    public void setHealth(Integer health) {
        this.health = health;
    }

    /**
     *
     * @return
     * The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     * The flavor
     */
    public String getFlavor() {
        return flavor;
    }

    /**
     *
     * @param flavor
     * The flavor
     */
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    /**
     *
     * @return
     * The artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     *
     * @param artist
     * The artist
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     *
     * @return
     * The collectible
     */
    public Boolean getCollectible() {
        return collectible;
    }

    /**
     *
     * @param collectible
     * The collectible
     */
    public void setCollectible(Boolean collectible) {
        this.collectible = collectible;
    }

    /**
     *
     * @return
     * The howToGetGold
     */
    public String getHowToGetGold() {
        return howToGetGold;
    }

    /**
     *
     * @param howToGetGold
     * The howToGetGold
     */
    public void setHowToGetGold(String howToGetGold) {
        this.howToGetGold = howToGetGold;
    }

    /**
     *
     * @return
     * The img
     */
    public String getImg() {
        return img;
    }

    /**
     *
     * @param img
     * The img
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     *
     * @return
     * The imgGold
     */
    public String getImgGold() {
        return imgGold;
    }

    /**
     *
     * @param imgGold
     * The imgGold
     */
    public void setImgGold(String imgGold) {
        this.imgGold = imgGold;
    }

    /**
     *
     * @return
     * The locale
     */
    public String getLocale() {
        return locale;
    }

    /**
     *
     * @param locale
     * The locale
     */
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     *
     * @return
     * The mechanics
     */
    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    /**
     *
     * @param mechanics
     * The mechanics
     */
    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    /**
     *
     * @return
     * The playerClass
     */
    public String getPlayerClass() {
        return playerClass;
    }

    /**
     *
     * @param playerClass
     * The playerClass
     */
    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    /**
     *
     * @return
     * The howToGet
     */
    public String getHowToGet() {
        return howToGet;
    }

    /**
     *
     * @param howToGet
     * The howToGet
     */
    public void setHowToGet(String howToGet) {
        this.howToGet = howToGet;
    }

    /**
     *
     * @return
     * The race
     */
    public String getRace() {
        return race;
    }

    /**
     *
     * @param race
     * The race
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     *
     * @return
     * The elite
     */
    public Boolean getElite() {
        return elite;
    }

    /**
     *
     * @param elite
     * The elite
     */
    public void setElite(Boolean elite) {
        this.elite = elite;
    }

    public String getInPlayText() {
        return inPlayText;
    }

    public void setInPlayText(String inPlayText) {
        this.inPlayText = inPlayText;
    }

    public String getDurability() {
        return durability;
    }

    public void setDurability(String durability) {
        this.durability = durability;
    }
}
