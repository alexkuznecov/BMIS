package by.grsu.util;

import by.grsu.configuration.ApplicationConfiguration;
import by.grsu.service.ChemicalElementService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * Created by alek on 18.2.17.
 */
public class Starter {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        ChemicalElementService service = (ChemicalElementService) context.getBean("chemicalElementService");

        System.out.println(service.getAll());
    }

}
