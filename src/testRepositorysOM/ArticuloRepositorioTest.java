package testRepositorysOM;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.repositories.ArticuloRepositorio;

class ArticuloRepositorioTest {

	@Test
	void test() {
		ArticuloRepositorio repo = new ArticuloRepositorio();
		System.out.println(repo.findById(3).isPresent());
	}
	
	@Test
	void findByRangeTest() {
		ArticuloRepositorio repo = new ArticuloRepositorio();
		assertEquals(5, repo.findByRange(20f, 23f).size());
		assertEquals(0, repo.findByRange(20f, 22f).size());
	}

}
