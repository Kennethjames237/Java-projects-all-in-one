package memento_Pattern;

import java.util.List;
import java.util.ArrayList;

public class History {
   private List<EditorState> state = new ArrayList<>();
    
   public void push(EditorState s){
    this.state.add(s);
   }
   public EditorState pop(){
    var last_index = state.size() - 1;
     EditorState last_state = state.get(last_index);
     state.remove(last_index);
     return last_state;
   }
}
