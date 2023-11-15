package testRepositorysOM;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.Period;

import org.junit.jupiter.api.Test;

class fechas {
	
	@Test
	void test2() {
		LocalDate[] fechaAComprobar = { 
				LocalDate.of(2023, 9, 24), 
				LocalDate.of(2023, 9, 25), 
				LocalDate.of(2023, 9, 26),
				LocalDate.of(2023, 9, 27) };
		LocalDate inicioPeriodo = LocalDate.of(2023, 9, 25);
		LocalDate finalPeriodo = LocalDate.of(2023, 9, 26);
		boolean expected[]= {false,true,true,false};
		for (int i = 0; i < expected.length; i++) {
			assertEquals(
					(fechaAComprobar[i].isAfter(inicioPeriodo) 
							|| fechaAComprobar[i].isEqual(inicioPeriodo))
						&& (fechaAComprobar[i].isBefore(finalPeriodo) 
							|| fechaAComprobar[i].isEqual(finalPeriodo))
					,expected[i]);
		}
		
	}
}
