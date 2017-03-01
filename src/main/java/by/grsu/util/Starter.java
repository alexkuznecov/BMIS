package by.grsu.util;

import by.grsu.configuration.ApplicationConfiguration;
import by.grsu.entity.ChemicalElement;
import by.grsu.service.ChemicalElementService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.util.List;

/**
 * Created by alek on 18.2.17.
 */
public class Starter {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        ChemicalElementService service = (ChemicalElementService) context.getBean("chemicalElementService");

        String path = "src/main/resources/periodicTableFiles/chemEl.csv";
        String path1 = "src/main/resources/periodicTableFiles/asss.csv";

        CSVElementsParser csvElementsParser = new CSVElementsParser(path);

        List<ChemicalElement> chemicalElementList = csvElementsParser.parse();

        csvElementsParser.setPathToFile(path1);

        List<ChemicalElement> chemicalElementListShorter = csvElementsParser.parsePartial();

        int mergeCounter = 0;

        for (int i = 0; i< chemicalElementListShorter.size(); i++) {
            for (int j = 0; j < chemicalElementList.size(); j++) {
                if (chemicalElementListShorter.get(i).getAtomicNumber().equals(chemicalElementList.get(j).getAtomicNumber())) {
                    chemicalElementList.get(j).setIons(chemicalElementListShorter.get(i).getIons());
                    mergeCounter ++;
                }
            }
        }

        System.out.println(mergeCounter);

        service.saveChemicalElements(chemicalElementList);

        int g = 4;

        System.out.println(service.getAll());
    }

}
