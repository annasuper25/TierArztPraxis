# Tierarztpraxis – Spring Boot REST API

Dies ist eine einfache REST-API für eine Tierarztpraxis, entwickelt mit **Spring Boot**, **Spring Data JPA**, **Hibernate** und **PostgreSQL**.  
Die API ermöglicht das Verwalten von Tierbesitzern (*Owners*) und ihren Tieren (*Pets*).

---

## 🚀 Technologien

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven

---

## 🌐 REST API Dokumentation

### ▶ **Owner API**

#### **GET /owners**
Gibt eine Liste aller Besitzer zurück.

**Antwort-Beispiel:**
```json
[
  {
    "id": 1,
    "name": "Anna Müller",
    "email": "anna@example.com",
    "phone": "123456789"
  }
]
```
---

**GET /owners/{id}**

Gibt einen bestimmten Besitzer anhand seiner ID zurück.

**POST /owners**

Erstellt einen neuen Owner.

Request Body:
```json
{
  "name": "Anna Müller",
  "email": "anna@example.com",
  "phone": "123456789"
}
```

**PUT /owners/{id}**

Aktualisiert einen bestehenden Owner.

**DELETE /owners/{id}**

Löscht einen Owner anhand der ID.

### 🐾 **Pet API**
**GET /pets**

Gibt alle Tiere zurück.

**GET /pets/{id}**

Gibt ein bestimmtes Tier anhand der ID zurück.

**POST /pets**

Erstellt ein neues Tier.

Request Body Beispiel:
```json
{
  "owner": { "id": 1 },
  "name": "Luna",
  "animalType": "Hund",
  "breed": "Golden Retriever",
  "age": 3,
  "vaccinations": "Tollwut, Parvovirose"
}
```

**PUT /pets/{id}**

Aktualisiert ein bestehendes Tier.

**DELETE /pets/{id}** 

Löscht ein Tier anhand der ID.

###  **Anwendung starten**
**mvn spring-boot:run**


Die API läuft anschließend unter:

http://localhost:8080


### 📌 **Beispiele für Requests (z. B. mit Postman)**

Besitzer abrufen:
GET http://localhost:8080/owners/1

Tier erstellen:
POST http://localhost:8080/pets

+ Request Body:
```json
{
"owner": { "id": 1 },
"name": "Maria",
"animalType": "Hund",
"breed": "Golden Retriever",
"age": 7,
"vaccinations": "Tollwut, Parvovirose"
}
```