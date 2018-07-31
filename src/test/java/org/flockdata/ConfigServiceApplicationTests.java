package org.flockdata;

import org.flockdata.fdconfig.FdConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FdConfig.class,
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ConfigServiceApplicationTests {


	@Test
    public void serviceStarts() {
	}


}