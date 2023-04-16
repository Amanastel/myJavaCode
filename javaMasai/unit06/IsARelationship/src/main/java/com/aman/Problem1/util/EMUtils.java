package com.aman.Problem1.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtils {
    private static EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("sessionMgr3");

    }

    public static EntityManager getEntityManager(){
        return  emf.createEntityManager();
    }
}
