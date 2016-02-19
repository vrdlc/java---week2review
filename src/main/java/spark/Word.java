import java.util.ArrayList;

public class Word {
  private static ArrayList<Word> words = new ArrayList<Word>();

  private String mDescription;
  private int mId;


  public Word(String description) { //IS THERE A BETTER NAME FOR WORD?
    mDescription = description;
    words.add(this); //.add(this) IS PAIRED WITH .all()
    mId = words.size();
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

}
