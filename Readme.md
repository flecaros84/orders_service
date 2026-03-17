# Orders Service

API REST desarrollada con Spring Boot para la gestión de órdenes.

Repositorio:  
`https://github.com/flecaros84/orders_service`

Despliegue en Render:  
`https://orders-service-4.onrender.com/api/v1/ordenes`

## Descripción

Este proyecto implementa un microservicio de órdenes que permite:

- Crear una orden
- Listar todas las órdenes
- Consultar una orden por su ID

Cada orden puede incluir una lista de ítems asociados.

## Endpoints disponibles

### Crear una orden
**POST** `/api/v1/ordenes`

#### Ejemplo de body
```json
{
  "customerName": "Juan Pérez",
  "status": "PENDIENTE",
  "total": 25990.0,
  "items": [
    {
      "productId": 1,
      "quantity": 2,
      "price": 9990.0
    },
    {
      "productId": 2,
      "quantity": 1,
      "price": 6010.0
    }
  ]
}
````

### Obtener todas las órdenes

**GET** `/api/v1/ordenes`

### Obtener una orden por ID

**GET** `/api/v1/ordenes/{id}`

#### Ejemplo

```http
GET /api/v1/ordenes/1
```

## Modelo de datos

### Orden

* `id`
* `customerName`
* `status`
* `total`
* `items`

### OrdenItem

* `id`
* `productId`
* `quantity`
* `price`

## Tecnologías utilizadas

* Java 17
* Spring Boot
* Spring Web
* Spring Data JPA
* Lombok
* Maven
* Docker
* Render
* MySQL / MariaDB

## Ejecución local

### Clonar el repositorio

```bash
git clone https://github.com/flecaros84/orders_service.git
cd orders_service
```

### Configurar la base de datos

Edita tu archivo `application.properties` con tus credenciales locales.

Ejemplo:

```properties
spring.application.name=orders-service

spring.datasource.url=jdbc:mysql://localhost:3306/ordersdb
spring.datasource.username=root
spring.datasource.password=tu_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

### Ejecutar el proyecto

Con Maven Wrapper:

```bash
./mvnw spring-boot:run
```

En Windows:

```bash
mvnw.cmd spring-boot:run
```

## Pruebas en producción

### Listar órdenes

```http
GET https://orders-service-4.onrender.com/api/v1/ordenes
```

### Buscar una orden por ID

```http
GET https://orders-service-4.onrender.com/api/v1/ordenes/1
```

### Crear una orden

```http
POST https://orders-service-4.onrender.com/api/v1/ordenes
Content-Type: application/json
```

## Estructura general del proyecto

* `src/` → código fuente
* `.mvn/` → configuración de Maven Wrapper
* `mvnw` y `mvnw.cmd` → ejecución Maven sin instalación global
* `pom.xml` → dependencias y configuración del proyecto
* `Dockerfile` → contenedor para despliegue
* `.dockerignore` y `.gitignore` → exclusiones del proyecto

## Autor

Desarrollado por **Fabián Lecaros**.