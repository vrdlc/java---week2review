import java.util.ArrayList;

import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.fluentlenium.core.filter.FilterConstructor.*;
import static org.assertj.core.api.Assertions.assertThat;

public class IntegrationTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
      return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();


  @Test
  public void rootTest() {
      goTo("http://localhost:4567/");
      assertThat(pageSource()).contains("Homemade Dictionary");
  }

  @Test
  public void wordIsCreated() {
    goTo("http://localhost:4567/");
    click("a", withText("Add a New Word"));
    fill("#word").with("fish");
    submit(".btn");
    assertThat(pageSource()).contains("Your Word Has Been Saved");
  }

  @Test
  public void wordIsDisplayed() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("fish");
    submit(".btn");
    click("a", withText("Return to Word List"));
    assertThat(pageSource()).contains("fish");
  }

  @Test
  public void wordDefinitionFormIsDisplayed() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("fish");
    submit(".btn");
    click("a", withText("Return to Word List"));
    click("a", withText("fish"));
    click("a", withText("Add a New Definition"));
    assertThat(pageSource()).contains("Add a definition to fish");
  }

  @Test
  public void definitionIsAddedAndDisplayed() {
    goTo("http://localhost:4567/words/new");
    fill("#word").with("fish");
    submit(".btn");
    click("a", withText("Return to Word"));
    click("a", withText("fish"));
    click("a", withText("Add a new definition"));
    fill("#definition").with("delicious");
    submit(".btn");
    assertThat(pageSource()).contains("delicious");
  }
}
