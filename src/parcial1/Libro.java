package parcial1;
public class Libro {


private String titulo;
private String autor;
private int numEjemplares;
private int numEjemplaresPrestados;


public Libro (String titulo,String autor, int numEjemplares,int numEjemplaresPrestados){
    
    this.titulo = titulo;
    this.autor = autor;
    this.numEjemplares = numEjemplares;
    this.numEjemplaresPrestados = numEjemplaresPrestados;
    
    
}




public void setTitulo(String titulo){
    
    this.titulo = titulo;
}

public void setAutor ( String autor){
    
    this.autor = autor;
}

public void setnumEjemplares ( int numEjemplares){
    
    this.numEjemplares = numEjemplares;
}

public void setnumEjemplaresPrestados ( int numEjemplaresPrestados){
    
    this.numEjemplaresPrestados = numEjemplaresPrestados;
}


public String getTitulo(){
    
    return titulo;
}

public String getAutor(){
    
    return autor;
}

public int getNumEjemplares(){
    
    return numEjemplares;
}

public int getNumEjemplaresPrestados(){
    
    return numEjemplaresPrestados;
}

public boolean disponible(){
    
    if (numEjemplares > numEjemplaresPrestados){
        
       numEjemplares ++;
       
       return true;
    }  
    
    return false;
}


public boolean devolucion (){
    
    if (numEjemplaresPrestados > 0 ){
        
        numEjemplaresPrestados -- ;
        
        return true;
    }
    return false;
}

public void imprimpir (){
    System.out.println("Titulo: " + titulo + "\nAutor: " + autor + "\nNumeros Ejemplares: " + numEjemplares + "\nNumeros ejemplares pretados: " + numEjemplaresPrestados);
            
    
}    

}