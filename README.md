# REST API for Match Management with Odds
## Overview
This is a Spring Boot-based REST API for managing sports matches and their odds. 
It includes CRUD operations for Match and MatchOdds entities, integrates with PostgreSQL, and uses Docker for containerization.
## Features
- Manage Match entities with details like description, date, time, teams, and sport type.
- Manage MatchOdds entities linked to a Match.
- Full CRUD operations with REST endpoints.
- PostgreSQL as the database.
- Docker support for containerized deployment.
## Technologies Used
- **Java 17**
- **Spring Boot 3.x**
- **PostgreSQL 15**
- **Spring Data JPA**
- **Lombok**
- **Maven**
- **Docker & Docker Compose**

### REST API Endpoints

#### Match API
| HTTP Method | Endpoint            | Description                |
|-------------|---------------------|----------------------------|
| GET         | `/api/matches`      | Get all matches            |
| POST        | `/api/matches`      | Create a new match         |
| PUT         | `/api/matches/{id}` | Update an existing match   |
| DELETE      | `/api/matches/{id}` | Delete a match by ID       |

#### MatchOdds API
| HTTP Method | Endpoint               | Description                |
|-------------|------------------------|----------------------------|
| GET         | `/api/match-odds`      | Get all odds               |
| POST        | `/api/match-odds`      | Create new odds            |
| PUT         | `/api/match-odds/{id}` | Update existing odds       |
| DELETE      | `/api/match-odds/{id}` | Delete odds by ID          |

## Build the Application
`mvn clean package`
## Run with Docker
Build and start the application and database containers: `docker-compose up --build`
