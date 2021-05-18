package KiviPaperiSakset.KiviPaperiSakset;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import control.GameControl;
import model.Gamer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
	
    @ParameterizedTest(name= "{0} vs. {1} = {2}")
    @CsvSource(value = {"'kivi', 'paperi', 'Pelaaja 2'",
    		"'kivi', 'sakset', 'Pelaaja 1'",
    		"'paperi', 'kivi', 'Pelaaja 1'", 
    		"'paperi', 'sakset', 'Pelaaja 2'",
    		"'sakset', 'kivi', 'Pelaaja 2'",
    		"'sakset', 'paperi', 'Pelaaja 1'",
    		"'sakset', 'sakset', 'Tasapeli'",
    		"'paperi', 'paperi', 'Tasapeli'",
    		"'kivi', 'kivi', 'Tasapeli'"
    	})
    public void testCheckWinner(String player1, String player2, String res) {
    	GameControl game = new GameControl();
    	game.setPelaajat(new Gamer(), new Gamer());
    	assertEquals(res, game.pelaa(player1, player2));
    }
    
    @Test
    public void testGame() {
    	GameControl newGame = new GameControl();
    	newGame.setPelaajat(new Gamer(), new Gamer());
    	
    	assertTrue(true == newGame.start(), "Peli ei mennyt läpi.");
    }
}
