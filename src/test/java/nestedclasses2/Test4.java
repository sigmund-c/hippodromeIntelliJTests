import com.facebook.infer.annotation.*;
              
                       @ThreadSafe                       
                       class Test4 {
  
  
                           C myC2 = new C(); 
  
                           @ThreadSafe  
                           class Test5{

                           C myC = new C();  
    
                           C myC1 = new C(); 
    
                           public void haz(C c) {  
                               myC1 = c;
                           }  
    
    
                           protected void haha(int x) {  
                                myC1.f = x;
                           }  
                        } 
  
  
                           public void hazT2(C c) { 
                               myC2 = c;
                           } 
  
  
                           protected void hahaT2(int x) { 
                              myC2.f = x;
                           } 
                       }  
              
    
                       class C { int f = 0; int i_myCThread = 1; }    
