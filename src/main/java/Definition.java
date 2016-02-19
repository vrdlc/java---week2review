import java.util.ArrayList;

public class Definition {
  private static ArrayList<Definition> definitions = new ArrayList<Definition>();

  private String mDefinition;

  public Definition(String definition) {
    mDefinition = definition;
    definitions.add(this);
  }

  public String getDefinition() {
    return mDefinition;
  }

  public static ArrayList<Definition> all() {
    return definitions;
  }
}
