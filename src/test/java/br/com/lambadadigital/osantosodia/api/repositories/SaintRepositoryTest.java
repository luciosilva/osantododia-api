package br.com.lambadadigital.osantosodia.api.repositories;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.lambadadigital.osantosodia.api.entities.Saint;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class SaintRepositoryTest {

	private static final Date currentDate = new Date();
	
	@Autowired
	private SaintRepository saintRepository;
	
	@Before
	public void setUp() throws Exception {
		Saint saint = new Saint();
		saint.setName("São Jorge");
		saint.setNickname("Santo Guerreiro");
		saint.setBirthday(currentDate);
		saint.setHistory("São Jorge era um soldado Romano");
		saint.setImage("/img/saojorge.jpg");
		saint.setAltImage("Imagem de São Jorge");
		this.saintRepository.save(saint);
	}
	
	@After
	public void tearDown() throws Exception {
		this.saintRepository.deleteAll();
	}

	@Test
	public void testFindById() {
		Long id = 1l;
		Optional<Saint> saint = this.saintRepository.findById(id);
		
		if(saint.isPresent())
			assertEquals(saint.get().getId(), id);	
	}

	@Test
	public void testFindByBirthday() {
		Long id = 1l;
		List<Saint> saints = this.saintRepository.findByBirthday(currentDate);
		System.out.println("Valores testes");
		System.out.println(saints.get(0).getId());
		System.out.println(id);
		System.out.println(currentDate);
		System.out.println(saints.get(0).getBirthday());
		
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");

		assertEquals(format.format(saints.get(0).getBirthday()), format.format(currentDate));	
	}	
	
}
