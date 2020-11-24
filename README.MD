# CDA - TD en groupe
## Contextualisation

Un éleveur de volaille reçoit d’un fournisseur de jeunes canards et de jeunes poulets
qu’il élève jusqu’à ce qu’ils aient la taille nécessaire à leur commercialisation, donc abattables.

## Détail des classes
### Paon
- L'éleveur reçoit aussi des paons qu'il garde gratuitement, pas pour l’abattage,
- mais pour le compte d'un parc naturel de la région.
- L'éleveur rend les paons aux parcs à leurs demandes.
- L'éleveur n'a pas besoin d'enregistrer le poids du paon ou autre information,
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
On considérera que l'éleveur ne peut recevoir au maximum que 7 volailles en tout à la fois
et par type ne peut pas dépasser :
- 4 canards.
- 5 poulets.
- 3 paons.

L'eleveur ne vend une volaille que si elle depasse le poids d'abattage de son type.

## Fonctionnalités 
L'éleveur demande une application pour gérer les opérations suivantes :
- ajouter une volaille.
- ajouter un paon.
- modifier poids abattage.
- modifier prix du jour.
- modifier poids d'une volaille.
- voir le nombre de volailles par type.
- voir le total de prix des volailles abattables.
- voir toutes les volailles.
- vendre une volaille.
- rendre un paon au parc.

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
- Valentin
- Quentin
- Antoine
- Pierre