/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Employe;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author DELL
 */
@Stateless
public class EmployeFacade extends AbstractFacade<Employe> {
    @PersistenceContext(unitName = "gestionEmplMachinePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EmployeFacade() {
        super(Employe.class);
    }
    public List<Employe> findAll() {
    return em.createQuery("SELECT e FROM Employe e", Employe.class).getResultList();
}

}
