import java.util.ArrayList;

public class Word {
  private static ArrayList<Word> words = new ArrayList<Word>();

  private String mDescription;
  private int mId;
  private String mDefinition;
  private ArrayList<Definition> mDefinitions;


  public Word(String description) { //IS THERE A BETTER NAME FOR WORD?
    mDescription = description;
    words.add(this); //.add(this) IS PAIRED WITH .all()
    mId = words.size();
    mDefinitions = new ArrayList<Definition>();
  }

  public String getDescription() { //WHY RETURN mDescription AND NOT description?
    return mDescription;
  }

  public static ArrayList<Word> all() {
    return words;
  }

  public int getId() {
    return mId;
  }

  public static Word find(int id) {
    try{
      return words.get(id - 1);
    } catch (IndexOutOfBoundsException e) {
      return null;
    }
  }


  public ArrayList<Definition> getDefinitions() {
    return mDefinitions;
  }

  public void addDefinition(Definition definition) {
    mDefinitions.add(definition);
  }

  public static void clear() {
    words.clear();
  }
}
