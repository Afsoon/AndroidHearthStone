package com.said.data.api.queries;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Said on 12/8/15.
 */
public class SearchQuery {
    protected String attack;
    protected String callback;
    protected String collectible;
    protected String cost;
    protected String durability;
    protected String healthy;
    protected String locale;
    protected Map<String, String> queryMap;

    public Map<String, String> generateQueryMap(){
        baseQueryMap();
        return queryMap;
    }

    public SearchQuery(String attack, String callback, String collectible, String cost, String durability, String healthy, String locale) {
        this.attack = attack;
        this.callback = callback;
        this.collectible = collectible;
        this.cost = cost;
        this.durability = durability;
        this.healthy = healthy;
        this.locale = locale;
    }

    protected void baseQueryMap(){
        queryMap = new StringHashMap<>();
        putAttack();
        putCallback();
        putCollectible();
        putCost();
        putDurability();
        putHealthy();
        putLocale();
    }

    private void putAttack(){
        if(!isInvalidParameter(attack))
            queryMap.put("attack", attack);
    }

    private void putCallback(){
        if(!isInvalidParameter(callback))
            queryMap.put("callback", callback);
    }

    private void putCollectible(){
        if(!isInvalidParameter(collectible))
            queryMap.put("collectible", collectible);
    }

    private void putCost(){
        if(!isInvalidParameter(cost)){
            queryMap.put("cost", cost);
        }
    }

    private void putDurability(){
        if(!isInvalidParameter(durability)){
            queryMap.put("durability", durability);
        }
    }

    private void putHealthy(){
        if(!isInvalidParameter(healthy)){
            queryMap.put("healthy", healthy);
        }
    }

    private void putLocale(){
        if(!isInvalidParameter(locale)){
            queryMap.put("locale", locale);
        }
    }

    protected boolean isInvalidParameter(String parameter){
        if(parameter != null && !parameter.isEmpty())
            return false;
        return true;
    }

}
