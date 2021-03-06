package ie.gmit.sw;

import java.util.ArrayList;

/* Our proxy to restrict direct access to there server docs while also stopping multiple instances of
/* MyDocuments being created */
public class DocumentProxy implements DocumentMiddleware {

	// variables
	private MyDocuments docs;
	private String fileName;
	private ArrayList<String> text;
	   
	public DocumentProxy(String s, ArrayList<String> file) {
		this.text = file;
		this.fileName = s;
	}

	public ArrayList<String> compareDocument() throws Exception {
		if(docs == null){
			docs = new MyDocuments(fileName, text);
	    }
		return docs.compareDocument();
	}

	public String addDocument(String n,String a,ArrayList<String> f) throws Exception {
		if(docs == null){
			docs = new MyDocuments(fileName, text);
	    }
		return docs.addDocument(n,a,f);
	}

}
