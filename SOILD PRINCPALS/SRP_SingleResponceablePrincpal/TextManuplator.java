package SRP_SingleResponceablePrincpal;

public class TextManuplator {
    
    private String text;
    // Constructor method invocation
    TextManuplator(String text){
        this.text = text;
    }

    // GetMethod
    public String getText(){
        return text;
    }

    // SetMethod
    public String setText(String textName){
        return this.text = textName;
    }

    // append the two strings
    public String textAppend(String newText){
        return text = text.concat(newText);
    }

    // replace the string
    public String textReplace(String word, String textReplace){
        if(text.contains(textReplace)){
           text = text.replace(word, textReplace);
        }
        return text;
    }

    // text deletion
    public String textDeletion(String textDeletion){
        if(text.contains(textDeletion)){
            text = text.replace(textDeletion, "");
        }
        return text;
    } 
}
