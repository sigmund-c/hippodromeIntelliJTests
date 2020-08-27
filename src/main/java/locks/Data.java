package locks;

//import com.facebook.infer.annotation.*;

/**
 * @author Xuan
 * Created on 2005-1-18
 */

@ThreadSafe
public class Data {

    public int value;
    int a;
    public Data() {
    	value=0;
    }
}
