<!DOCTYPE html>
<html>

    <title>Name and Age Form</title>
</head>

    <h1>Please enter your name and age:</h1>
    <form action="/submit-name-age" method="POST">
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name"><br><br>
        <label for="age">Age:</label><br>
        <input type="number" id="age" name="age"><br><br>
        <button type="submit">Submit</button>
    </form>
    <% if (locals.greeting) { %>
        <p>
            <%= greeting %>
        </p>
        <% } %>
<head>
<body>
</body>

</html>