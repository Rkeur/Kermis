package games;

class Demo{
    public static void main (String[] args){
    	Car auto1 = new Car();
    	Car auto2 = new Car();
    	auto1.liters = 50;
    	auto2.liters = 60;
    	
    	auto1.LitersTanken();
    	System.out.println(auto1.liters);
    	auto2.LitersTanken();
    	
    	
    	System.out.println(auto2.liters);
    	
	}
}    	

class Car{
	int liters;
		void LitersTanken(){
		liters +=20;
		if(liters >= 60)
		System.out.println("De tank zit vol");
		liters = 60;
		
		{

		}
	}
}