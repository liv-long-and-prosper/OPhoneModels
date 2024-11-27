/**
 * Ophone class to be used as the topmost superclass
 *
 * @author Liv Long
 * @version 11.26.24
 * */

package OPhone.models;

/**
 * The type Ophone
 */
public class Ophone{

    //---------------------------------------------------------------
    //      GET METHODS
    //---------------------------------------------------------------

    /**
     * GetModel retrieves the Ophone Model
     *
     * @return model string
     */
    public String getModel(){
        return "OPhone";
    }

    /**
     * GetPrice retrieves the price of the current model
     *
     * @return price
     */
    public long getPrice() {
        return 790;
    }

    /**
     * GetComm retrieves the communication technology of the current model
     *
     * @return comm
     */
    public String getComm() {
        return "4G";
    }

    /**
     * GetCam retrieves the camera specs of the current model
     *
     * @return cam
     */
    public String getCam(){
        return "8MP";
    }

    //---------------------------------------------------------------
    //      OTHER METHODS
    //---------------------------------------------------------------

    public String toString(){
        return String.format("%s: Price: $%d, Comm: %s, Camera: %s", getModel(), getPrice(), getComm(), getCam());
    }
}