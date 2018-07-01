public int cleEAN() {

	int reste;
	int cle;
	int somme;
	int i;
	ArrayList<int> chiffre = new ArrayList<ArrayList<int>>();

	somme = 0;
	i = 1;

	foreach(chiffres : chiffre){
		if(i=1 || i=3 || i=5 || i=7 || i=9 || i=11){
			simpair = chiffre;
			somme = somme+spair;
		} elseif(i=2 || i=4 || i=6 || i=8|| i=10 || i=12){
			spair = chiffre*3;
			somme = somme+spair;
		}
		i++;
	}

	reste = somme%10;
	if(reste = 0){
		cle = 0;
	} else {
		cle = 10 - reste;
	}
	return cle;
} 