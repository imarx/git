package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AlunoDAOTest.class, AlunoTest.class, AlunoTOTest.class,
		ConnectionFactoryTest.class })
public class AlunoAllTests {

}
