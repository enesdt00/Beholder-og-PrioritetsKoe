public class Koe<E> extends Lenkeliste<E> {

   

    @Override
    public void leggTil (E x){// ny variabel kan tas sånn måte.
        super.leggTil(x);
       }
       @Override
       public int stoerrelse(){
        return  super.stoerrelse();
       }
       @Override
       public E hent(){
        return super.hent();
       }
       @Override
       public E fjern() throws UgyldigListeindeks{
        return super.fjern();
       }
    
}
