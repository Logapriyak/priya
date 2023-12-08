package java_project;
import java.util.ArrayList;

import java.util.Scanner;



class Question {

    private String questionText;

    private ArrayList<String> options;

    private int correctOptionIndex;



    public Question(String questionText, ArrayList<String> options, int correctOptionIndex) {

        this.questionText = questionText;

        this.options = options;

        this.correctOptionIndex = correctOptionIndex;

    }



    public String getQuestionText() {

        return questionText;

    }



    public ArrayList<String> getOptions() {

        return options;

    }



    public int getCorrectOptionIndex() {

        return correctOptionIndex;

    }

}



class Quiz {

    private ArrayList<Question> questions;



    public Quiz() {

        questions = new ArrayList<>();

    }



    public void addQuestion(Question question) {

        questions.add(question);

    }



    public void startQuiz() {

        Scanner scanner = new Scanner(System.in);

        int score = 0;



        for (Question question : questions) {

            System.out.println("\n" + question.getQuestionText());



            ArrayList<String> options = question.getOptions();

            for (int i = 0; i < options.size(); i++) {

                System.out.println((i + 1) + ". " + options.get(i));

            }



            System.out.print("Enter your answer (1-" + options.size() + "): ");

            int userAnswer = scanner.nextInt();



            if (userAnswer == question.getCorrectOptionIndex() + 1) {

                System.out.println("Correct!\n");

                score++;

            } else {

                System.out.println("Incorrect. The correct answer is: " + (question.getCorrectOptionIndex() + 1) + "\n");

            }

        }



        System.out.println("Quiz completed! Your score: " + score + " out of " + questions.size());

        scanner.close();

    }

}



public class QuizGame {



    public static void main(String[] args) {

        // Create a quiz and add questions

        Quiz quiz = new Quiz();



        ArrayList<String> options1 = new ArrayList<>();

        options1.add("A. Java");

        options1.add("B. Python");

        options1.add("C. C++");

        options1.add("D. JavaScript");

        Question question1 = new Question("What programming language is this quiz written in?", options1, 0);

        quiz.addQuestion(question1);



        ArrayList<String> options2 = new ArrayList<>();

        options2.add("A. Mercury");

        options2.add("B. Venus");

        options2.add("C. Earth");

        options2.add("D. Mars");

        Question question2 = new Question("Which planet is known as the 'Red Planet'?", options2, 3);

        quiz.addQuestion(question2);



        ArrayList<String> options3 = new ArrayList<>();

        options3.add("A. Paris");

        options3.add("B. Rome");

        options3.add("C. Berlin");

        options3.add("D. London");

        Question question3 = new Question("Which city is the capital of France?", options3, 0);

        quiz.addQuestion(question3);



        // Start the quiz

        quiz.startQuiz();

    }

}
