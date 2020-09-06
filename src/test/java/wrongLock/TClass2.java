package wrongLock;

import annotation.ThreadSafe;

/**
 * @author Xuan
 * Created on Apr 27, 2005
 */
@ThreadSafe
public class TClass2 extends Thread {
    WrongLock wl;
    public TClass2 (WrongLock wl) {
    	this.wl=wl;
    }
    
    public void run() {
    	wl.B();
    }
}
