# AP Computer Science A

My coursework from **AP Computer Science A** at **Mountain View High School** (2026–2027 school year). Everything is written in Java and organized by type of assignment and by week.

## What's inside

```
.
├── classwork/   Daily classwork and warm-ups, grouped by week
├── labs/        Larger graded lab assignments
├── projects/    Quarter projects
└── quizzes/     In-class quiz code
```

## Labs

| Lab | Description |
| --- | --- |
| [Lab 1: Deep Space Crisis](labs/lab1) | A space-themed quiz game aboard the "Artemis 9" mission. The player picks a stream (**Orbital Mechanics** math problems or **Alien Trivia** multiple choice). Questions use randomized numbers, and getting the first three right unlocks a harder set. The player is scored at the end. Question bank is in `questions.txt`. |
| [Lab 2: Formula Solver](labs/lab2) | A color-coded terminal menu that solves 15 formulas from math and physics, including the quadratic formula, Pythagorean theorem, distance and midpoint, sphere volume, Ohm's law, and kinetic and potential energy. The `Formulas` class holds one method per formula and `Runner` handles the menu and input. |

## Projects

| Project | Description |
| --- | --- |
| [Q1 Project: Scenery](projects/q1project) | A Java Swing (`JFrame` / `JPanel`) graphics project that draws a scene on an 800×600 canvas. *(In progress)* |

## Classwork by week

| Week | Topics | Highlights |
| --- | --- | --- |
| [Week 1](classwork/week1) | `print` vs `println`, escape sequences, comments | `HelloWorld`, ASCII art `Bunny`, mailing `Labels` |
| [Week 2](classwork/week2) | Variables, data types, identifiers, compile vs runtime errors | `BinConverter` (decimal to binary), `MathGame` (5-formula calculator) |
| [Week 3](classwork/week3) | `Scanner` input, `Math.PI`, code style, the `nextLine()` buffer issue | `TriviaGame`, `RandomQuiz`, cylinder and prism volume calculators |
| [Week 4](classwork/week4) | `Math.random()`, the modulus operator, `if`/`else`, first custom classes and methods | `farm/` (Cat, Dog, Chicken objects), `EvenOdd`, `RandEx` |
| [Week 5](classwork/week5) | Private instance variables, writing methods in separate classes | Kitchen simulator (`Oven`, `DrinkDispenser`), `Square` and `Circle` |
| [Week 6](classwork/week6) | Parameters, constructors (default and initialization), intro to GUI graphics | `Animal` constructors, `Rectangle`/`Triangle`, `GuiEx` drawing |
| [Week 7](classwork/week7) | Method overloading and the `this` keyword | `Overloaded`, `Profile`, `UseRadius` |

## Quizzes

- [Quiz 1](quizzes/quiz1): variables and arithmetic (area and circumference of a circle)

## How to run

You need a Java JDK (version 17 or later recommended).

For single-file programs:

```bash
cd classwork/week2
javac MathGame.java
java MathGame
```

For folders with a `Runner.java`, compile every file in the folder and run `Runner`:

```bash
cd labs/lab2
javac *.java
java Runner
```

The GUI programs (`classwork/week6/guipractice` and `projects/q1project`) open a window, so run them on a computer with a display.

## Concepts covered so far

- Output, escape sequences, and comments
- Primitive types, variables, and arithmetic (including integer division)
- User input with `Scanner`
- Random numbers with `Math.random()` and `Random`
- Conditionals (`if`, `else if`, `else`)
- Classes, objects, and instance variables
- Methods, parameters, and method overloading
- Constructors and the `this` keyword
- Basic graphics with Java Swing

## Author

**Neil Patil**, Mountain View High School
