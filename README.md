# AP Computer Science A

My coursework from **AP Computer Science A** at **Mountain View High School** (2026–2027 school year). Everything is written in Java and organized by type of assignment and by week.

## What's inside

```
.
├── animation/     Animated triangles practice (Swing + Thread.sleep)
├── classwork/     Daily classwork and warm-ups, grouped by week
├── keyListening/  Keyboard input practice with KeyListener, plus a key code reference
├── labs/          Larger graded lab assignments
├── projects/      Quarter projects
└── quizzes/       In-class quiz code
```

## Labs

| Lab | Description |
| --- | --- |
| [Lab 1: Deep Space Crisis](labs/lab1) | A space-themed quiz game aboard the "Artemis 9" mission. The player picks a stream (**Orbital Mechanics** math problems or **Alien Trivia** multiple choice). Questions use randomized numbers, and getting the first three right unlocks a harder set. The player is scored at the end. Question bank is in `questions.txt`. |
| [Lab 2: Formula Solver](labs/lab2) | A color-coded terminal menu that solves 15 formulas from math and physics, including the quadratic formula, Pythagorean theorem, distance and midpoint, sphere volume, Ohm's law, and kinetic and potential energy. The `Formulas` class holds one method per formula and `Runner` handles the menu and input. |
| [Lab 3: Virtual Pet Companion](labs/lab3) | A color-coded terminal game where you care for **Luna**, a pet phoenix. A menu lets you walk, feed, play with, put to sleep or wake up, check on, and take Luna to the vet. The `Pet` class tracks hunger, happiness, and sleep, keeps stats between 0 and 100, and refuses actions when Luna is too hungry, too happy, or asleep. Input is checked with `do`/`while` loops. |
| [Lab 4: Slot Machine](labs/lab4) | A Java Swing slot machine where pressing the **spacebar** spins three random numbers and pays out points (777, three of a kind, two of a kind). Uses a `KeyListener` on a `JPanel`. *(In progress)* |

Submitted `.zip` files for Labs 2 and 3 are also in the `labs/` folder.

## Projects

| Project | Description |
| --- | --- |
| [Q1 Project: Scenery](projects/q1project) | A Java Swing (`JFrame` / `JPanel`) graphics project that draws a scene on an 800×600 canvas. The user picks **day or night** and **spring, fall, or winter** in the terminal, and the program draws a matching scene. Each season has its own details: flowers, a butterfly, and a bunny in spring; a barn, pumpkins, a fox, and a squirrel in fall; snowy trees, a penguin, and a winter house in winter. Every shape has its own helper method (`drawTree`, `drawHouse`, `drawCloud`, and more). A submitted `.zip` is in `projects/`. |

## Graphics practice

| Folder | Description |
| --- | --- |
| [animation](animation) | Ten colored `Triangle` objects that slide right or down across the screen and loop back to their start. Uses an `animate()` loop with `Thread.sleep()` and `repaint()`. |
| [keyListening](keyListening) | Starter for keyboard control: a `Player` drawn on a black screen, with a `Screen` that implements `KeyListener`. Includes [`keyboardCodes.md`](keyListening/keyboardCodes.md), a reference table of Java key codes. *(In progress)* |

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
| [Week 8](classwork/week8) | Working with Git and GitHub as a class (shared repos, branches), comparing my code with AI-written code | `P3-HelloWorld` practice repo, `Circle` vs `AICircle` menu calculator |
| [Week 10](classwork/week10) | `while` and `do`/`while` loops, catching bad input with `try`/`catch` | `WhichWhile`, `LoopError` (fixing a loop bug), `BooLean` math game |
| [Week 11](classwork/week11) | Casting to `double`, `for` loops | `MathTest` (division and slope), `ForLoop`, factorial in `QuizPractice` |
| [Week 12](classwork/week12) | Nested loops, animating multiple objects | `NestedLoops` (boxes, multiplication chart, triangle), animated `Cloud`, `Sun`, and `Bunny` scene |
| [Week 13](classwork/week13) | `break` and `continue`, AP free-response (FRQ) practice | `ForPractice`, `StepTracker` FRQ (active days and average steps) |

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
cd labs/lab3
javac *.java
java Runner
```

These programs open a window, so run them on a computer with a display:

- `projects/q1project`
- `labs/lab4`
- `animation`
- `keyListening`
- `classwork/week6/guipractice`
- `classwork/week12/october29animationclasswork`

## Concepts covered so far

- Output, escape sequences, and comments
- Primitive types, variables, and arithmetic (including integer division and casting)
- User input with `Scanner`, and handling bad input with `try`/`catch`
- Random numbers with `Math.random()` and `Random`
-