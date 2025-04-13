
const questions = [
    {
      question: "Which operator is used to compare two values in Java?",
      options: ["=", "==", "!=", "equals"],
      correctAnswer: 1
    },
    {
      question: "What is the result of 5 + 2 * 3 in Java?",
      options: ["16", "11", "54", "21"],
      correctAnswer: 1
    },
    {
      question: "Which of the following is a valid data type in Java?",
      options: ["integer", "chara", "int", "doub"],
      correctAnswer: 2
    },
    {
      question: "Which keyword is used to inherit a class in Java?",
      options: ["extends", "implements", "super", "inherits"],
      correctAnswer: 0
    },
    {
      question: "Which of the following is not a reserved keyword in Java?",
      options: ["break", "const", "new", "null"],
      correctAnswer: 3
    },
    // Additional questions
    {
      question: "Which method is the entry point of a Java program?",
      options: ["start()", "main()", "init()", "run()"],
      correctAnswer: 1
    },
    {
      question: "What is the size of an int data type in Java?",
      options: ["4 bytes", "2 bytes", "8 bytes", "Depends on system"],
      correctAnswer: 0
    },
    {
      question: "Which keyword is used to create a subclass in Java?",
      options: ["super", "extends", "implements", "this"],
      correctAnswer: 1
    },
    {
      question: "Which package contains the Scanner class?",
      options: ["java.io", "java.util", "java.lang", "java.net"],
      correctAnswer: 1
    },
    {
      question: "Which concept allows using the same method name with different parameters?",
      options: ["Inheritance", "Polymorphism", "Encapsulation", "Abstraction"],
      correctAnswer: 1
    }
  ];
  
  let currentQuestionIndex = 0;
  let score = 0;
  let totalQuestions = questions.length;
  let usedLifelines = {
    fiftyFifty: false,
    skip: false,
    askAudience: false,
    phoneAFriend: false
  };
  
  function displayQuestion() {
    const question = questions[currentQuestionIndex];
    document.getElementById("question-text").innerText = question.question;
  
    const options = document.getElementById("options");
    options.innerHTML = ""; // Clear previous options
  
    question.options.forEach((option, index) => {
      const optionButton = document.createElement("button");
      optionButton.innerText = option;
      optionButton.classList.add("option-btn");
      optionButton.addEventListener("click", () => checkAnswer(index));
      options.appendChild(optionButton);
    });
  
    // Display the lifelines if not used
    displayLifelines();
  }
  
  function checkAnswer(selectedAnswerIndex) {
    const correctAnswerIndex = questions[currentQuestionIndex].correctAnswer;
    if (selectedAnswerIndex === correctAnswerIndex) {
      score += 1000;
      alert("Correct answer! Your score is: " + score);
      nextQuestion();
    } else {
      alert("Wrong answer! Game Over.");
      showFinalScore();
    }
  }
  
  function nextQuestion() {
    currentQuestionIndex++;
    if (currentQuestionIndex < totalQuestions) {
      displayQuestion();
    } else {
      showFinalScore();
    }
  }
  
  function showFinalScore() {
    document.getElementById("question-container").style.display = "none";
    document.getElementById("final-score").style.display = "block";
    document.getElementById("score").innerText = "Your total score is: " + score;
  }
  
  function displayLifelines() {
    const lifelinesContainer = document.getElementById("lifelines");
    lifelinesContainer.innerHTML = ""; // Clear previous lifelines
  
    if (!usedLifelines.fiftyFifty) {
      const fiftyFiftyButton = document.createElement("button");
      fiftyFiftyButton.innerText = "50:50";
      fiftyFiftyButton.classList.add("lifeline-btn");
      fiftyFiftyButton.addEventListener("click", useFiftyFifty);
      lifelinesContainer.appendChild(fiftyFiftyButton);
    }
  
    if (!usedLifelines.skip) {
      const skipButton = document.createElement("button");
      skipButton.innerText = "Skip";
      skipButton.classList.add("lifeline-btn");
      skipButton.addEventListener("click", useSkip);
      lifelinesContainer.appendChild(skipButton);
    }
  
    if (!usedLifelines.askAudience) {
      const askAudienceButton = document.createElement("button");
      askAudienceButton.innerText = "Ask the Audience";
      askAudienceButton.classList.add("lifeline-btn");
      askAudienceButton.addEventListener("click", useAskAudience);
      lifelinesContainer.appendChild(askAudienceButton);
    }
  
    if (!usedLifelines.phoneAFriend) {
      const phoneAFriendButton = document.createElement("button");
      phoneAFriendButton.innerText = "Phone a Friend";
      phoneAFriendButton.classList.add("lifeline-btn");
      phoneAFriendButton.addEventListener("click", usePhoneAFriend);
      lifelinesContainer.appendChild(phoneAFriendButton);
    }
  }
  
  function useFiftyFifty() {
    const correctAnswerIndex = questions[currentQuestionIndex].correctAnswer;
    let wrongAnswers = [];
  
    // Collect wrong answers
    questions[currentQuestionIndex].options.forEach((option, index) => {
      if (index !== correctAnswerIndex) {
        wrongAnswers.push(index);
      }
    });
  
    // Remove two random wrong answers
    while (wrongAnswers.length > 2) {
      const randomIndex = Math.floor(Math.random() * wrongAnswers.length);
      wrongAnswers.splice(randomIndex, 1);
    }
  
    const options = document.getElementById("options");
    options.innerHTML = ""; // Clear previous options
  
    // Add the correct answer and one random wrong answer
    const answerIndexes = [correctAnswerIndex, wrongAnswers[0]];
    answerIndexes.forEach(index => {
      const optionButton = document.createElement("button");
      optionButton.innerText = questions[currentQuestionIndex].options[index];
      optionButton.classList.add("option-btn");
      optionButton.addEventListener("click", () => checkAnswer(index));
      options.appendChild(optionButton);
    });
  
    // Mark lifeline as used
    usedLifelines.fiftyFifty = true;
    displayLifelines();
  }
  
  function useSkip() {
    nextQuestion(); // Skip to the next question
    usedLifelines.skip = true;
    displayLifelines();
  }
  
  function useAskAudience() {
    const correctAnswerIndex = questions[currentQuestionIndex].correctAnswer;
    const audiencePercentages = [0, 0, 0, 0];
  
    // Set a high percentage for the correct answer
    audiencePercentages[correctAnswerIndex] = Math.floor(Math.random() * 40) + 50; // Between 50-90%
  
    // Randomly distribute remaining percentages for other answers
    const remainingPercentage = 100 - audiencePercentages[correctAnswerIndex];
    audiencePercentages.forEach((percentage, index) => {
      if (index !== correctAnswerIndex) {
        audiencePercentages[index] = Math.floor(Math.random() * remainingPercentage);
      }
    });
  
    const options = document.getElementById("options");
    options.innerHTML = ""; // Clear previous options
  
    questions[currentQuestionIndex].options.forEach((option, index) => {
      const optionButton = document.createElement("button");
      optionButton.innerText = `${option} - Audience: ${audiencePercentages[index]}%`;
      optionButton.classList.add("option-btn");
      optionButton.addEventListener("click", () => checkAnswer(index));
      options.appendChild(optionButton);
    });
  
    // Mark lifeline as used
    usedLifelines.askAudience = true;
    displayLifelines();
  }
  
  function usePhoneAFriend() {
    const correctAnswerIndex = questions[currentQuestionIndex].correctAnswer;
    const correctAnswer = questions[currentQuestionIndex].options[correctAnswerIndex];
    
    // Show only the correct answer as the friend's response
    const options = document.getElementById("options");
    options.innerHTML = ""; // Clear previous options
  
    // Add only the correct answer as the friend's answer
    const optionButton = document.createElement("button");
    optionButton.innerText = `Friend says: ${correctAnswer} (Friend's answer)`;
    optionButton.classList.add("option-btn");
    optionButton.addEventListener("click", () => checkAnswer(correctAnswerIndex));
    options.appendChild(optionButton);
  
    // Mark lifeline as used
    usedLifelines.phoneAFriend = true;
    displayLifelines();
  }
  
  
  window.onload = () => {
    displayQuestion(); // Show the first question
  };
  