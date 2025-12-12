package memento_Pattern;

public class EditorState {
    private String Content;
    EditorState(String text){
        this.Content = text;
    }

    public String getContent(){
        return this.Content;
    }
}
