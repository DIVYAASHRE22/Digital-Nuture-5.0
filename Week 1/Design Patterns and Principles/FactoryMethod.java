abstract class Document{
	abstract void create();
}
class WordDocument extends Document{
	void create(){
		System.out.println("Word Document Created.");
	}
}
class PdfDocument extends Document{
	void create(){
		System.out.println("PDF Document Created.");
	}
}
class ExcelDocument extends Document{
	void create(){
		System.out.println("Excel Document Created.");
	}
}
abstract class DocumentFactory{
	abstract Document createDocument();
}
class WordFactory extends DocumentFactory{
	Document createDocument(){
		return new WordDocument();
	}
}
class PdfFactory extends DocumentFactory{
	Document createDocument(){
		return new PdfDocument();
	}
}
class ExcelFactory extends DocumentFactory{
	Document createDocument(){
		return new ExcelDocument();
	}
}
public class FactoryMethod{
	public static void main(String args[]){
		DocumentFactory wf = new WordFactory();
		DocumentFactory pf = new PdfFactory();
		DocumentFactory ef = new ExcelFactory();
		wf.createDocument().create();
		pf.createDocument().create();
		ef.createDocument().create();
	}
}