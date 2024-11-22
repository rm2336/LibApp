/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistexercise2;

/**
 *
 * @author rokom
 */
public class Books extends LibraryItem {
    private String isbn;
    Books() {
        isbn = "";
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    @Override
    protected String printDetails() {
        return super.printDetails() + "ISBN: " + isbn;
    }
}
