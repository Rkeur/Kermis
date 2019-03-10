package games;

public class Demo2 {
    public static void main (String[] args){
    SchoenWinkel scapino = new SchoenWinkel();
    scapino.SchoenKopen();
    
    }
}

class Schoen{
	
	}	

class SchoenWinkel{
	Schoen SchoenKopen() {
	 Schoen shoe = new Schoen();
	 return shoe;
	}
}