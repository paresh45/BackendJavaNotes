# Low-Level Design (LLD) Questions

### 1. Parking Lot System
**Requirements:**
- Multiple parking levels with spots for bikes, cars, and trucks.
- Features: Park/unpark vehicles, find nearest spot, calculate parking charges.

**Key Considerations:**
- Class hierarchy for `Vehicle` (e.g., `Car`, `Truck`).
- Spot allocation and level management.
- Use **Strategy Pattern** for parking charges and **Factory Pattern** for vehicle creation.

---

### 2. Elevator System
**Requirements:**
- Manage multiple elevators in a building with N floors.
- Features: Request elevator, handle movement, and allocate nearest elevator.

**Key Considerations:**
- Classes for `Elevator`, `Request`, and `Floor`.
- Use **Singleton** for a central control system and **Observer** for state updates.

---

### 3. Online Bookstore
**Requirements:**
- Users can search books, add to cart, and make purchases.
- Admins can manage books and inventory.

**Key Considerations:**
- Classes for `User`, `Book`, `Cart`, `Order`, and `Payment`.
- Implement search functionality and payment integration.
- Use **Builder** for complex `Order` creation and **Strategy** for payment.

---

### 4. Ride-Sharing Service (e.g., Uber, Ola)
**Requirements:**
- Riders book rides; drivers accept/reject.
- Features: Ride matching, fare calculation, and trip tracking.

**Key Considerations:**
- Classes for `Rider`, `Driver`, `Ride`, `Vehicle`, and `Location`.
- Use **Observer** for ride notifications and **Strategy** for fare calculation.

---

### 5. Chess Game
**Requirements:**
- Two players, a board with 64 squares, and pieces with specific movements.
- Features: Validate moves, checkmate detection, turn management.

**Key Considerations:**
- Classes for `Board`, `Piece`, `Player`, and `Move`.
- Use **Factory** for piece creation and **State Pattern** for game status.

---

### 6. Library Management System
**Requirements:**
- Borrow/return books, search by title/author, and manage memberships.
- Features: Late return penalties and due-date reminders.

**Key Considerations:**
- Classes for `Book`, `User`, `Membership`, and `Transaction`.
- Use **Observer** for reminders and **Singleton** for catalog management.

---

### 7. Food Delivery System (e.g., Swiggy, Zomato)
**Requirements:**
- Users can browse restaurants, place orders, and track deliveries.
- Features: Real-time tracking, payments, and order history.

**Key Considerations:**
- Classes for `User`, `Restaurant`, `Order`, and `DeliveryPerson`.
- Use **Observer** for order updates and **Strategy** for payments.

---

### 8. Hotel Booking System
**Requirements:**
- Search hotels, view availability, and make bookings.
- Features: Room categorization, discounts, and cancellations.

**Key Considerations:**
- Classes for `Hotel`, `Room`, `Booking`, and `User`.
- Use **Factory** for room creation and **Singleton** for managing availability.

---

### 9. ATM System
**Requirements:**
- Users can withdraw money, check balances, and change PINs.
- Features: Cash availability, transaction limits, and error handling.

**Key Considerations:**
- Classes for `ATM`, `User`, `Card`, `Transaction`, and `CashDispenser`.
- Use **State Pattern** for ATM states and **Singleton** for operation management.

---

### 10. Social Media Platform (e.g., Twitter, Instagram)
**Requirements:**
- Users can post content, follow others, and like/comment on posts.
- Features: Feed generation, notifications, and moderation.

**Key Considerations:**
- Classes for `User`, `Post`, `Comment`, `Like`, and `Notification`.
- Use **Observer** for notifications and **Factory** for post types (text, image, video).

---

### 11. URL Shortener (e.g., Bitly)
**Requirements:**
- Convert long URLs into short ones and track analytics.

**Key Considerations:**
- Classes for `URLMapping`, `User`, and `Analytics`.
- Use hashing/base62 for unique short URLs and cache frequently accessed ones.

---

### 12. Movie Ticket Booking System (e.g., BookMyShow)
**Requirements:**
- Users can search movies, view seat availability, and book tickets.

**Key Considerations:**
- Classes for `User`, `Movie`, `Theater`, `Screen`, and `Booking`.
- Handle seat locking and concurrency issues.

---

### 13. Online Shopping System (e.g., Amazon)
**Requirements:**
- Browse products, manage carts, place orders, and track shipments.

**Key Considerations:**
- Classes for `Product`, `Cart`, `Order`, and `User`.
- Use **Composite** for cart items and **Strategy** for payments.

---

### 14. Splitwise-like Expense Sharing System
**Requirements:**
- Track group expenses and settle debts.

**Key Considerations:**
- Classes for `User`, `Expense`, `Group`, and `Transaction`.
- Use **Observer** for notifications and **Strategy** for splitting logic.

---

### 15. Calendar and Scheduling System (e.g., Google Calendar)
**Requirements:**
- Create, update, and delete events with reminders and conflict management.

**Key Considerations:**
- Classes for `User`, `Event`, `Reminder`, and `Calendar`.
- Use **Observer** for reminders and handle recurring events.

---

### Tips for LLD Design:
1. **Clarify Requirements**: Understand constraints and use cases.
2. **Identify Core Classes**: Define entities and their relationships.
3. **Apply Design Patterns**: Ensure modularity, scalability, and reusability.
4. **Handle Edge Cases**: Account for failures and scalability.
5. **Visualize Relationships**: Use class/sequence diagrams for clarity.

---

Feel free to deep dive into any of these for detailed discussions or code implementations!
