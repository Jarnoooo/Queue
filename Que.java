/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que;

/**
 *
 * @author Jarno
 */
public class Que {
   
    private String [] WaitingQueue; // array 
    private int queueSize;
    private int front = 0;
    private int rear = 0;
    private int numberOfItems = 0; // to monitor the queue
    
   public Que (int size){ 
        
        queueSize = size; // make an array with variable amount. Defined by user.
        WaitingQueue = new String [size];
        
    }
    
    public insert(String input){
        
        if (numberOfItems + 1 <= queueSize){ // check if there is a place in array 
           
            
            WaitingQueue[rear] ++;
            rear ++;
            numberOfItems ++;
            
            System.out.println(" Insert ");
        }
    
        else{  // no place in array
            
            System.out.println("Queue full, please remove something first");
            return;
        }
    }
        
        public void remove (){
        
            if(numberOfItems > 0){ // check if there is anything in array to remove
                System.out.println(" Remove done "+WaitingQueue[front] );
                front ++;
                numberOfItems --;
                
            }
            
            else{ // if nothing in array 
                
                System.out.println(" Oops nothint to remove");
                return;
            }
        
        }
        public print(){
    
            System.out.println(+numberOfItems);
            }
}
    
    
    /* 
    private Wachtrij [] mensen;
    private int size;
    private int index;
    
    public Que (int grootte){
        mensen = new Wachtrij [grootte];
        size = grootte;
        index = grootte;
        
    }
    public void push (Wachtrij x){
        if (index <= size){
            System.out.println("stack vol! Push geweigerd");
            return;
        }
        
        mensen[index] = x;
        
        System.out.println("Naam is gepushed" +x.getWachtrij()+"op plaats: "+index);
        index --;
        
    }
    public void Queprint (){
        
        System.out.println(" Mens:"+mensen+"gepushed");
        
    }
    
}
