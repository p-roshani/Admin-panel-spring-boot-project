package com.oscProject.services;

import com.hazelcast.config.Config;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelCastSingleton {
    private static HazelcastInstance hazelcastInstance;

    private HazelCastSingleton(){
    }
    public static synchronized HazelcastInstance getHazelcastInstance(){
        if(hazelcastInstance==null)
        {
            Config config = new Config();
            hazelcastInstance = Hazelcast.newHazelcastInstance(config);
        }
        return hazelcastInstance;
    }
}
