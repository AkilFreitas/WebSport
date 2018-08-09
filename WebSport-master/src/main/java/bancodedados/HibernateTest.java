
package bancodedados;
/**
 *
 * @author Akil
 */
import org.hibernate.HibernateException;
import org.junit.Test;
import org.junit.Ignore;
import org.hibernate.Session;
public class HibernateTest {
    @Test
    @Ignore
    public void conectarTest() {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        sessao.close();
        HibernateUtil.getSessionFactory().close();
    }
    @Test
    (expected = HibernateException.class)
    @Ignore
    public void conectarHibernateExceptionTest() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.close();
        HibernateUtil.getSessionFactory().close();
    }    
        @Test(expected = ExceptionInInitializerError.class)
    @Ignore
    public void conectarExceptionInInitializerErrorTest() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.close();
        HibernateUtil.getSessionFactory().close();
    }
    
}   
