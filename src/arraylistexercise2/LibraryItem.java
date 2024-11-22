/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylistexercise2;

/**
 *
 * @author rokom
 */
public class LibraryItem implements java.io.Serializable {
    protected String name, desc, id;
    LibraryItem() {
        name = "";
        desc = "";
        id = "";
    }
    
    protected void setName(String input) {
        name = input;
    }
    
    protected void setDesc(String input) {
        desc = input;
    }
    
    protected void setId(String input) {
        id = input;
    }

    protected String getName() {
        return name;
    }

    protected String getDesc() {
        return desc;
    }

    protected String getId() {
        return id;
    }
    
    protected String printDetails() {
        return "Name: " + name + "\nDesc: " + desc + "\nId: " + id + "\n";
    }
    
}
