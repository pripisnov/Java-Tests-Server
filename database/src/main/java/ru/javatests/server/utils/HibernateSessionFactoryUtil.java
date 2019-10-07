package ru.javatests.server.utils;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import ru.javatests.server.models.*;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil() {}

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();
                configuration.addAnnotatedClass(Category.class);
                configuration.addAnnotatedClass(Question.class);
                configuration.addAnnotatedClass(QuestionAnswer.class);
                configuration.addAnnotatedClass(QuestionType.class);
                configuration.addAnnotatedClass(User.class);
                configuration.addAnnotatedClass(UserAnswer.class);
                configuration.addAnnotatedClass(UserTest.class);
                configuration.addAnnotatedClass(UserTestStatus.class);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e) {
                //System.out.println("Исключение!" + e);
            }
        }
        return sessionFactory;
    }
}
