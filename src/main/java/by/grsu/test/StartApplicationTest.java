package by.grsu.test;
import by.grsu.configuration.ApplicationConfiguration;
import by.grsu.service.ChemicalElementService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by alek on 15.2.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfiguration.class})
public class StartApplicationTest {

    @Autowired
    private ChemicalElementService chemicalElementService;

    @Test
    public void testTempMethod() {
        System.out.println(chemicalElementService.findById(3));
    }
}
