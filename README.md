 # EXERCICE 1:

 ## Objectif
Ce projet a pour but de comprendre et de mettre en œuvre le principe d’héritage en Java à travers une hiérarchie de classes représentant différents types de comptes bancaires.

 ## Description du projet
Le programme met en place une structure orientée objet composée de trois classes principales et d’un programme de test :
Compte : classe de base représentant un compte bancaire standard.
Elle contient :
un numéro unique auto-incrémenté, un solde,
des méthodes pour déposer, retirer et afficher les détails du compte.
CompteEpargne : sous-classe de Compte ajoutant un taux d’intérêt et une méthode appliquerInterets() permettant de calculer les gains.
CompteCourant : sous-classe de Compte ajoutant la notion de découvert autorisé, permettant de retirer plus que le solde disponible dans une certaine limite.
Main : classe de test permettant de créer plusieurs comptes, d’effectuer des opérations (dépôt, retrait, application d’intérêts) et de démontrer le polymorphisme.

<img width="1015" height="543" alt="image" src="https://github.com/user-attachments/assets/9d2c9ce3-3740-4a12-a744-ee074a3f52dc" />

 # EXERCICE 2:

 ## Objectif
Mettre en pratique le principe d’héritage en Java à travers la modélisation d’un zoo contenant différents types d’animaux.
Le projet met également en œuvre la gestion d’un tableau dynamique d’animaux, capable de s’agrandir automatiquement.

 ## Description du projet

Le programme définit une hiérarchie de classes représentant plusieurs familles d’animaux, ainsi qu’une classe Zoo qui les gère.
Chaque classe possède ses propres attributs et comportements.
Classes principales :
Animal : classe de base contenant un identifiant unique, un nom et un âge.
Elle définit des comportements communs comme seDeplacer() et une méthode toString().
Mammifere : hérite de Animal, ajoute la couleur de la fourrure et une méthode allaiter().
Oiseau : hérite de Animal, ajoute une envergure et une méthode voler().
Reptile : hérite de Animal, ajoute le type d’écailles et une méthode seChauffer().
Zoo : contient un tableau dynamique d’objets Animal.
Il permet d’ajouter de nouveaux animaux et d’afficher tous ceux présents.
Le tableau double automatiquement de taille lorsqu’il est plein.
Main : classe de test qui crée un zoo, ajoute plusieurs animaux, déclenche l’agrandissement du tableau et exécute des comportements spécifiques selon le type d’animal.

<img width="1048" height="376" alt="image" src="https://github.com/user-attachments/assets/0f2628e9-4893-448a-b600-b965341e7293" />

 # EXERCICE 3:
 ## Objectif

Mettre en œuvre les concepts d’héritage et de composition en Java à travers la modélisation d’un parc de véhicules motorisés.
Le programme gère différents types de véhicules (voitures, camions, motos, voitures électriques) ainsi qu’une flotte dynamique capable de s’agrandir et de calculer la distance totale parcourue.

 ## Description du projet
Le projet repose sur une hiérarchie de classes :
Vehicule : classe de base avec un identifiant et un modèle.
Motorise : hérite de Vehicule et ajoute un moteur, un niveau de carburant/batterie et un compteur kilométrique.
Sous-classes de Motorise :
Voiture : ajoute le nombre de portes et un klaxon.
Camion : gère la capacité de charge.
Moto : définit la cylindrée et une figure (wheelie).
VoitureElectrique : surcharge la méthode refuel() pour la recharge.
Moteur : classe en composition décrivant le type et la puissance du moteur.
Flotte : gère dynamiquement un tableau de véhicules et calcule la distance totale parcourue.
Main : crée plusieurs véhicules, les ajoute à la flotte et exécute différents scénarios de conduite.

<img width="1390" height="498" alt="image" src="https://github.com/user-attachments/assets/0bf631f5-8427-4073-a5a6-2e5437052bf1" />

# EXERCICE 4:
 ## Objectif

Ce projet a pour objectif de modéliser et gérer une bibliothèque numérique en Java, en mettant en pratique les principes de l’encapsulation, de l’héritage et de la manipulation de tableaux d’objets.

## Description du projet
Le programme simule une bibliothèque composée de différents types de documents (livres, revues, etc.).
Chaque document possède un numéro d’enregistrement auto-incrémenté, un titre, et éventuellement un auteur.
La classe principale Bibliotheque permet de :
Créer une bibliothèque avec une capacité maximale donnée,
Ajouter et supprimer des documents,
Afficher tous les documents enregistrés,
Rechercher un document par son numéro d’enregistrement,
Afficher la liste de tous les auteurs.
Une classe de test (dans le package test) permet d’interagir avec l’utilisateur à travers un menu dynamique (ajout, suppression, affichage, recherche, etc.).

<img width="1230" height="725" alt="image" src="https://github.com/user-attachments/assets/727c5d5c-de64-4d5e-a7f2-dc0c2affbf5f" />
