# OCC Clone Prototipo

Este proyecto es un prototipo de OCC, utilizando Spring Boot y JPA. El sistema permite gestionar: 
- usuarios
- roles
- publicaciones
- procesos de selección
- favoritos
- registros
- sessiones
- historial de actividades
- CV
- experiencia
- educación
- habilidades

## Requisitos

- JDK 17 o superior
- Maven 3.6.0 o superior
- MySQL 8.0 o superior

Actualiza el archivo `application.properties` con las credenciales de tu base de datos MySQL
```properties
# DataSource settings
spring.datasource.url=jdbc:mysql://localhost:3306/occ?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Hibernate settings
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

# Logging settings
logging.level.org.hibernate.SQL=DEBUG
logging.level.org.hibernate.type.descriptor.sql.BasicBinder=TRACE
```

## Estructura del prototipo
```plaintext
src/main/java/com/lastsys/hexagonal/occ_clone
├── application
│   ├── services
│   └── usecases
├── domain
│   ├── models
│   └── ports
├── infrastructure
│   ├── adapters
│   ├── config
│   ├── controllers
│   ├── entities
│   └── repositories
└── OccCloneApplication.java
src/main/resources
```
