package Builder;

import java.awt.Font;

class ConversorPDF extends ConversorTexto {
 	public void converterCaractere(char c) {
 		System.out.print("Caractere PDF");
 	}

 	public void converterParagrafo() {
 		System.out.print("Par�grafo PDF");
 	}

 	public void converterFonte(Font f) {
 		System.out.print("Fonte PDF");
 	}
 }
