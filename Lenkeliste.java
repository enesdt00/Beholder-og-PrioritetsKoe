public  abstract class Lenkeliste<E> implements Liste<E> {
  Node start;
  int storrelsen;


  class Node{
    Node neste;
    E verdi;
    public Node(E verdi){
        this.verdi=verdi;
    }
   }
   public void leggTil (E x){// ny variabel kan tas sånn måte.
    Node nynoden= new Node(x);
    if(start==null){
        start=nynoden;
    }else{ //hvis start ikke er lik null
        Node noden=start;
        while(noden.neste!=null){
            noden=noden.neste;
        }
        noden.neste=nynoden;
    }storrelsen++;
   }


   @Override
   public int stoerrelse(){
    
    return storrelsen;
    

   }
  @Override
   public E hent()throws UgyldigListeindeks{
    if(start==null){// 
        throw new UgyldigListeindeks(-1);
    }
    return start.verdi;
   }


   @Override
   public E fjern() throws UgyldigListeindeks{
    if(start==null){
       throw new UgyldigListeindeks(-1);
    }else{
    Node noden=start;
    start=start.neste;
    storrelsen--;
    return noden.verdi;}

   }

   public String toString(){
    String T="";
    Node noden=start;
        while(noden !=null){
            T+=noden.verdi+ " ";
            noden=noden.neste;
        }
        return T;

   }

   

    
}
