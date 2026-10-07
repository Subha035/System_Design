import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DocumentEditor {
    ArrayList<String> documentElements;
    String renderedDocument;

    // Constructor
    public DocumentEditor() {
        documentElements = new ArrayList<>();
        renderedDocument = "";
    }

    public void addText(String text) {
        documentElements.add(text);
        renderedDocument = ""; // Clear cache
    }

    public void addImage(String imagePath) {
        documentElements.add(imagePath);
        renderedDocument = ""; // Clear cache
    }

    String renderDocument() {
        if (renderedDocument.isEmpty()) {
            String result = "";

            for (String element : documentElements) {
                if (element.endsWith(".jpg") || element.endsWith(".png")) {
                    result += "[Image: " + element + "]\n";
                } else {
                    result += element + "\n";
                }
            }

            renderedDocument = result;
        }

        return renderedDocument;
    }

    void saveToFile() {
        try {
            FileWriter file = new FileWriter("document.txt");
            file.write(renderDocument());
            file.close();
            System.out.println("Document saved to document.txt");
        } catch (IOException e) {
            System.out.println("Error: Unable to open file for writing.");
        }
    }

    public static void main(String[] args) {
        DocumentEditor editor = new DocumentEditor();

        editor.addText("Hello World");
        editor.addImage("picture.jpg");
        editor.addText("This is a document editor");

        System.out.println(editor.renderDocument());
        editor.saveToFile();
    }
}