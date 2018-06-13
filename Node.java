package it.unige.se.ReqAnModel;

/**
 * Un singolo nodo del grafo 
 * @author Alessandro Scotto
 *
 */

public class Node {
	
	private ObjRequirement v;
	
	public Node(ObjRequirement v){
		this.v=v;
	}
    
    public ObjRequirement getV() {
        return v;
    }


    
}
