
package proyectohibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class hibernateUtil {
    
private static final SessionFactory sessionfactory = buildSessionFactory();
        
private static SessionFactory buildSessionFactory() {
        
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            ServiceRegistry serviceregistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();                    
            SessionFactory sessionfactory = configuration.buildSessionFactory(serviceregistry);
            return sessionfactory;
        } catch (Throwable e) {
            System.out.println("La creación de Session Factory a fallado "+e) ;
            throw new ExceptionInInitializerError();
        }        
    }

    public static SessionFactory getSessionfactry() {
        return sessionfactory;
    }
}
