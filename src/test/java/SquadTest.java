import org.junit.*;
import static org.junit.Assert.*;

public class CubeTest {

  @Test
  public void Squad_instantiatesCorrectly() {
    heros newSquad = new heros("Avengers", "12", "Webs", "Good");
    Squad testSquad = new Squad(newSquad);
    assertEquals(true, testSquad instanceof Squad);
  }

}