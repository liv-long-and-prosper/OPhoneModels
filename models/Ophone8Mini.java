/**
 * Ophone8Mini class is a child of the Ophone8 class
 *
 * @author Liv Long
 * @version 11.26.24
 * */

package OPhone.models;

/**
 * The type Ophone8Mini
 */
public class Ophone8Mini extends Ophone8{

    //---------------------------------------------------------------
    //      GET METHODS
    //---------------------------------------------------------------
    /**
     * {@inheritDoc}
     *
     * @return      model
     * */
    @Override
    public String getModel(){
        return super.getModel()+"Mini";
    }

    /**
     * {@inheritDoc}
     *
     * @return price
     * */
    @Override
    public long getPrice() {
        return Math.round(super.getPrice()*1.1);
    }

    /**
     * {@inheritDoc}
     *
     * @return screen size
     * */
    @Override
    public double getScreen(){
        return 4.6;
    }


}