package memento_Pattern;

public class Editor {
    private String Content;

    // Editor(String text){
    // this.Content = text;
    // }
    
    public void setContent(String cont) {
        this.Content = cont;
    }

    public EditorState CreateState() {
        return new EditorState(this.Content);
    }

    public void restore(EditorState Es) {
        this.Content = Es.getContent();
    }

    public String getContent() {
        return this.Content;
    }
}
