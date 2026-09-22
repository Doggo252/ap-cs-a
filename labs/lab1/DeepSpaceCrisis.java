import java.util.Scanner;

/*
Deep space crisis lab - this code allows the user to pick a stream aboard the Artemis 9 mission
and answer a series of trivia questions. If the user gets the first three trivia questions correct
in a stream, they are given harder questions. The user is also graded after answering all 6 questions.
*/
public class DeepSpaceCrisis{
    public static void main(String[] args){
        System.out.println("Welcome to the spacecraft.");
        Scanner sc = new Scanner(System.in);
        String stream;
        int score = 0;
        System.out.print("Choose a stream: \n1. Orbital Mechanics (math calculations)\n2. Alien Trivia (multiple-choice trivia questions)\nEnter 'orbital' or 'trivia': ");
        stream = sc.next();
        if(stream.equalsIgnoreCase("orbital")){
            //math stream
            System.out.println("You chose the Orbital Mechanics stream.");
            //question 1
            int q1random = (int) (Math.random() * 5) + 1;
            System.out.print("\nQuestion 1: Space Station Speed\nThe International Space Station completes 16 orbits around\nEarth every 24 hours. How many hours does it take to complete\n" + q1random + " orbits? Express your answer as a decimal without units.\nAnswer: ");
            double answer = sc.nextDouble();
            double correctAnswer = 1.5 * q1random;
            if (answer == correctAnswer){
                score++;
                System.out.println("You got it correct!\nYour current score is: " + score);
            }
            else{
                System.out.println("You got it wrong. The correct answer is " + correctAnswer + " hours.\nYour current score is: " + score);
            }
            //question 2
            int q2random = (int) (Math.random() * 9001) + 1000;
            System.out.print("\nQuestion 2: Satellite Travel Distance\nA weather satellite orbits Earth in a circular path with\na radius of " + q2random + " km from the Earth's center. Using the\nformula C = 2 * pi * r and approximating pi at 3.14,\nwhat is the total distance the satellite travels in one full orbit?\nExpress your answer without units rounded to two decimals.\nAnswer: ");
            answer = sc.nextDouble();
            correctAnswer = Math.round(2 * 3.14 * q2random * 100)/100.0;

            if (answer == correctAnswer){
                score++;
                System.out.println("You got it correct!\nYour current score is: " + score);
            }
            else{
                System.out.println("You got it wrong. The correct answer is " + correctAnswer + ".\nYour current score is: " + score);
            }
            //question 3
            int q3random = (int) (Math.random() * 300000) + 200000;
            System.out.print("\nQuestion 3: Rover Signal Delay\nRadio signals traveling from a Mars orbiter to Earth\ntravel at " + q3random + " km/s. If Mars is currently 150,000,000 km\naway from Earth, how many seconds does it take for a signal\nto reach Earth? Respond without units rounded to two decimals.\nAnswer: ");
            answer = sc.nextDouble();
            correctAnswer = Math.round(150000000.0/q3random * 100)/100.0;


            if (answer == correctAnswer){
                score++;
                System.out.println("You got it correct!\nYour current score is: " + score);
            }
            else{
                System.out.println("You got it wrong. The correct answer is " + correctAnswer + " seconds.\nYour current score is: " + score);
            }

            if (score == 3){
                System.out.println("Congratulations! You are now being moved to the advanced path\nsince you got all the questions right.");
                //question 7
                int q7random = (int) (Math.random() * 12) + 12;
                System.out.print("\nHard Question 1: Transfer Orbit Timing\nA spacecraft enters a transfer orbit to move from a lower orbit to\na higher orbit. The entire elliptical transfer path takes " + q7random + " hours\nto complete a full loop. However, the spacecraft only needs to travel\nalong half of the loop to reach the target orbit. Once it arrives, it\nmust perform a 25-minute engine burn to lock into place. What is the\ntotal time in minutes from the start of the transfer to the end of the\nengine burn? Express your answer without units\nAnswer: ");
                answer = sc.nextDouble();
                correctAnswer = ((q7random / 2.0) * 60) + 25;

                if (answer == correctAnswer){
                    score++;
                    System.out.println("You got it correct!\nYour current score is: " + score);
                }
                else{
                    System.out.println("You got it wrong. The correct answer is " + correctAnswer + ".\nYour current score is: " + score);
                }
                //question 8
                int q8random1 = (int) (Math.random() * 50) + 50;
                int q8random2 = (int) (Math.random() * 50) + 50;
                System.out.print("\nHard Question 2: Scale Model Rocket\nEngineers are building a scale model of an orbital launch vehicle.\nThe real rocket stands " + q8random1 + " meters tall and has a main engine nozzle\ndiameter of 2.8 meters. If the scale model is built so that its height\nis " + q8random2 + " centimeters, what should the diameter of the model's engine nozzle\nbe in centimeters? Express your answer without units.\nAnswer: ");
                answer = sc.nextDouble();
                correctAnswer = Math.round((double) q8random2/(double) q8random1 * 2.8 * 100) / 100.0;

                if (answer == correctAnswer){
                    score++;
                    System.out.println("You got it correct!\nYour current score is: " + score);
                }
                else{
                    System.out.println("You got it wrong. The correct answer is " + correctAnswer + " cm.\nYour current score is: " + score);
                }
                //question 9
                double q9random = Math.round((Math.random() * 1000))/100.0;
                System.out.print("\nHard Question 3: Orbital Decay Loss\nA satellite in low Earth orbit experiences atmospheric drag, causing\nits altitude to decrease by " + q9random + " km every week.\nIf the satellite starts at an altitude of 400 km, what will\nits altitude be after 8 weeks? Express your answer without units.\nAnswer: ");
                answer = sc.nextDouble();
                correctAnswer = 400 - (q9random*8);

                if (answer == correctAnswer){
                    score += 1;
                    System.out.println("You got it correct!");
                }
                else{
                    System.out.println("You got it wrong. The correct answer is " + correctAnswer + " km.");
                }
            }
            else{
                //question 4
                int q4random = (int) (Math.random() * 50) + 10;
                System.out.print("\nQuestion 4: Lunar Module Fuel Consumption\nA lunar lander uses " + q4random + " kg of fuel for every 3 minutes\nof thruster burns during an orbit adjustment. At this\nrate, how many kilograms of fuel will it burn during a\n12-minute maneuver? Express your answer without units.\nAnswer: ");
                answer = sc.nextDouble();
                correctAnswer = q4random * 4;

                if (answer == correctAnswer){
                    score += 1;
                    System.out.println("You got it correct!\nYour current score is: " + score);
                }
                else{
                    System.out.println("You got it wrong. The correct answer is " + correctAnswer + " kg.\nYour current score is: " + score);
                }
                //question 5
                int q5random = (int) (Math.random() * 150) + 50;
                System.out.print("\nQuestion 5: Gravity Ratio\nAn astronaut weighs " + q5random + " lbs on Earth. Due to weaker gravity,\na person's weight on the Moon is about 1/6 of their weight\non Earth. How much would the astronaut weigh on the Moon?\nAnswer: ");
                answer = sc.nextDouble();
                correctAnswer = q5random / 6.0;

                if (answer == correctAnswer){
                    score += 1;
                    System.out.println("You got it correct!\nYour current score is: " + score);
                }
                else{
                    System.out.println("You got it wrong. The correct answer is " + correctAnswer + " lbs.\nYour current score is: " + score);
                }
                //question 6
                int q6random = (int) (Math.random() * 99) + 1;
                System.out.print("\nQuestion 6: Probe Velocity Adjustment\nA deep-space probe is traveling at 12,400 m/s. Flight controllers\nfire its engines to increase its speed by " + q6random + "%. What is the probe's\nnew speed in meters per second? Express your answer without units.\nAnswer: ");
                answer = sc.nextDouble();
                correctAnswer = 12400 * ((q6random/100.0)+1);
                if (answer == correctAnswer){
                    score += 1;
                    System.out.println("You got it correct!");
                }
                else{
                    System.out.println("You got it wrong. The correct answer is " + correctAnswer + " m/s.");
                }
            }
            System.out.println("\nYour final score is: " + score);
            if (score <=2){
                System.out.println("Grade F (Mission Failed — Ship lost in deep space).");
            }
            else if (score <= 3){
                System.out.println("Grade D (Critical Systems Damaged).");
            }
            else if (score <= 4){
                System.out.println("Grade C (Mission Sustained).");
            }
            else if (score <= 5){
                System.out.println("Grade B (Successful Orbit).");
            }
            else if (score <= 6) {
                System.out.println("Grade A (Flawless Execution — Mission Aced).");
            }
        }
        else if (stream.equalsIgnoreCase("trivia")){
            //trivia stream
            System.out.println("You chose the Alien Trivia stream.");
            //question 1
            System.out.print("\nQuestion 1:\nWhat shape are flying saucers usually drawn or described as in popular\nalien lore?\nA. Square\nB. Disc or saucer\nC. Triangle\nD. Pyramid\nAnswer: ");
            String answerS = sc.next();

            if (answerS.equalsIgnoreCase("b")){
                score++;
                System.out.println("You got it correct!\nYour current score is: " + score);
            }
            else{
                System.out.println("You got it wrong. The correct answer is B.\nYour current score is: " + score);
            }
            //question 2
            System.out.print("\nQuestion 2:\nWhat color skin is most commonly given to classic 'little green men' in\ncartoons and comic books?\nA. Blue\nB. Green\nC. Purple\nD. Orange\nAnswer: ");
            answerS = sc.next();

            if (answerS.equalsIgnoreCase("b")){
                score++;
                System.out.println("You got it correct!\nYour current score is: " + score);
            }
            else{
                System.out.println("You got it wrong. The correct answer is B.\nYour current score is: " + score);
            }
            //question 3
            System.out.print("\nQuestion 3:\nWhich planet in our solar system is nicknamed the 'Red Planet' and is the\nmost common home for aliens in classic sci-fi stories?\nA. Venus\nB. Mars\nC. Jupiter\nD. Saturn\nAnswer: ");
            answerS = sc.next();

            if (answerS.equalsIgnoreCase("b")){
                score++;
                System.out.println("You got it correct!\nYour current score is: " + score);
            }
            else{
                System.out.println("You got it wrong. The correct answer is B.\nYour current score is: " + score);
            }

            if (score == 3){
                System.out.println("Congratulations! You are now being moved to the advanced path\nsince you got all the questions right.");
                //question 7
                System.out.print("\nHard Question 1:\nWhat color is the sun actually considered to be by astronomers, even though\nit looks yellow to us from Earth's surface?\n\nA. Blue\nB. Red\nC. White\nD. Green\nAnswer: ");
                answerS = sc.next();

                if (answerS.equalsIgnoreCase("c")){
                    score++;
                    System.out.println("You got it correct!\nYour current score is: " + score);
                }
                else{
                    System.out.println("You got it wrong. The correct answer is C.\nYour current score is: " + score);
                }
                //question 8
                System.out.print("\nHard Question 2:\nWhat is the name of our home galaxy that contains Earth, our sun, and\nbillions of other stars?\n\nA. Andromeda\nB. The Milky Way\nC. The Whirlpool\nD. Sombrero\nAnswer: ");
                answerS = sc.next();

                if (answerS.equalsIgnoreCase("b")){
                    score++;
                    System.out.println("You got it correct!\nYour current score is: " + score);
                }
                else{
                    System.out.println("You got it wrong. The correct answer is B.\nYour current score is: " + score);
                }
                //question 9
                System.out.print("\nHard Question 3:\nIn space, what happens to sound waves because there is no air or atmosphere\nfor them to travel through?\nA. They travel twice as fast\nB. They become very high-pitched\nC. They cannot travel at all (total silence)\nD. They turn into light waves\nAnswer: ");
                answerS = sc.next();

                if (answerS.equalsIgnoreCase("c")){
                    score++;
                    System.out.println("You got it correct!");
                }
                else{
                    System.out.println("You got it wrong. The correct answer is C.");
                }
            }
            else{
                //question 4
                System.out.print("\nQuestion 4:\nWhat do the initials 'UFO' stand for?\nA. Universal Flying Object\nB. Unknown Floating Craft\nC. Unidentified Flying Object\nD. Undercover Flying Orb\nAnswer: ");
                answerS = sc.next();

                if (answerS.equalsIgnoreCase("c")){
                    score++;
                    System.out.println("You got it correct!\nYour current score is: " + score);
                }
                else{
                    System.out.println("You got it wrong. The correct answer is C.\nYour current score is: " + score);
                }
                //question 5
                System.out.print("\nQuestion 5:\nWhat giant gas planet in our solar system has large rings surrounding it?\nA. Mars\nB. Mercury\nC. Saturn\nD. Earth\nAnswer: ");
                answerS = sc.next();

                if (answerS.equalsIgnoreCase("c")){
                    score++;
                    System.out.println("You got it correct!\nYour current score is: " + score);
                }
                else{
                    System.out.println("You got it wrong. The correct answer is C.\nYour current score is: " + score);
                }
                //question 6
                System.out.print("\nQuestion 6:\nWhat do scientists call a giant rock traveling through space that burns up\nwhen entering Earth's atmosphere, often called a 'shooting star'?\nA. Meteor\nB. Black Hole\nC. Galaxy\nD. Nebula\nAnswer: ");
                answerS = sc.next();

                if (answerS.equalsIgnoreCase("a")){
                    score++;
                    System.out.println("You got it correct!");
                }
                else{
                    System.out.println("You got it wrong. The correct answer is A.");
                }
            }
            System.out.println("\nYour final score is: " + score);
            if (score <=2){
                System.out.println("Grade F (Mission Failed — Ship lost in deep space).");
            }
            else if (score <= 3){
                System.out.println("Grade D (Critical Systems Damaged).");
            }
            else if (score <= 4){
                System.out.println("Grade C (Mission Sustained).");
            }
            else if (score <= 5){
                System.out.println("Grade B (Successful Orbit).");
            }
            else if (score <= 6) {
                System.out.println("Grade A (Flawless Execution — Mission Aced).");
            }
        }
        else {
            System.out.println("CRITICAL ERROR: Unauthorized stream selection. Aborting launch.");
        }
        sc.close();
    }
}