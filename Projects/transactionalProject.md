# Transaction-Based Low-Level Design (LLD) Scenarios

## 1. Bank Transaction System
### Requirements:
- Users can transfer money between accounts, view transaction history, and check balances.
- **Features**: Overdraft handling, transaction limits, and multi-currency support.

### Key Considerations:
- **Classes**:
    - `User`: Contains user details and linked accounts.
    - `Account`: Handles account balance and type (savings, current).
    - `Transaction`: Represents individual transactions (e.g., transfer, deposit, withdrawal).
    - `Bank`: Manages accounts and transactions.
- **Patterns**:
    - **State Pattern** for account states (active, dormant, overdrawn).
    - **Singleton** for managing bank operations.
- **Challenges**:
    - Handle concurrency for simultaneous transactions.
    - Ensure atomicity and consistency of transactions.

---

## 2. E-Wallet System
### Requirements:
- Users can load money, transfer to other wallets, and pay merchants.
- **Features**: Transaction history, rewards, and limits based on user KYC.

### Key Considerations:
- **Classes**:
    - `User`: Manages wallet and KYC status.
    - `Wallet`: Tracks available balance and linked payment methods.
    - `Transaction`: Stores transaction details (amount, type, timestamp).
    - `Merchant`: Represents businesses accepting wallet payments.
- **Patterns**:
    - **Observer Pattern** for notifying users of transaction status.
    - **Strategy Pattern** for reward calculations.
- **Challenges**:
    - Secure handling of sensitive payment data.
    - Scalability for high transaction volumes.

---

## 3. Payment Gateway System
### Requirements:
- Integrate with multiple payment methods (credit card, UPI, wallets).
- **Features**: Fraud detection, transaction retries, and settlement reports.

### Key Considerations:
- **Classes**:
    - `Payment`: Handles the details of a payment (amount, currency, status).
    - `Transaction`: Logs individual payment attempts.
    - `PaymentMethod`: Abstract class for payment types (e.g., card, UPI).
    - `FraudDetector`: Monitors and flags suspicious transactions.
- **Patterns**:
    - **Strategy Pattern** for implementing various payment methods.
    - **Observer Pattern** for real-time fraud alerts.
- **Challenges**:
    - Ensure idempotency to avoid duplicate payments.
    - Handle cross-border transactions with currency conversion.

---

## 4. Splitwise-like Expense Sharing System
### Requirements:
- Users can create groups, add expenses, and track balances with others.
- **Features**: Split expenses equally or unequally, settle debts.

### Key Considerations:
- **Classes**:
    - `User`: Represents a participant in the system.
    - `Group`: Contains users and shared expenses.
    - `Expense`: Records details of the expense (amount, payer, and participants).
    - `Transaction`: Represents debt settlements between users.
- **Patterns**:
    - **Strategy Pattern** for splitting logic (equal, percentage, exact).
    - **Observer Pattern** to notify users of updates.
- **Challenges**:
    - Efficiently calculate balances in large groups.
    - Ensure all group members see consistent updates.

---

## 5. Stock Trading Platform
### Requirements:
- Users can buy, sell, and view stock transactions.
- **Features**: Real-time stock updates, trade history, and portfolio management.

### Key Considerations:
- **Classes**:
    - `User`: Tracks portfolio and trading preferences.
    - `Stock`: Represents individual stock details (price, volume).
    - `Order`: Contains trade details (buy/sell, quantity, price).
    - `Transaction`: Logs completed trades.
    - `Portfolio`: Summarizes user's holdings and valuations.
- **Patterns**:
    - **Observer Pattern** for real-time stock price updates.
    - **Strategy Pattern** for implementing different order types (limit, market).
- **Challenges**:
    - Handle high transaction volume during market peaks.
    - Ensure consistent portfolio updates across multiple trades.

---

## 6. Cryptocurrency Exchange
### Requirements:
- Users can buy, sell, and trade cryptocurrencies.
- **Features**: Wallet management, transaction history, and real-time price tracking.

### Key Considerations:
- **Classes**:
    - `User`: Holds wallet and transaction history.
    - `Wallet`: Manages cryptocurrency balances.
    - `Transaction`: Logs trades and transfers.
    - `Order`: Represents buy/sell orders with type and limits.
    - `Crypto`: Represents details of a cryptocurrency (symbol, price).
- **Patterns**:
    - **Observer Pattern** for price updates and notifications.
    - **Factory Pattern** for creating orders (limit, stop-loss).
- **Challenges**:
    - Handle volatile price fluctuations in real time.
    - Ensure secure wallet storage using encryption.

---

## 7. Online Shopping Payment System
### Requirements:
- Handle checkout transactions, including multiple payment methods.
- **Features**: Split payments (e.g., wallet + card), refunds, and EMI options.

### Key Considerations:
- **Classes**:
    - `User`: Tracks orders and saved payment methods.
    - `Order`: Represents items, total cost, and status.
    - `Transaction`: Records payment details for an order.
    - `PaymentMethod`: Abstract class for handling specific payment logic.
- **Patterns**:
    - **Strategy Pattern** for payment methods (credit card, wallet, etc.).
    - **Observer Pattern** for updating order status post-payment.
- **Challenges**:
    - Ensure smooth handling of partial payments and refunds.
    - Implement fraud detection for high-value transactions.

---

## 8. Loan Management System
### Requirements:
- Users can apply for loans, make payments, and view balances.
- **Features**: EMI calculation, loan approval workflow, and penalty handling.

### Key Considerations:
- **Classes**:
    - `User`: Represents the borrower.
    - `Loan`: Contains loan details (principal, interest rate, tenure).
    - `Transaction`: Logs EMI payments and penalties.
    - `PaymentSchedule`: Tracks due dates and remaining balance.
- **Patterns**:
    - **Factory Pattern** for creating different loan types (home, personal, car).
    - **Observer Pattern** for sending reminders.
- **Challenges**:
    - Accurately calculate penalties for late payments.
    - Handle pre-payments and adjust schedules dynamically.

---

## General Transaction System Design Tips
1. **Ensure ACID Compliance**: Transactions should be atomic, consistent, isolated, and durable.
2. **Concurrency Handling**: Use locks or queues to avoid race conditions.
3. **Design for Scalability**: Optimize for high transaction volumes and rapid user growth.
4. **Audit Trails**: Maintain detailed logs for debugging and compliance.
5. **Use Design Patterns**:
    - **Observer** for notifications.
    - **Factory** for creating transaction objects.
    - **Strategy** for implementing transaction-specific rules (e.g., splitting logic).
