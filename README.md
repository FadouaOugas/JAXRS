# TP Spring Boot JAX-RS - Service REST avec H2 Database

## Description
Projet Spring Boot avec JAX-RS (Jersey) implémentant un service REST pour la gestion de comptes bancaires avec support JSON et XML.

## Technologies utilisées
- Spring Boot 3.5.7
- Spring Data JPA
- Jersey (JAX-RS)
- H2 Database (in-memory)
- Lombok
- JAXB (pour le support XML)

## Configuration
- **Port** : 8082
- **Base de données** : H2 en mémoire (`jdbc:h2:mem:banque`)
- **Console H2** : http://localhost:8082/h2-console

## Endpoints REST

### GET - Récupérer tous les comptes
- **URL** : `http://localhost:8082/banque/comptes`
- **Méthodes** : JSON et XML
- **Headers** : `Accept: application/json` ou `Accept: application/xml`

### GET - Récupérer un compte par ID
- **URL** : `http://localhost:8082/banque/comptes/{id}`
- **Méthodes** : JSON et XML

### POST - Créer un nouveau compte
- **URL** : `http://localhost:8082/banque/comptes`
- **Méthodes** : JSON et XML
- **Headers** : `Content-Type: application/json` ou `Content-Type: application/xml`

### PUT - Mettre à jour un compte
- **URL** : `http://localhost:8082/banque/comptes/{id}`
- **Méthodes** : JSON et XML

### DELETE - Supprimer un compte
- **URL** : `http://localhost:8082/banque/comptes/{id}`
- **Méthodes** : JSON et XML

## Démarrage de l'application

```bash
mvn spring-boot:run
```

Ou avec le wrapper Maven :
```bash
.\mvnw.cmd spring-boot:run
```

## Structure du projet

```
JAXRS/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ma/ws/jaxrs/jaxrs/
│   │   │       ├── entities/
│   │   │       │   ├── Compte.java
│   │   │       │   └── TypeCompte.java
│   │   │       ├── repositories/
│   │   │       │   └── CompteRepository.java
│   │   │       ├── controllers/
│   │   │       │   └── CompteRestJaxRSAPI.java
│   │   │       ├── config/
│   │   │       │   └── MyConfig.java
│   │   │       └── JaxrsApplication.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
└── pom.xml
```

## Initialisation des données

Au démarrage, l'application crée automatiquement 3 comptes de test :
- 1 compte ÉPARGNE
- 1 compte COURANT
- 1 compte ÉPARGNE

Les comptes sont affichés dans la console au démarrage.

