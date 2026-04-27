```mermaid
classDiagram

class User {
  -id : String
  -name : String
  -email : String
}

class Account {
  -creditBalance : double
  +addCredit(amount)
  +deductCredit(amount)
}

class Subscription {
  -startDate : Date
  -endDate : Date
  -status : String
  +isActive() : boolean
}

class Film {
  -id : String
  -title : String
  -isAvailable : boolean
  -rentalCreditCost : double
  -purchasePrice : double
}

class Rental {
  -id : String
  -rentalDate : Date
  -creditUsed : double
}

class Purchase {
  -id : String
  -purchaseDate : Date
  -price : double
}

class CreditTransaction {
  -id : String
  -amount : double
  -type : String
  -date : Date
}

class FilmRequest {
  -id : String
  -requestDate : Date
  -status : String
}

User "1" --> "1" Account
User "1" --> "0..1" Subscription

User "1" --> "0..*" Rental
User "1" --> "0..*" Purchase
User "1" --> "0..*" CreditTransaction
User "1" --> "0..*" FilmRequest

Rental "0..*" --> "1" Film
Purchase "0..*" --> "1" Film
FilmRequest "0..*" --> "1" Film

Subscription ..> User : activates access
Rental ..> Account : deducts credit
CreditTransaction ..> Account : updates balance
