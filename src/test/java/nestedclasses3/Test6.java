import com.facebook.infer.annotation.*;
              
                       @ThreadSafe                       
                       class Test6 {
  
  
                           B myB2 = new B(); 
  
                           @ThreadSafe  
                           class Test3{

                           B myB = new B();  
    
                           B myB1 = new B(); 
    
                           public void haz(B b) {  
                               myB1 = b;
                           }  
    
    
                           protected void haha(int x) {  
                                myB1.f = x;
                           }

                               @ThreadSafe
                               class Test7{
                                   B myB4 = new B();


                                   public void haz(B b) {
                                       myB4 = myB1;
                                   }


                                   protected void haha(int x) {
                                       synchronized (myB) { myB4.f = x; }
                                   }

                               }
                        } 
  
  
                           public void hazT2(B b) { 
                               myB2 = b;
                           } 
  
  
                           protected void hahaT2(int x) { 
                              myB2.f = x;
                           } 
                       }  
              
    
                       class B { int f = 0; int i_myBThread = 1; }    
