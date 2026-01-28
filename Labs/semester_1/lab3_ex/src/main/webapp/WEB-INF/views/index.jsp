<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Fitness Tracker</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
            position: relative;
            overflow: hidden;
        }

        body::before {
            content: '';
            position: absolute;
            width: 500px;
            height: 500px;
            background: rgba(255, 255, 255, 0.1);
            border-radius: 50%;
            top: -250px;
            left: -250px;
            animation: float 20s infinite ease-in-out;
        }

        body::after {
            content: '';
            position: absolute;
            width: 400px;
            height: 400px;
            background: rgba(255, 255, 255, 0.08);
            border-radius: 50%;
            bottom: -200px;
            right: -200px;
            animation: float 15s infinite ease-in-out reverse;
        }

        @keyframes float {
            0%, 100% { transform: translate(0, 0) scale(1); }
            50% { transform: translate(50px, 50px) scale(1.1); }
        }

        .optionsContainer {
            display: flex;
            flex-direction: column;
            gap: 2rem;
            position: relative;
            z-index: 1;
            max-width: 600px;
            width: 100%;
        }

        .optionsContainer h1 {
            color: white;
            font-size: 3.5rem;
            font-weight: 900;
            text-align: center;
            margin-bottom: 1rem;
            text-shadow: 0 4px 20px rgba(0, 0, 0, 0.3);
            letter-spacing: -1px;
        }

        .optionsContainer p {
            transform: translateY(0);
            transition: transform 0.3s ease;
        }

        .optionsContainer p:hover {
            transform: translateY(-8px);
        }

        .optionsContainer a {
            display: block;
            background: rgba(255, 255, 255, 0.95);
            backdrop-filter: blur(10px);
            padding: 2rem 3rem;
            border-radius: 20px;
            text-decoration: none;
            color: #667eea;
            font-size: 1.5rem;
            font-weight: 700;
            box-shadow: 0 10px 40px rgba(0, 0, 0, 0.2);
            position: relative;
            overflow: hidden;
            transition: all 0.4s cubic-bezier(0.175, 0.885, 0.32, 1.275);
            border: 3px solid transparent;
        }

        .optionsContainer a::before {
            content: '';
            position: absolute;
            top: 0;
            left: -100%;
            width: 100%;
            height: 100%;
            background: linear-gradient(90deg, transparent, rgba(102, 126, 234, 0.3), transparent);
            transition: left 0.5s ease;
        }

        .optionsContainer a:hover::before {
            left: 100%;
        }

        .optionsContainer a:hover {
            transform: scale(1.05);
            box-shadow: 0 20px 60px rgba(0, 0, 0, 0.3);
            border-color: rgba(102, 126, 234, 0.5);
            background: white;
        }

        .optionsContainer a::after {
            content: '→';
            position: absolute;
            right: 2rem;
            top: 50%;
            transform: translateY(-50%);
            opacity: 0;
            transition: all 0.3s ease;
            font-size: 2rem;
        }

        .optionsContainer a:hover::after {
            opacity: 1;
            right: 1.5rem;
        }

        .optionsContainer p:nth-child(2) a {
            background: linear-gradient(135deg, #f093fb 0%, #f5576c 100%);
            color: white;
        }

        .optionsContainer p:nth-child(3) a {
            background: linear-gradient(135deg, #4facfe 0%, #00f2fe 100%);
            color: white;
        }

        .optionsContainer p:nth-child(4) a {
            background: linear-gradient(135deg, #43e97b 0%, #38f9d7 100%);
            color: white;
        }

        @media (max-width: 768px) {
            .optionsContainer h1 {
                font-size: 2.5rem;
            }

            .optionsContainer a {
                padding: 1.5rem 2rem;
                font-size: 1.2rem;
            }
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(30px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        .optionsContainer p {
            animation: fadeIn 0.6s ease forwards;
        }

        .optionsContainer p:nth-child(1) { animation-delay: 0s; }
        .optionsContainer p:nth-child(2) { animation-delay: 0.1s; }
        .optionsContainer p:nth-child(3) { animation-delay: 0.2s; }
        .optionsContainer p:nth-child(4) { animation-delay: 0.3s; }
    </style>
</head>
<body>
<div class="optionsContainer">
    <h1>Goal Tracker</h1>
    <p><a href="getGoals">List Goals</a></p>
    <p><a href="addGoal?id=0&minutes=20&exerciseDesc=swimming">Add Goal</a></p>
    <p><a href="addExercise?goalId=0&id=0&minutes=20&activity=trekking">Add Exercise</a></p>
</div>
</body>
</html>