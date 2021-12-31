# CDA - TD en groupe
Projet réalisé en début de formation CDA, il s'agit d'une appli réalisé en java 11 avec un terminal unique.
Le but était de mettre pratique l'algorithmie ainsi que notre apprentissage dans le java

</br>
</br>

# Installation de l'appli :
- Vérfier que la jdk 11 est installer sur votre machine
- Cloner le repos git en local sur votre machine 
- Placer vous à la racine du repos git local
- Vérfier que le fichier chickenRun.jar existe
  
### Windows :

```batch
.\launcher.bat
```

![image](https://i.goopics.net/apnwaw.png)

### Linux :

```shell
bash launcher.sh
```

![image](https://i.goopics.net/3nbgbd.png)


## Contextualisation

Un éleveur de volaille reçoit d’un fournisseur de jeunes canards et de jeunes poulets
qu’il élève jusqu’à ce qu’ils aient la taille nécessaire à leur commercialisation, donc abattables.

## Détail des classes
### Paon
- L'éleveur reçoit aussi des paons qu'il garde gratuitement, pas pour l’abattage,
- mais pour le compte d'un parc naturel de la région.
- L'éleveur peut aussi accueillir des cygnes de la part des parcs
- L'éleveur rend les paons et les cygnes aux parcs à leurs demandes.
- L'éleveur n'a pas besoin d'enregistrer le poids du paon ou autre information, de même pour les cygnes
- seul l'identifiant est nécessaire.
- La gestion/generation de l'identifiant pour le paon est la même que les autres volailles.
- Le paon est un oiseau galliforme de la famille des phasianidés. 
- Il existe plusieurs espèces de paons. Le plus connu est le paon bleu.

### Volaille
- Une volaille est caractérisée par son poids et un numéro d’identification reporté
sur une bague qu’elle porte a sa patte.
- Les volailles arrivent à l’élevage à l’âge de trois semaines.
Elles sont baguées et enregistrées dans le système informatique.
- Le prix du canard et celui du poulet sont deux prix différents, exprimés en euros par kilo.
- En revanche, le prix est le même pour tous les individus de la même espèce.
Ce prix varie chaque jour.
- Le poids auquel on abat les bêtes est différents pour les canards et les poulets,
mais c’est le même pour tous les poulets (respectivement, tous les canards).

### Eleveur
On considérera que l'éleveur ne peut recevoir au maximum que 8 volailles en tout à la fois
et par type ne peut pas dépasser :
- 4 canards.
- 5 poulets.
- 3 paons.
- 2 cygnes

L'eleveur ne vend une volaille que si elle depasse le poids d'abattage de son type.

## Fonctionnalités 
L'éleveur demande une application pour gérer les opérations suivantes :
- ajouter une volaille.
- ajouter un paon.
- ajouter un signe
- modifier poids abattage.
- modifier prix du jour.
- modifier poids d'une volaille.
- voir le nombre de volailles par type.
- voir le total de prix des volailles abattables.
- voir toutes les volailles.
- vendre une volaille.
- rendre un paon au parc.
- rendre un signe au parc

Attention, il y a des informations qui sont inutiles à gerer par l'application.
L'application doit être facilement modifiable si on décide d'ajouter un autre type à plume abattable 
comme les canards ou un type non abattable comme les paons.

## Contraintes

Essayer d'utiliser, si possible !! :
- attribut final
- attribut de classe
- constante final + static
- classe finale
- classe abstraite
- interface
- méthode abstraite dans une classe abstraite
- méthode finale


### Partage des tâches
- Valentin :
  - voir le nombre de volailles par type.
  - voir le total de prix des volailles abattables.
  - voir toutes les volailles.
- Quentin : 
  - Main, 
  - Logique, 
  - affichage, 
  - Entrées
- Antoine : 
  - ajouter une volaille abattable.
  - ajouter un paon.
- Pierre : 
  - méthodes statiques (poids abattage, prix du jour), 
  - modifier le poids d'une volaille
