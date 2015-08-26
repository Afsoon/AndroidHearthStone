package com.said.data.repository.datasource;

import android.content.Context;

import com.said.data.cache.InformationGameCache;
import com.said.data.api.HearthStoneManager;

/**
 * Created by Said on 18/8/15.
 */
public class InformationDataStoreFactory {

    private InformationGameCache informationGameCache;

    public InformationDataStoreFactory(Context context, InformationGameCache informationGameCache) {
        if(informationGameCache == null){
            throw new IllegalArgumentException("Parameters can't be null");
        }
        this.informationGameCache = informationGameCache;
    }

    public InformationDataStore create(){
        InformationDataStore informationDataStore;

        if(informationGameCache.isCached()){
            informationDataStore = new CacheInformationStore(informationGameCache);
        }else{
            informationDataStore = createCloudStore();
        }

        return informationDataStore;
    }

    private InformationDataStore createCloudStore(){
        HearthStoneManager hearthStoneManager = new HearthStoneManager();
        return new CloudInformationStore(hearthStoneManager,informationGameCache);
    }
}
