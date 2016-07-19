package test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ CursoDAOTest.class, CursoTest.class, CursoTOTest.class,
		ConnectionFactoryTest.class })
public class CursoAllTests {

}
