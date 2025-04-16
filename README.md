# E-Wallet Application - JADI-GINI-TEAM

## Team Members
- Aldin
- Alviona
- Julia
- Sayyidan

## Project Overview
The **E-Wallet** is a simple and secure wallet application that allows users to manage their accounts, perform top-up operations, transfer funds, and view transaction history. This project is built using **Java Spring Boot** for creating the backend API services that power all features of the application.

## Technologies Used
- **Java Spring Boot** - For building RESTful APIs.
- **Database** - For user data and transaction management (e.g., MySQL, PostgreSQL).
- **JWT Authentication** - For secure user authentication.

## API Endpoints

### Auth Page
- **POST /api/auth/login** - User login.  
  _Body:_ `{"username": "user", "password": "password"}`
- **POST /api/auth/register** - User registration.  
  _Body:_ `{"username": "user", "password": "password", "email": "email@example.com"}`
- **POST /api/auth/logout** - User logout.

### Dashboard Page
- **GET /api/dashboard/user-info** - Fetch logged-in user's information (profile, account summary, etc.).
- **GET /api/dashboard/account-detail** - Retrieve detailed account information.
- **GET /api/dashboard/transactions** - Fetch a list of recent transactions for the user.

### Top-Up Page
- **GET /api/topup-sources** - Get available sources for top-up.  
  _Response:_  
  ```json
  {
    "status": "success",
    "sources": [
      {"source": "BCA"},
      {"source": "BSI"},
      {"source": "Credit Card"},
      {"source": "BRI"},
      {"source": "Mandiri"}
    ]
  }
  ```
- **POST /api/topup** - Submit a request to top-up the account.  
  _Body:_  
  ```json
  {
    "amount": 1000,
    "from": "BCA",
    "notes": "Top up request"
  }
  ```
  _Response:_  
  ```json
  {
    "message": "Topup successful",
    "amount": 1000,
    "from": "BCA",
    "notes": "Top up request"
  }
  ```

### Transfer Page
- **GET /account/:id** - Retrieve account details for making a transfer.  
  _Response:_  
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
- **POST /transfer** - Submit a transfer request to update balance.  
  _Body:_  
  ```json
  {
    "source_account": "1245021",
    "destination_account": "16130204",
    "amount": 5000
  }
  ```
  _Response:_  
  ```json
  {
    "message": "Transfer successful",
    "transaction_id": "TX87654321",
    "balance_after": 7250000
  }
  ```

## Running the Application

1. Clone the repository:
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

The server should now be running on `http://localhost:8080`.

## Contributing

Feel free to fork the project and submit pull requests for any features, bug fixes, or improvements. Please make sure to follow the coding standards and write clear commit messages.

## License

This project is open source and available under the [MIT License](LICENSE).
```

This README now includes the Top-Up and Transfer page details based on the code you provided. Let me know if you'd like any adjustments!