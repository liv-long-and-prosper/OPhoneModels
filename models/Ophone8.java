/**
 * Ophone8 class is a child of the Ophone class
 *
 * @author Liv Long
 * @version 11.26.24
 * */

package OPhone.models;

/**
 * The type Ophone8
 */
public class Ophone8 extends Ophone{

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
        return super.getModel()+"8";
    }

    /**
     * {@inheritDoc}
     *
     * @return      price
     * */
    @Override
    public long getPrice() {
        return Math.round(super.getPrice()*.6);
    }

    /**
     * GetScreen retrieves the screen size of the current model
     *
     * @return screen size
     */
    public double getScreen(){
        return 5.5;
    }

    /**
     * GetVidRes retrieves the video resolution of the current model
     *
     * @return video resolution
     */
    public String getVidRes(){
        return "720p";
    }

    //---------------------------------------------------------------
    //      OTHER METHODS
    //---------------------------------------------------------------
    @Override
    public String toString(){
        return String.format("%s: Price: $%d, Comm: %s, Camera: %s, Screen Size: %.1f, Video Resolution: %s", getModel(),getPrice(), getComm(), getCam(), getScreen(), getVidRes());
    }
}