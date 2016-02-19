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

  @Test
  public void all_returnsAllInstancesOfDefinition_true() {
    Definition firstDefinition = new Definition("delicious");
    Definition secondDefinition = new Definition("head clothes");
    assertTrue(Definition.all().contains(firstDefinition));
    assertTrue(Definition.all().contains(secondDefinition));
  }

  @Test
  public void id_returnsDefinitionWithID_true() {
    Definition myDefinition = new Definition("delicious");
    assertEquals(Definition.all().size(), myDefinition.getId());
  }

  @Test
  public void id_returnsIDsForMultipleDefinitions_true() {
    Definition firstDefinition = new Definition("delicious");
    Definition secondDefinition = new Definition("head clothes");
    assertEquals(Definition.find(secondDefinition.getId()), secondDefinition);
  }

  @Test
  public void clear_clearsAllDefinitionsFromArrayList_true() {
    Definition myDefinition = new Definition("delicious");
    Definition.clear();
    assertEquals(Definition.all().size(), 0);
  }
}
