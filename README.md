🚗 Vehicle and Dealer Management System (Backend API)

A Spring Boot REST API for managing dealers and their associated vehicles.
This project demonstrates Spring Boot, Spring Security, Spring Data JPA, Hibernate, MySQL, JWT authentication, and Swagger API documentation.

✨ Features
🔹 Dealer Management

Create, update, delete, and fetch dealers

Assign vehicles to dealers

🔹 Vehicle Management

Add, update, delete, and fetch vehicles

Link vehicles to dealers

Fetch vehicles from premium dealers

🔹 Authentication

User signup & login with JWT token

Role-based access (future enhancement)

🔹 API Documentation

Integrated Swagger UI for API exploration and testing

JWT Authorize 🔑 button enabled in Swagger

🛠 Tech Stack

Backend: Spring Boot, Spring Security, Spring Data JPA, Hibernate

Database: MySQL / PostgreSQL (configurable)

Authentication: JWT (JSON Web Token)

API Documentation: Swagger / OpenAPI

Build Tool: Maven

⚙️ Installation & Setup
1️⃣ Clone the Repository
git clone https://github.com/your-username/vehicle-dealer-management.git
cd vehicle-dealer-management

2️⃣ Configure Database

Update your application.properties (or application.yml) with DB credentials:

spring.datasource.url=jdbc:mysql://localhost:3306/vehicle_dealer_db
spring.datasource.username=your-username
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update

3️⃣ Build & Run the Project
mvn spring-boot:run


The application will start at:
👉 http://localhost:8080

🔑 API Endpoints
Authentication
Method	Endpoint	Description
POST	/api/auth/signup	Register new user
POST	/api/auth/signin	Login (returns JWT)
POST	/api/auth/signout	Logout
Dealer
Method	Endpoint	Description
GET	/api/dealers/all	List all dealers
GET	/api/dealers/{id}	Get dealer by ID
POST	/api/dealers/addDealer	Create dealer
PUT	/api/dealers/{id}	Update dealer
DELETE	/api/dealers/{id}	Delete dealer
Vehicle
Method	Endpoint	Description
GET	/api/vehicles/all	List all vehicles
GET	/api/vehicles/{id}	Get vehicle by ID
POST	/api/vehicles/addVehicle	Add vehicle
PUT	/api/vehicles/{id}	Update vehicle
DELETE	/api/vehicles/{id}	Delete vehicle
GET	/api/vehicles/premium	Fetch vehicles from premium dealers
📖 Swagger API Docs

Once the app is running, you can explore and test APIs using Swagger UI:

👉 http://localhost:8080/swagger-ui/index.html

Use the Authorize 🔑 button to provide your JWT token:

Bearer <your_jwt_token>


After authorization, all secured endpoints can be tested directly from Swagger.

📂 Project Structure
src/
 ├─ main/
 │   ├─ java/com/dvm/...
 │   │   ├─ controller/   → REST Controllers
 │   │   ├─ model/        → Entities (Dealer, Vehicle, User)
 │   │   ├─ repository/   → Spring Data JPA Repos
 │   │   ├─ service/      → Business logic
 │   │   ├─ config/       → Configuration
 │   │   ├─ jwt/          → JWT Utilities
 │   └─ resources/
 │       └─ application.properties

📜 License

This project is licensed under the MIT License.

👨‍💻 Author

Venkata Chaithanya Reddy Vangala
💼 Java Full-Stack Developer | 🌱 Learning React & Spring Boot

<img width="833" height="722" alt="update-vehicle-details" src="https://github.com/user-attachments/assets/5808f7bf-5a11-44c9-94a2-841563f75208" />
<img width="807" height="656" alt="update-dealer" src="https://github.com/user-attachments/assets/60817e89-721c-4468-a521-0808a81607e9" />
<img width="573" height="623" alt="simulation-payment" src="https://github.com/user-attachments/assets/ee941450-6494-4afb-9717-4ee1f07efa56" />
<img width="1117" height="405" alt="signout" src="https://github.com/user-attachments/assets/2cf66e43-6cb8-4eaa-a22f-cbb277c6f7dc" />
<img width="992" height="498" alt="signin" src="https://github.com/user-attachments/assets/a2c2a548-191c-496c-a170-78dde6ed06e1" />
<img width="527" height="291" alt="project-structure" src="https://github.com/user-attachments/assets/31933162-6056-49a5-97cc-206aa0656c71" />
<img width="1131" height="812" alt="fetech-all-dealers" src="https://github.com/user-attachments/assets/43d2c5fd-7fa0-4b18-ab2d-a815368f4da5" />
<img width="1132" height="818" alt="fetch-vehicles-from-premium-dealers" src="https://github.com/user-attachments/assets/75933d57-8462-47ed-9781-e88de867a32e" />
<img width="1122" height="666" alt="fetch-by-vehicle-id" src="https://github.com/user-attachments/assets/213cd6d4-9140-464a-a253-adcfa92574d9" />
<img width="1110" height="610" alt="fetch-by-id" src="https://github.com/user-attachments/assets/ba965a6f-e6f2-42ab-a59f-563769cfaa65" />
<img width="1106" height="821" alt="fetch-all-vehicles" src="https://github.com/user-attachments/assets/1248bccf-ee6c-42c1-931a-6ed23a8f3098" />
<img width="798" height="657" alt="dealer-signup" src="https://github.com/user-attachments/assets/23eda4e4-b44b-43e6-8958-027b4d259867" />
<img width="827" height="778" alt="add-vehicle" src="https://github.com/user-attachments/assets/a56a956b-c31d-4770-8e7f-7b409e2646ff" />


