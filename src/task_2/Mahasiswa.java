package task_2;

/**
 * nim  : 1301154525
 * nama : Karina Hasya Utami Dewi
 */
public class Mahasiswa {
      private String NIM;
      private String Nama;
      private String status;
      private char [] nilai;
      private int i;
      
public Mahasiswa(){
    this.status = "Tidak lulus";
    this. i = 0;
    this.nilai = new char [10];
        
}
public Mahasiswa (String NIM, String Nama){
    this.NIM = NIM;
    this.Nama = Nama;
    this.status = "Tidak lulus";
    this. i = 0;
    this.nilai = new char [10];
    
}


    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNilai(char[] nilai) {
        this.nilai = nilai;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getStatus() {
        return status;
    }

    public char[] getNilai() {
        return nilai;
    }

    public int getI() {
        return i;
    }

 public char getNilai (int i){
     return nilai[i];
}  

public void addNilai( char nilai){
    this.nilai[i] =  nilai ;
    i= i+1;           
}   

public String toString(){
    
}

public char cekNilai(Mahasiswa m){
    
}

public static void main(String[] args) {
          
    }
}
