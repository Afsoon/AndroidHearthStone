package com.said.data.repository.datasource;

import com.said.data.cache.InformationGameCache;
import com.said.data.model.Info;
import com.said.data.api.HearthStoneManager;

import java.util.List;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

/**
 * Created by Said on 18/8/15.
 */
public class CloudInformationStore implements InformationDataStore {

    private HearthStoneManager hearthStoneManager;
    private InformationGameCache informationGameCache;
    private Info info;

    private Action1<Info> saveToCacheAction = new Action1<Info>() {
        @Override
        public void call(Info infor) {
            info = infor;
            informationGameCache.put(info);
        }
    };



    public CloudInformationStore(HearthStoneManager hearthStoneManager, InformationGameCache informationGameCache) {
        this.hearthStoneManager = hearthStoneManager;
        this.informationGameCache = informationGameCache;
    }

    @Override
    public Observable<List<String>> getClasses() {

        return Observable.create(new Observable.OnSubscribe<List<String>>() {
            @Override
            public void call(Subscriber<? super List<String>> subscriber) {
                hearthStoneManager.getInfo().doOnNext(saveToCacheAction);
                subscriber.onNext(info.getClasses());
                subscriber.onCompleted();
            }
        });
    }

    @Override
    public Observable<List<String>> getRaces() {
        return Observable.create(new Observable.OnSubscribe<List<String>>() {
            @Override
            public void call(Subscriber<? super List<String>> subscriber) {
                hearthStoneManager.getInfo().doOnNext(saveToCacheAction);
                subscriber.onNext(info.getRaces());
                subscriber.onCompleted();
            }
        });
    }

    @Override
    public Observable<List<String>> getTypes() {
        return Observable.create(new Observable.OnSubscribe<List<String>>() {
            @Override
            public void call(Subscriber<? super List<String>> subscriber) {
                hearthStoneManager.getInfo().doOnNext(saveToCacheAction);
                subscriber.onNext(info.getTypes());
                subscriber.onCompleted();
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
                hearthStoneManager.getInfo().doOnNext(saveToCacheAction);
                subscriber.onNext(info.getQualities());
                subscriber.onCompleted();
            }
        });
    }

    @Override
    public Observable<List<String>> getSets() {
        return Observable.create(new Observable.OnSubscribe<List<String>>() {
            @Override
            public void call(Subscriber<? super List<String>> subscriber) {
                hearthStoneManager.getInfo().doOnNext(saveToCacheAction);
                subscriber.onNext(info.getSets());
                subscriber.onCompleted();
            }
        });
    }

    @Override
    public Observable<List<String>> getFactions() {
        return Observable.create(new Observable.OnSubscribe<List<String>>() {
            @Override
            public void call(Subscriber<? super List<String>> subscriber) {
                hearthStoneManager.getInfo().doOnNext(saveToCacheAction);
                subscriber.onNext(info.getFactions());
                subscriber.onCompleted();
            }
        });
    }

    @Override
    public Observable<String> getPatch() {
        return null;
    }
}
