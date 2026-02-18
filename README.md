# Product REST API - E-Commerce Microservice

A Spring Boot REST API microservice for managing e-commerce products with full CRUD operations and search capabilities.

## 📋 Features

- ✅ **View All Products** - Retrieve complete product catalog
- ✅ **Add Product** - Create new products with detailed information
- ✅ **Update Product** - Modify existing product details
- ✅ **Delete Product** - Remove products from inventory
- ✅ **Search by Category** - Filter products by category
- ✅ **Find by Brand** - Search products by brand name

## 🛠️ Technologies

- **Java 17**
- **Spring Boot 4.0.2**
- **Spring Data JPA**
- **PostgreSQL Database**
- **Maven**
- **postman**

## 🚀 Getting Started

### Prerequisites

- Java 17 or higher
- PostgreSQL database
- Maven

### Database Configuration

Update `src/main/resources/application.properties` with your PostgreSQL credentials:

```properties
spring.datasource.url=jdbc:postgresql://localhost:8080/ecommerce_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
```

### Running the Application

```bash
# Navigate to project directory
cd restfullApiAssignment

# Run using Maven
mvn spring-boot:run

# Or build and run the JAR
mvn clean package
java -jar target/restfullApiAssignment-0.0.1-SNAPSHOT.jar
```

The API will be available at: `http://localhost:8080/api/products`

## 📖 API Endpoints

### 1. View All Products

**GET** `/api/products`

Retrieves all products from the database.

**Response:**

![View All Products](screenshot/Get.png)

---

### 2. Add New Product

**POST** `/api/products/addProduct`

**Content-Type:** `application/json`

**Responses:**
- `200 OK` - Product added successfully
- `409 CONFLICT` - Product already exists

![Add Product](screenshot/post.png)

---

### 3. Update Product

**PUT** `/api/products/updateProduct/{id}`

**Content-Type:** `application/json`

**Path Variable:**
- `id` - Product ID to update

**Request Body:**

![Update Product](screenshot/PUT.png)

**Responses:**
- `200 OK` - Product updated successfully
- `404 NOT FOUND` - Product not found

### 4. Delete Product

**DELETE** `/api/products/deleteProduct/{id}`

**Path Variable:**
- `id` - Product ID to delete

**Responses:**
- `200 OK` - Product deleted successfully
- `404 NOT FOUND` - Product not found

![Delete Product](screenshot/delete.png)

### 5. Search by Category

**GET** `/api/products/search?category={category}`

**Query Parameter:**
- `category` - Product category to search

**Responses:**
- `200 OK` - Returns list of products in category
- `404 NOT FOUND` - No products found in this category

![Search by Category](screenshot/search%20category.png)

### 6. Find by Brand

**GET** `/api/products/findByBrand?brand={brand}`

**Query Parameter:**
- `brand` - Brand name to search

**Example:**
```
GET /api/products/findByBrand?brand=Logitech
```

**Responses:**
- `200 OK` - Returns list of products by brand
- `404 NOT FOUND` - No products found for this brand

![Find by Brand](screenshot/findbybrand%20.png)

**The view in browser**

![View in Browser](screenshot/the%20view%20in%20browser.png)

**The view in postman**

![View in Postman](screenshot/the%20view%20in%20postman.png)

## 📁 Project Structure

restfullApiAssignment/
├── src/
│   └── main/
│       ├── java/auca/ac/rw/restfullApiAssignment/
│       │   ├── controller/       # REST controllers
│       │   ├── service/          # Business logic
│       │   ├── repository/       # Data access layer
│       │   ├── modal/ecommerce/  # Entity models
│       │   └── RestfullApiAssignmentApplication.java
│       └── resources/
│           └── application.properties
├── pom.xml
└── screenshot/          

## 🔧 HTTP Status Codes

| Code | Description |
|------|-------------|
| 200 | OK - Request successful |
| 201 | Created - Resource created |
| 404 | Not Found - Resource not found |
| 409 | Conflict - Resource already exists |
| 500 | Internal Server Error |

## 👨‍💻 Author

**Tumayine Desire 26588**

## 📄 License

This project is created for educational purposes.
