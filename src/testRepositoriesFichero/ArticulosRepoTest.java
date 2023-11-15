package testRepositoriesFichero;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import model.data.Articulo;
import model.repositoriesFichero.ArticuloRepositorioFichero;
import model.repositoriesInterfaces.ArticuloRepositoriable;
import objectMother.ArticulosOM;
@TestInstance(Lifecycle.PER_CLASS)

class ArticulosRepoTest{
	private ArticuloRepositoriable repo;
	private final String path="testFiles/ArticulosTest";
	@BeforeAll
	void initializeFiles() {
		repo = new ArticuloRepositorioFichero(path);
		new ArticulosOM().getArticulos().forEach(e->repo.add(e));
	}
	
	@BeforeEach
	void reLoadData() {
		new ArticulosOM().getArticulos().forEach(e->repo.add(e));
	}
	
	@Test
	void findByRange() {
		assertEquals(5, repo.findByRange(20f, 23f).size());
		assertEquals(0, repo.findByRange(20f, 22f).size());
	}
	
	@Test
	void borrar() {
		Integer id = repo.findAll().get(0).getId();
		repo.borrar(id);
		assertFalse(repo.findById(id).isPresent());
	}
	
	@Test
	void findById() {
		assertTrue(repo.findById(1).isPresent());
	}
	
	@Test 
	void add(){
		//TODO reset los ficheros para que no de error
		assertTrue(repo.add(new Articulo(34, "a", 9f)));
		assertTrue(repo.findById(34).isPresent());
	}
	
	@Ignore
	@AfterAll
	void deleteTestFiles() {
		
	}

}
