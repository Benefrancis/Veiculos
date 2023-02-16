package br.com.fiap.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Repository {

    EntityManagerFactory factory;
    EntityManager manager;

    public Repository() {
     this.factory =  Persistence.createEntityManagerFactory("oracle");
     this.manager = this.factory.createEntityManager();
    }

    public void close(){
        this.manager.close();
        this.factory.close();
    }
}
