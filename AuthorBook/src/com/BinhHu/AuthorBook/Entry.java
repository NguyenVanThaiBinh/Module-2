package com.BinhHu.AuthorBook;

class Entry {
    public static void main(String[] args) {
        Author author[] = new Author[3];
        author[0] = new Author("Binh", "binhu@gmail.com");
        author[1] = new Author("Nguyen", "binhu@gmail.com");
        author[2] = new Author("Dai", "binhu@gmail.com");
        Book book1 = new Book("Java1",author,2000);
        System.out.println("");
        System.out.println(book1.getAuthorName());
    }
}



