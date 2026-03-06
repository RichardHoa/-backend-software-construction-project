# Backend Software Construction Project

This is the backend service for the [Software Construction Project](https://github.com/hangma230142/software-construction-project). It is built with **Java 21** and **Spring Boot 4.0.3**, utilizing **Spring Data JDBC** for a lightweight, "no-magic" database layer and **Flyway** for schema migrations.

---

## Prerequisites

* **Java 21** or higher.
* **Docker** and **Docker Compose**.
* **Maven** (or use the included `./mvnw` wrapper).

---

## Setup & Installation

### Clone the project
```bash
git clone https://github.com/RichardHoa/-backend-software-construction-project
```

### Configure Git
Set up the project's commit template to ensure consistent messaging:
```bash
git config commit.template .gitmessage
```

### Start the database
```bash
docker compose up -d
```

### Run the program
```bash
./mvnw spring-boot:run
```

## Testing

### Run the test
```bash
./mvnw test
```
