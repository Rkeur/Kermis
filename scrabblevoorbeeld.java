package games;


	
	class scrabblevoorbeeld {
		public static void main(String[] args) {
			Auto autoa = new Auto("Audi");
			Auto autob = new Auto("BMW");
			System.out.println(autoa.merknaam);
			System.out.println(autob.merknaam);
		}
	}
	class Auto{
		static String merknaam;
		Auto(String naamMerk){
			merknaam = naamMerk;
		}
}