```mermaid 
classDiagram

class Building {
  - floors : List<Floor>
  - elevators : List<Elevator>
}

class Floor {
  - level : int
  - doors : List<ElevatorDoor>
  - callPanels : List<CallPanel>
  + requestElevator(direction: Direction)
}

class Elevator {
  - id : int
  - capacity : int
  - currentFloor : int
  - direction : Direction
  - state : ElevatorState
  - door : ElevatorDoor
  - panel : ControlPanel
  + move()
  + stop()
  + openDoor()
  + closeDoor()
}

class ElevatorDoor {
  - isOpen : boolean
  + open()
  + close()
}

class ControlPanel {
  - buttons : List<Button>
  - indicator : IndicatorLight
  + selectFloor(floor: int)
}

class IndicatorLight {
  - currentFloor : int
  - direction : Direction
  + update()
}

class Button {
  <<abstract>>
  + press()
}

class CallButton {
  - direction : Direction
  + press()
}

class FloorButton {
  - targetFloor : int
  + press()
}

class EmergencyButton {
  + press()
}

class CallPanel {
  - upButton : CallButton
  - downButton : CallButton
}

class ElevatorSystem {
  - scheduler : Scheduler
  - logger : Logger
  + assignElevator(request)
}

class Scheduler {
  + dispatch(request)
}

class Passenger {
  - id : int
  - currentFloor : int
  - destinationFloor : int
  + requestElevator()
}

class SimulatorClock {
  + currentTime : Time
  + tick()
}

class Logger {
  + log(event: String)
}

class RandomGenerator {
  + generatePassenger()
}

class Event {
  - timestamp : Time
  - description : String
}

class Direction {
  <<enumeration>>
  UP
  DOWN
}

class ElevatorState {
  <<enumeration>>
  MOVING
  IDLE
  STOPPED
}

%% Relationships
Building "1" o-- "5" Elevator
Building "1" o-- "12" Floor

Floor "1" o-- "1..3" CallPanel
Floor "1" o-- "*" ElevatorDoor

Elevator "1" *-- "1" ControlPanel
Elevator "1" *-- "1" ElevatorDoor
Elevator --> ElevatorState
Elevator --> Direction

ControlPanel *-- "*" Button
Button <|-- CallButton
Button <|-- FloorButton
Button <|-- EmergencyButton

ElevatorSystem --> Scheduler
ElevatorSystem --> Logger

Scheduler --> Elevator
Scheduler --> Floor

Passenger --> ElevatorSystem

SimulatorClock --> Event
RandomGenerator --> Passenger
