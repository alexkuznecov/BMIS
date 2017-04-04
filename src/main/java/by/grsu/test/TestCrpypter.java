package by.grsu.test;

import by.grsu.configuration.ApplicationConfiguration;
import by.grsu.util.StringCrypter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by alek on 4.4.17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfiguration.class})
public class TestCrpypter {

    @Autowired
    private StringCrypter crypter;

    @Test
    public void testCrypto() {

        String testString = "1";

        String encStr = crypter.encrypt(testString);

        String oldVal = crypter.decrypt(encStr);

        System.out.println(encStr + " " + oldVal);
    }

}
