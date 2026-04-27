# 🐾 Zoo Management System (Polymorphism)

## 📊 UML Diagram

```mermaid
classDiagram

class Animal {
  - speciesName : String
  - weight : double
  - age : int
  + getDosage()
  + getFeedSchedule()
}

class HorseGroup {
  + getDosage()
  + getFeedSchedule()
}

class FelineGroup {
  + getDosage()
  + getFeedSchedule()
}

class RodentGroup {
  + getDosage()
  + getFeedSchedule()
}

Animal <|-- HorseGroup
Animal <|-- FelineGroup
Animal <|-- RodentGroup
