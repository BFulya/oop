```mermaid 
ClassDiagram

class Airline {
  - id : String
  - name : String
}

class Aircraft {
  - id : String
  - status : String
}

class AircraftType {
  - typeName : String
  - requiredPilotCount : int
}

class Flight {
  - id : String
  - departureTime : DateTime
  - arrivalTime : DateTime
}

class Airport {
  - id : String
  - name : String
}

class Pilot {
  - id : String
  - name : String
  - experienceLevel : String
}

%% Relationships

Airline "1" --> "*" Aircraft : owns
Airline "1" --> "*" Pilot : employs

Aircraft "*" --> "1" AircraftType : has

Flight "*" --> "1" Airline : operated by
Flight "*" --> "1" Aircraft : uses

Flight "1" --> "1" Pilot : pilot
Flight "1" --> "1" Pilot : co-pilot

Flight "*" --> "1" Airport : departure
Flight "*" --> "1" Airport : arrival
