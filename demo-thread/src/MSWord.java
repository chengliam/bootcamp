import java.util.List;
import java.util.Stack;

// Stack

public class MSWord {
  private Stack<String> undoStack;
  private Stack<String> redoStack;

  // constructor
  public MSWord() {
    this.undoStack = new Stack<>();
    this.redoStack = new Stack<>();
  }

  public void undo() {
    if (!undoStack.isEmpty()) {
      String element = undoStack.pop();
      redoStack.push(element);
    }
  }

  public void redo() {
    if (!redoStack.isEmpty()) {
      String element = redoStack.pop();
      undoStack.push(element);
    }
  }

  public void addWord(String word) {
    this.undoStack.push(word);
  }

  public List<String> getWords() {
    return this.undoStack;
  }

  public static void main(String[] args) {
    MSWord msWord = new MSWord();
    msWord.undo();
    msWord.redo();
    msWord.addWord("John");
    msWord.addWord("Peter");
    msWord.undo();
    System.out.println(msWord.getWords()); // ["John"]
    msWord.redo();
    System.out.println(msWord.getWords()); // ["John", "Peter"]
  }
}