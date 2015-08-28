/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import bean.TblCandidate;
import bean.TblCandidateFacade;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author anhdh_a05370
 */
public class MyClass {
    TblCandidateFacade tblCandidateFacade = lookupTblCandidateFacadeBean();

    public List<TblCandidate> getAll(){
        List<TblCandidate> list = tblCandidateFacade.findAll();
        return list;
    }
    private TblCandidateFacade lookupTblCandidateFacadeBean() {
        try {
            Context c = new InitialContext();
            return (TblCandidateFacade) c.lookup("java:global/ProjectSEM4/ProjectSEM4-ejb/TblCandidateFacade!bean.TblCandidateFacade");
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
