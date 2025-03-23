# Draw It or Lose It - Web-Based Game Application

This project is a Java 11-based implementation of the game _Draw It or Lose It_, originally developed as an Android app and now reimagined for a web-based, multi-platform environment.

## 🧩 Project Overview

_Draw It or Lose It_ is a drawing-based guessing game where teams compete to solve puzzles. The application supports:

- Multiple teams
- Multiple players per team
- Unique naming for games and teams
- Singleton-based game instance management

## 🛠️ Technologies Used

- **Java 11**
- Object-Oriented Programming Principles (Inheritance, Encapsulation, Composition)
- Singleton Design Pattern

## 📁 Project Structure

- `ProgramDriver`: Entry point of the application
- `SingletonTester`: Confirms singleton behavior of GameService
- `Entity`: Abstract class with shared fields and methods
- `GameService`: Singleton class managing game, team, and player instances
- `Game`, `Team`, `Player`: Core entity classes

## 🚀 How to Run

1. Compile the project with `javac *.java`
2. Run the program using `java ProgramDriver`

## 🤝 Contribution

See [CONTRIBUTING.md](CONTRIBUTING.md) for guidelines.

## 📝 License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.
