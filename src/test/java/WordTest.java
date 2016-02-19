import org.junit.*;
import static org.junit.Assert.*;

public class WordTest {

  @Test
  public void word_instantiatesCorrectly_true() {
    Word myWord = new Word("fish");
      assertEquals(true, myWord instanceof Word);
  }

  @Test
  public void word_instantiatesWithDescription_true() {
    Word myWord = new Word("fish");
    assertEquals("fish", myWord.getDescription());
  }

  // @Test
  // public void all_returnsAllInstancesOfWord_true() {
  //   Word firstWord = new Word("fish");
  //   Word secondWord = new Word("hat");
  //   assertTrue(Word.all().contains(firstWord));
  //   assertTrue(Word.add().contains(secondWord));
  // }

/*
@Test
public void giveChange_25cents_1quarter() {
  App testApp = new App();
  assertEquals("{Nickels=0, Dimes=0, Quarters=1, Pennies=0}", testApp.giveChange(25).toString());
}
*/

}
