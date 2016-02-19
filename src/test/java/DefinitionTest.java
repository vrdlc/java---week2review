import org.junit.*;
import static org.junit.Assert.*;

public class DefinitionTest {

  @Test
  public void definition_instantiatesCorrectly_true() {
    Definition myDefinition = new Definition("delicious");
    assertEquals(true, myDefinition instanceof Definition);
  }

  @Test
  public void definition_instantiatesWithDefinition_true() {
    Definition myDefinition = new Definition("delicious");
    assertEquals("delicious", myDefinition.getDefinition());
  }
}
