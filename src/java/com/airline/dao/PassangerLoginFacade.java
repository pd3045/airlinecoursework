/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airline.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lin
 */
@Stateless
public class PassangerLoginFacade extends AbstractFacade<PassangerLogin> {

    @PersistenceContext(unitName = "AirlinecourseworkPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PassangerLoginFacade() {
        super(PassangerLogin.class);
    }
    
}
