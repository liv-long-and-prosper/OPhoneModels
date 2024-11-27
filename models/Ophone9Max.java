/**
 * Ophone9Max class is a child of the Ophone9 class
 *
 * @author Liv Long
 * @version 11.26.24
 * */

package OPhone.models;

/**
 * The type Ophone9Max
 */
public class Ophone9Max extends Ophone9{

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
        return super.getModel()+"Max";
    }

    /**
     * {@inheritDoc}
     *
     * @return      price
     * */
    @Override
    public long getPrice(){
        return Math.round(super.getPrice()*1.2);
    }

    /**
     * {@inheritDoc}
     *
     * @return      screen size
     * */
    @Override
    public double getScreen(){
        return 6.5;
    }
}