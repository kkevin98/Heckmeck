import Heckmeck.Player;
import Heckmeck.Playground;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InitializationCheck {

    @Test
    void playerName(){
        Player player = new Player("Luigi");

        Assertions.assertEquals("Luigi", player.getName());
    }

    @Test
    void playerHasNoTiles(){
        Player player = new Player();

        Assertions.assertFalse(player.hasTiles());
    }

    @Test
    void tiles21OfPlayground() {
        Playground playground = new Playground();

        Assertions.assertTrue(playground.hasTileNumber(21));
    }
}
