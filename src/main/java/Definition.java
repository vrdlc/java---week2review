import java.util.ArrayList;

public class Definition {
  private static ArrayList<Definition> definitions = new ArrayList<Definition>();

  private String mDefinition;
  private int mId;

  public Definition(String definition) {
    mDefinition = definition;
    definitions.add(this);
    mId = definitions.size();
  }

  public String getDefinition() {
    return mDefinition;
  }

  public static ArrayList<Definition> all() {
    return definitions;
  }

  public int getId() {
    return mId;
  }

  public static Definition find(int id) {
    try {
      return definitions.get(id - 1 );
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }

  public static void clear() {
    definitions.clear();
  }
}
