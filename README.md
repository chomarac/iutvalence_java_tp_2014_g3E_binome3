# Bataille Navale
Plateau de jeu :
	-La grille de jeu est num�rot�e de 1 � 10 horizontalement
	-La grille de jeu est num�rot�e de A � J Verticalement
	-Pions blancs lorsque les coordonn�es n�ont pas touch� de cible
	-Pions rouges lorsque les coordonn�es ont touch�s une cible

Liste des Bateaux :
	Chaque joueur poss�de les m�mes navires, dont le nombre et le type d�pendent des r�gles du jeu choisies.
Une disposition peut ainsi comporter :
    1 porte-avions (5 cases)
    1 croiseur (4 cases)
    1 contre-torpilleur (3 cases)
    1 sous-marin (3 cases)
    1 torpilleur (2 cases)


R�gle :
La bataille navale oppose deux joueurs qui s'affrontent. Chacun a une flotte compos�e de 5 bateaux, qui sont, en g�n�ral, les suivants : 1 porte-avion (5 cases), 1 croiseur (4 cases), 1 contre torpilleur (3 cases), 1 sous-marin (3 cases), 1 torpilleur (2 cases). Au d�but du jeu, chaque joueur place ses bateaux sur sa grille. Celle-ci est toujours num�rot�e de A � J verticalement et de 1 � 10 horizontalement. Un � un, les joueurs vont "tirer" sur une case de l'adversaire. Par exemple B.3 ou encore H.8. Le but est donc de couler les bateaux adverses. En g�n�ral, les jeux de soci�t� pr�voient des pions blancs pour les tirs dans l'eau (donc qui ne touchent aucun bateau adverse) et des pions rouges pour les "touch�". Au fur et � mesure, il faut mettre les pions sur sa propre grille afin de se souvenir de nos tirs pass�s.

P.S: Si un joueur annonce "touch�", alors il doit dire � son adversaire quel bateau il a touch�.
D�but d�une partie :
Le joueur voit : 
	- 2 grilles : 1 pour sa flotte et les endroits touch�s, 1 pour les endroits touch�s chez l�adversaire
	- 5 bateaux de tailles diff�rentes � placer sur sa propre grille

Les grilles :
	-La grille de jeu est num�rot�e de 1 � 10 horizontalement
	-La grille de jeu est num�rot�e de A � J Verticalement
	- 

Les pions :
	-Pions blancs lorsque les coordonn�es n�ont pas touch� de cible
	-Pions rouges lorsque les coordonn�es ont touch�s une cible




Plus tard ce qu�il faudra prendre en compte :
	-Un tir ne peut pas �tre effectu� au m�me endroit (le joueur rejoue)
	-Un tir qui fait mouche donne le droit au joueur de rejouer
	-Les cases cliqu�es doivent �tre marqu�es automatiquement

	
A faire :

afficher les grilles
retenir la position des bateaux
Dans bateau, chaque bateau doit "savoir" si il est touché ou pas : tableau de coordonnées, 
qd il est touché qq part 
on enlève la coordonnée du tableau, donc qd le tableau est vide, le bateau est coulé!