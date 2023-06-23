package com.sistemi.informativi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.sistemi.informativi.entity.Tutorial;
import com.sistemi.informativi.service.TutorialService;

@SpringBootTest
class TutorialsWebServiceProviderApplicationTests {
	
	@Autowired
	private TutorialService tutorialService;
	
	//fa si che in questa classe venga caricato l'ApplicationContext
	@Test
	void contextLoads() {
	}
	
	@Test
	public void saveTutorial() throws Exception {
		Tutorial tutorial = new Tutorial("System", "Cisco");
		Tutorial savedOrUpdated = tutorialService.saveOrUpdateTutorial(tutorial);
		
		int id = savedOrUpdated.getId();
		
		assertEquals(id, 5);
	}

}
