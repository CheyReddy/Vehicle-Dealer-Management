# 🚗 Vehicle and Dealer Management System (Backend API)

A **Spring Boot REST API** for managing **dealers** and their associated **vehicles**.  
This project demonstrates **Spring Boot, Spring Data JPA, Hibernate, MySQL, and JWT authentication**.

---

## 📌 Features

### Dealer Management
- Create, update, delete, and fetch dealers
- Assign vehicles to dealers

### Vehicle Management
- Add, update, delete, and fetch vehicles
- Link vehicles to dealers

### Authentication
- User signup & login with JWT token
- Role-based access (future enhancement)
---

## 🛠️ Tech Stack
- **Backend:** Spring Boot, Spring Security, Spring Data JPA, Hibernate  
- **Database:** MySQL / PostgreSQL (configurable)  
- **Authentication:** JWT (JSON Web Token)  
- **Build Tool:** Maven  
---

## ⚙️ Installation & Setup
### 1. Clone the Repository 
bash
- git clone https://github.com/your-username/vehicle-dealer-management.git
- cd vehicle-dealer-management
### 2. Configure Database
### 3. Build & Run the Project

App will start on:
👉 http://localhost:8080

🔑 API Endpoints
Authentication

POST /api/auth/signup → Register new user
POST /api/auth/signin → Login (returns JWT token)
POST /api/auth/signout → Logout

Dealer
GET /api/dealers/all → List all dealers
GET /api/dealers/{id} → Get dealer by ID
POST /api/dealers/addDealer → Create dealer
PUT /api/dealers/{id} → Update dealer
DELETE /api/dealers/{id} → Delete dealer

Vehicle
GET /api/vehicles/all → List all vehicles
GET /api/vehicles/{id} → Get vehicle by ID
POST /api/vehicles/addVehicle → Add vehicle
PUT /api/vehicles/{id} → Update vehicle
DELETE /api/vehicles/{id} → Delete vehicle
GET /api/vehicles/premium → Fetch Vehicles from Premium Dealers only

src/
 ├─ main/
 │   ├─ java/com/dvm/...
 │   │   ├─ controller/   → REST Controllers
 │   │   ├─ model/        → Entities (Dealer, Vehicle, User)
 │   │   ├─ repository/   → Spring Data JPA Repos
 │   │   ├─ service/      → Business logic
 |   |   ├─ config/       → Configuration
 |   |   ├─ jwt/          → JWT
 │   └─ resources/
 │       └─ application.properties

📜 License

This project is licensed under the MIT License.
👨‍💻 Author

Venkata Chaithanya Reddy Vangala
💼 Java Full-Stack Developer | 🌱 Learning React & Spring Boot
