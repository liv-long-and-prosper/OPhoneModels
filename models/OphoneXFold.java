/**
 * OphoneXFold class is a child of the OphoneX class
 *
 * @author Liv Long
 * @version 11.26.24
 * */

package OPhone.models;


/**
 * The type OphoneXFold
 */
public class OphoneXFold extends OphoneX{

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
        return super.getModel()+"Fold";
    }

    /**
     * {@inheritDoc}
     *
     * @return      price
     * */
    @Override
    public long getPrice(){
        return Math.round(super.getPrice()*1.15);
    }

    /**
     * {@inheritDoc}
     *
     * @return      screen size
     * */
    @Override
    public double getScreen(){
        return 7.5;
    }

    /**
     * GetExtra returns any extra specs the current model has
     *
     * @return extra specs
     */
    public String getExtra(){
        return "foldable";
    }

    //---------------------------------------------------------------
    //      OTHER METHODS
    //---------------------------------------------------------------

    @Override
    public String toString(){
        return String.format("%s: Price: $%d, Comm: %s, Camera: %s, Screen Size: %.1f, Video Resolution: %s, Extra: %s", getModel(),getPrice(), getComm(), getCam(), getScreen(), getVidRes(), getExtra());
    }
}