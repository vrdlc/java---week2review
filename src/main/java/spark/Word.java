import java.util.ArrayList;

public class Word {

  private String mDescription;


  public Word(String description) { //IS THERE A BETTER NAME FOR WORD?
    mDescription = description;

  }

  public String getDescription() { //WHY RETURN mDescription AND NOT description?
    return mDescription;
  }



}
