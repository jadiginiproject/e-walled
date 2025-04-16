# 💸 E-Wallet Application - JADI-GINI-TEAM

## 👥 Team Members
- Aldin
- Alviona
- Julia
- Sayyidan

## 📘 Project Overview
The **E-Wallet** is a backend API application designed to manage digital wallet operations such as user authentication, balance top-up, transfers, and transaction tracking. Built using **Java Spring Boot**, the system provides RESTful endpoints for core financial features in a secure and efficient way.

---

## 🛠 Technologies Used
- **Java Spring Boot** – RESTful API framework
- **Maven** – Build tool and dependency management
- **JSON** – Request and response format
- **Dummy Data** – For testing (hardcoded responses, no DB integration yet)

---

## 📡 API Endpoints

### 🔐 Auth Page

#### POST `/api/login`
Login user with email and password.

**Request Body:**
```json
{
  "email": "vionaCoreBanking@IDG.com",
  "password": "123"
}
```

**Success Response:**
```json
{
  "message": "success",
  "token": "dsarqweqdsa"
}
```

**Failed Response:**
```json
{
  "message": "Email or Password Incorrect",
  "token": null
}
```

---

#### POST `/api/register`
Register a new user.

**Request Body:**
```json
{
  "name": "Julia",
  "email": "julia@gmail.com",
  "password": "mypassword"
}
```

**Response:**
```json
{
  "message": "success"
}
```

---

#### POST `/api/logout`
Logs out the user.

**Response:**
```json
{
  "message": "Logout successful"
}
```

---

### 🧾 Dashboard Page

#### GET `/users/1`
Get user profile information.

**Response:**
```json
{
  "name": "aldin",
  "email": "aldin@gmail.com",
  "profileImg": "img.jpg",
  "message": "success"
}
```

---

#### GET `/accounts/1`
Get account details.

**Response:**
```json
{
  "accountNumber": "AN00001",
  "balance": 1000000000,
  "message": "success"
}
```

---

#### GET `/transactions/1`
Get list of user transactions.

**Response:**
```json
[
  {
    "date": "16/2/2025",
    "type": "transfer",
    "fromTo": "admin",
    "desc": "thr",
    "amount": 10000000
  },
  {
    "date": "10/2/2025",
    "type": "top up",
    "fromTo": "bsi",
    "desc": "gaji",
    "amount": 50000000
  }
]
```

---

### 💰 Top-Up Page

#### GET `/api/topup-sources`
List available top-up sources.

**Response:**
```json
{
  "status": "success",
  "sources": [
    { "source": "BCA" },
    { "source": "BSI" },
    { "source": "Credit Card" },
    { "source": "BRI" },
    { "source": "Mandiri" }
  ]
}
```

---

#### POST `/api/topup`
Create a top-up request.

**Request Body:**
```json
{
  "amount": 1000,
  "from": "BCA",
  "notes": "Top up request"
}
```

**Response:**
```json
{
  "message": "Topup successful",
  "amount": 1000,
  "from": "BCA",
  "notes": "Top up request"
}
```

---

### 🔄 Transfer Page

#### GET `/account/:id`
Get detail of all accounts (example data only).

**Response:**
```json
[
  {
    "id": 1,
    "account_number": "1245021",
    "active": true,
    "balance": 75000,
    "message": "success"
  },
  {
    "id": 2,
    "account_number": "16130204",
    "active": true,
    "balance": 35000,
    "message": "success"
  }
]
```

---

#### POST `/transfer`
Send money from one account to another.

**Request Body:**
```json
{
  "source_account": "1245021",
  "destination_account": "16130204",
  "amount": 5000
}
```

**Response:**
```json
{
  "message": "Transfer successful",
  "transaction_id": "TX87654321",
  "balance_after": 7250000
}
```

---

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/your-repository-url.git
   ```

2. Navigate to the project folder:
   ```bash
   cd e-wallet-api
   ```

3. Install dependencies:
   ```bash
   mvn install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

App will be available at: `http://localhost:8080`

---

## 🤝 Contributing

Pull requests are welcome. Please fork the repo and submit your changes through a PR with a clear message and documentation.

---

## 📄 License

This project is licensed under the [MIT License](LICENSE).

---

Happy Coding! 🚀
```

Let me know if you want me to help generate this into a real markdown file or make it available as a downloadable `.md` file!
