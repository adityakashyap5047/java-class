interface Printable{

    abstract void print();
}

interface Showable{

    abstract void show();
}

class Document implements Printable, Showable{

    public void print(){
        System.out.println("Printing the documents.");
    }

    public void show(){
        System.out.println("Displaying the documents.");
    }
}

public class MultipleInheritance {
    
    public static void main(String[] args) {
        
        Document doc = new Document();

        doc.print();
        doc.show();
    }
}
