package com.said.data.cache;

import android.content.Context;

import com.said.data.model.Info;
import com.vincentbrison.openlibraries.android.dualcache.lib.DualCache;
import com.vincentbrison.openlibraries.android.dualcache.lib.DualCacheBuilder;
import com.vincentbrison.openlibraries.android.dualcache.lib.DualCacheContextUtils;

import java.util.List;

import rx.Observable;
import rx.Subscriber;


/**
 * Created by Said on 18/8/15.
 */
public class InformationGameCacheImp implements InformationGameCache {

    private DualCache<Info> infomation_game_cache;
    private final String CACHE_NAME = "INFORMATION";
    private final int VERSION = 1;
    private final int CACHE_SIZE_RAM = 4 * 1024 * 1024; // 4 MiB
    private final int CACHE_SIZE_DISK = CACHE_SIZE_RAM * 5; // 20 MiB
    private final String KEY_CACHE = "info";

    public InformationGameCacheImp(Context context) {
        DualCacheContextUtils.setContext(context);
        infomation_game_cache = new DualCacheBuilder<>(CACHE_NAME,VERSION,Info.class)
                .useDefaultSerializerInRam(CACHE_SIZE_RAM)
                .useDefaultSerializerInDisk(CACHE_SIZE_DISK, true);
    }

    @Override
    public synchronized Observable<List<String>> getClasses() {
        return Observable.create(new Observable.OnSubscribe<List<String>>() {
            @Override
            public void call(Subscriber<? super List<String>> subscriber) {
                Info info = infomation_game_cache.get(KEY_CACHE);
                if(info != null){
                    List<String> information = info.getClasses();
                    subscriber.onNext(information);
                    subscriber.onCompleted();
                }else{
                    subscriber.onError(new Exception());
                }
            }
        });
    }

    @Override
    public Observable<List<String>> getRaces() {
        return Observable.create(new Observable.OnSubscribe<List<String>>() {
            @Override
            public void call(Subscriber<? super List<String>> subscriber) {
                Info info = infomation_game_cache.get(KEY_CACHE);
                if(info != null){
                    List<String> information = info.getRaces();
                    subscriber.onNext(information);
                    subscriber.onCompleted();
                }else{
                    subscriber.onError(new Exception());
                }
            }
        });
    }

    @Override
    public Observable<List<String>> getTypes() {
        return Observable.create(new Observable.OnSubscribe<List<String>>() {
            @Override
            public void call(Subscriber<? super List<String>> subscriber) {
                Info info = infomation_game_cache.get(KEY_CACHE);
                if(info != null){
                    List<String> information = info.getTypes();
                    subscriber.onNext(information);
                    subscriber.onCompleted();
                }else{
                    subscriber.onError(new Exception());
                }
            }
        });
    }

    @Override
    public Observable<List<String>> getLanguages() {
        return null;
    }

    @Override
    public Observable<List<String>> getQualities() {
        return Observable.create(new Observable.OnSubscribe<List<String>>() {
            @Override
            public void call(Subscriber<? super List<String>> subscriber) {
                Info info = infomation_game_cache.get(KEY_CACHE);
                if(info != null){
                    List<String> information = info.getQualities();
                    subscriber.onNext(information);
                    subscriber.onCompleted();
                }else{
                    subscriber.onError(new Exception());
                }
            }
        });
    }

    @Override
    public Observable<List<String>> getSets() {
        return Observable.create(new Observable.OnSubscribe<List<String>>() {
            @Override
            public void call(Subscriber<? super List<String>> subscriber) {
                Info info = infomation_game_cache.get(KEY_CACHE);
                if(info != null){
                    List<String> information = info.getSets();
                    subscriber.onNext(information);
                    subscriber.onCompleted();
                }else{
                    subscriber.onError(new Exception());
                }
            }
        });
    }

    @Override
    public Observable<List<String>> getFactions() {
        return Observable.create(new Observable.OnSubscribe<List<String>>() {
            @Override
            public void call(Subscriber<? super List<String>> subscriber) {
                Info info = infomation_game_cache.get(KEY_CACHE);
                if(info != null){
                    List<String> information = info.getFactions();
                    subscriber.onNext(information);
                    subscriber.onCompleted();
                }else{
                    subscriber.onError(new Exception());
                }
            }
        });
    }

    @Override
    public Observable<String> getPatch() {
        return null;
    }

    @Override
    public synchronized void put(Info info) {
        infomation_game_cache.put(KEY_CACHE, info);
    }

    @Override
    public boolean isCached() {
        return infomation_game_cache.get(KEY_CACHE) != null;
    }

    @Override
    public boolean isCacheUpdate() {
        return false;
    }
}
