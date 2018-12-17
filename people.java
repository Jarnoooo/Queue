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
public class people {
    private String people;
    
    public people (String w){
        people = w;
        
}
public String getWaitingQueue (){
    return people;
}
public void setWaitingQueue (String w){
    people = w;
}
}