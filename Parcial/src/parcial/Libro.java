package parcial;
public class Libro {

private String titulo;
private String autor;
private int numEjemplares;
private int numEjemplaresPrestados;


public Libro (){
    
    titulo = "";
    autor = "";
    numEjemplares = 0;
    numEjemplaresPrestados = 0;
    
    
}

public void libroVacio(){
    
    
}

public void imprimir(){
    
    System.out.println("titulo: " + titulo);
    System.out.println("autor: " + autor);
  
}

public void setTitulo(String titulo){
    
    this.titulo = titulo;
}

public void setAutor ( String autor){
    
    this.autor = autor;
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

public boolean prestamo(){
    
    if (numEjemplares <=0){
        
       numEjemplares ++;
       
       return true;
    }  
    
    return false;
}

public int ejemplaresDisponibles(){
    
    return numEjemplares - numEjemplaresPrestados;
}

public boolean devolucion (){
    
    if (numEjemplaresPrestados <= 0 ){
        
        numEjemplaresPrestados ++ ;
        
        return true;
    }
    return false;
}


    
}
