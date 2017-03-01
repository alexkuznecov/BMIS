package by.grsu.util;

import by.grsu.entity.ChemicalElement;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alek on 26.2.17.
 */
public class CSVElementsParser {

    private String pathToFile;

    public CSVElementsParser(String pathToFile) {
        this.pathToFile = pathToFile;
    }

    /**
     * Parse method for file chemEl.csv
      * @return List of chemical elements
     */
    public List<ChemicalElement> parse() {

        List<ChemicalElement> elementList = new ArrayList<ChemicalElement>();
        CSVReader reader = null;
        try {
            int i = 0;
            reader = new CSVReader(new FileReader(this.pathToFile));
            String[] line;
            while ((line = reader.readNext()) != null) {
                if ((i == 0) || (i==1)) {
                    i++;
                    continue;
                }
                ChemicalElement chemicalElement = new ChemicalElement();
                chemicalElement.setName(line[2]);
                chemicalElement.setSymbol(line[1]);
                chemicalElement.setAtomicWeight(line[6]);
                chemicalElement.setAtomicNumber(line[0]);
                chemicalElement.setDescription(line[3]);
                chemicalElement.setGroupNumber(line[4]);
                chemicalElement.setPeriod(line[5]);
                chemicalElement.setDensity(line[7]);
                chemicalElement.setMeltingPoint(line[8]);
                chemicalElement.setBoilingPoint(line[9]);
                chemicalElement.setAbundance(line[12]);

                elementList.add(chemicalElement);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return elementList;
    }

    /**
     * Parse method for file asss.csv
     * @return map String string
     */
    public List<ChemicalElement> parsePartial() {

        List<ChemicalElement> elementList = new ArrayList<ChemicalElement>();

        CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(this.pathToFile));
            String[] line;
            while ((line = reader.readNext()) != null) {
                ChemicalElement chemicalElement = new ChemicalElement();

                chemicalElement.setAtomicNumber(line[0]);
                chemicalElement.setIons(line[12]);

                elementList.add(chemicalElement);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return elementList;
    }

    public String getPathToFile() {
        return pathToFile;
    }

    public void setPathToFile(String pathToFile) {
        this.pathToFile = pathToFile;
    }
}
