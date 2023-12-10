/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type;
import entities.Employe;
import entities.Machine;
import java.awt.Robot;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

/**
 *
 * @author DELL
 */
@Stateless
public class MachineFacade extends AbstractFacade<Machine> {
    @PersistenceContext(unitName = "gestionEmplMachinePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MachineFacade() {
        super(Machine.class);
    }
    public List<Machine> findByEmployee(String employeeName) {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Machine> criteriaQuery = criteriaBuilder.createQuery(Machine.class);
         Root<Machine> machineRoot = criteriaQuery.from(Machine.class);

        Join<Machine, Employe> employeJoin = machineRoot.join("employeid");

        criteriaQuery.select(machineRoot)
                .where(criteriaBuilder.equal(employeJoin.get("nom"), employeeName));

        TypedQuery<Machine> typedQuery = em.createQuery(criteriaQuery);
        return typedQuery.getResultList();
    }
}
