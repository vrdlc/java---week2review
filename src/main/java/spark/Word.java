import java.util.ArrayList;

public class Word {
  private static ArrayList<Word> words = new ArrayList<Word>();

  private String mDescription;


  public Word(String description) { //IS THERE A BETTER NAME FOR WORD?
    mDescription = description;
    words.add(this); //.add(this) IS PAIRED WITH .all()

  }

  public String getDescription() { //WHY RETURN mDescription AND NOT description?
    return mDescription;
  }

  public static ArrayList<Word> all() {
    return words;
  }

}
