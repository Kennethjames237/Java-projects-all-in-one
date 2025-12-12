package memento_Pattern;




public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
         History history = new History();

         editor.setContent("james");
         history.push(editor.CreateState());

         editor.setContent("ken");
        history.push(editor.CreateState());

         editor.setContent("nna");
        history.push(editor.CreateState());

        editor.restore(null);

        System.out.println(editor.getContent());
    }
    
}
