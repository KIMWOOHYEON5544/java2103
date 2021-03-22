package com.example.day06;

public class BookArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Book[] library = new Book[5];
		Book[] library2 = new Book[5];
		
		
		
		library[0] = new Book("태백산맥" , "조정래");
		library[1] = new Book("아리랑" , "조정래");
		library[2] = new Book("데미안" , "헤세");
		library[3] = new Book("어떻게" , "유시민");
		library[4] = new Book("토지" , "박경리");
		
		
		
		for(int i=0; i < library.length; i++) {
			library2[i] = new Book();
			library2[i].setBookName(library[i].getBookName());
			library2[i].setAuthor(library[i].getAuthor());
			library2[i].showBookInfo();
		}
		
	}

}
