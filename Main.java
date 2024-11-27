/**
 * Ophone class to be used as the topmost superclass
 *
 * @author Liv Long
 * @version 11.26.24
 * */
package OPhone;

import OPhone.models.*;

import java.util.ArrayList;

/**
 * The type Main.
 */

public class Main {
    /**
     * Main method used to build an ArrayList of Ophone objects
     *
     * @param args the args
     */
    public static void main(String[] args){

        // initialize an ArrayList of type Ophone
        ArrayList<Ophone> ophoneArray = new ArrayList<>();

        // add each Ophone model to the ophoneArray
        ophoneArray.add(new Ophone());
        ophoneArray.add(new Ophone8());
        ophoneArray.add(new Ophone8Mini());
        ophoneArray.add(new Ophone9());
        ophoneArray.add(new Ophone9Max());
        ophoneArray.add(new OphoneX());
        ophoneArray.add(new OphoneXFold());
        ophoneArray.add(new OphoneXFilm());

        // loop through ophoneArray and print each Ophone object
        for (int i = 0; i < ophoneArray.size(); i++){
            System.out.println(ophoneArray.get(i));
        }
    }
}