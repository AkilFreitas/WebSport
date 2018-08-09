/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import org.hibernate.Session;

/**
 *
 * @author 20151D12GR0316
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

    // Check database version
        String sql = "select version()";
     
        String result = (String) session.createNativeQuery(sql).getSingleResult();
        System.out.println(result);

        session.getTransaction().commit();
        session.close();
        
        
    HibernateUtil.shutdown();
    }
    
}
