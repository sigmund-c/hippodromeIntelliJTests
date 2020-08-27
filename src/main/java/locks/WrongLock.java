package locks;

//import com.facebook.infer.annotation.*;

/**
 * @author Xuan
 * Created on 2005-1-18
 * <p>
 * This class simulates the wrong lock bug
 * Method A requests a lock on data while method B request a lock
 * on the class.
 */

@ThreadSafe
public class WrongLock {
    Data data;

    public WrongLock(Data data) {
        this.data = data;
    }

    public void A() {

            int x = data.value;
            data.value++;
            //assert (data.value==x+1);
            if (data.value != (x + 1))
                throw new RuntimeException("bug found");

    }

    public void B() {

            data.value++;
    }
}


/*

Procedure: void WrongLock.A()
void void WrongLock.A()(wrongLock.WrongLock* this)
Analyzed
ERRORS: 
WARNINGS: 
FAILURE:NONE SYMOPS:56
Biabduction: phase= RE_EXECUTION
--------------------------- 1 of 1 [nvisited:22 24 25 27 30] ---------------------------
PRE:
this = val$1: ;
val$2|->{value:val$3}:; this|->{data:val$2}:
POST 1 of 1:
return = val$4:; this = val$1: ;
val$2|->{value:(val$3 + 1)}:; this|->{data:val$2}:
----------------------------------------------------------------
RacerD: 
Threads: AnyThread, Locks: 0 
Accesses { {elem= Access: Read of this->data Thread: AnyThread Lock: false Pre: OwnedIf{ 0 }; loc= line 24; trace= { }},
           {elem= Access: Read of this->data->value Thread: AnyThread Lock: false Pre: OwnedIf{ 0 }; loc= line 24; trace= { }},
           {elem= Access: Write to this->data->value Thread: AnyThread Lock: false Pre: OwnedIf{ 0 }; loc= line 25; trace= { }} } 
Ownership: Owned 
Return Attributes: Nothing 

Starvation: {thread= UnknownThread; return_attributes= Nothing;
             critical_pairs={ };
             scheduled_work= { };
             attributes= { }}

Procedure: void WrongLock.B()
void void WrongLock.B()(wrongLock.WrongLock* this)
Analyzed
ERRORS: 
WARNINGS: 
FAILURE:NONE SYMOPS:22
Biabduction: phase= RE_EXECUTION
--------------------------- 1 of 1 [nvisited:32 34 36] ---------------------------
PRE:
this = val$1: ;
val$2|->{value:val$3}:; this|->{data:val$2}:
POST 1 of 1:
return = val$4:; this = val$1: ;
val$2|->{value:(val$3 + 1)}:; this|->{data:val$2}:
----------------------------------------------------------------
RacerD: 
Threads: AnyThread, Locks: 0 
Accesses { {elem= Access: Read of this->data Thread: AnyThread Lock: false Pre: OwnedIf{ 0 }; loc= line 34; trace= { }},
           {elem= Access: Read of this->data->value Thread: AnyThread Lock: false Pre: OwnedIf{ 0 }; loc= line 34; trace= { }},
           {elem= Access: Write to this->data->value Thread: AnyThread Lock: false Pre: OwnedIf{ 0 }; loc= line 34; trace= { }} } 
Ownership: Unowned 
Return Attributes: Nothing 

Starvation: {thread= UnknownThread; return_attributes= Nothing;
             critical_pairs={ };
             scheduled_work= { };
             attributes= { }}
 */
