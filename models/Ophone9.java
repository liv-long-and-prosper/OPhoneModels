/**
 * Ophone9 class is a child of the Ophone9 class
 *
 * @author Liv Long
 * @version 11.26.24
 * */

package OPhone.models;

/**
 * The type Ophone 9.
 */
public class Ophone9 extends Ophone{

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
        return super.getModel()+"9";
    }

    /**
     * {@inheritDoc}
     *
     * @return      price
     * */
    @Override
    public long getPrice(){
        return Math.round(super.getPrice()*.8);
    }

    /**
     * {@inheritDoc}
     *
     * @return      comm
     * */
    @Override
    public String getComm(){
        return "5G";
    }


    /**
     * {@inheritDoc}
     *
     * @return      cam
     * */
    @Override
    public String getCam(){
        return "10MP";
    }


    /**
     * GetScreen retrieves the screen size of the current model
     *
     * @return screen size
     */
    public double getScreen(){
        return 5.6;
    }

    /**
     * GetVidRes retrieves the video resolution of the current model
     *
     * @return video resolution
     */
    public String getVidRes(){
        return "1080p";
    }

    //---------------------------------------------------------------
    //      OTHER METHODS
    //---------------------------------------------------------------
    @Override
    public String toString(){
        return String.format("%s: Price: $%d, Comm: %s, Camera: %s, Screen Size: %.1f, Video Resolution: %s", getModel(),getPrice(), getComm(), getCam(), getScreen(), getVidRes());
    }
}