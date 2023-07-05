<html>
<head>
    <title>Resume Builder</title>
</head>
<body>
<h1>Resume Builder</h1>
<form action="resume.do" method="post">
    <table>
        <tr>
            <td>First Name:</td>
            <td><input type="text" name="firstName"></td>
        </tr>
        <tr>
            <td>Last Name:</td>
            <td><input type="text" name="lastName"></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="text" name="email"></td>
        </tr>
        <tr>
            <td>Phone:</td>
            <td><input type="text" name="phone"></td>
        </tr>
        <tr>
            <td>Address:</td>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <td>City:</td>
            <td><input type="text" name="city"></td>
        </tr>
        <tr>
            <td>State:</td>
            <td><input type="text" name="state"></td>
        </tr>
        <tr>
            <td>Zip Code:</td>
            <td><input type="text" name="zipcode"></td>
        </tr>
        <tr>
            <td>Skills:</td>
            <td><textarea name="skills"></textarea></td>
        </tr>
        <tr>
            <td>Experience:</td>
            <td><textarea name="experience"></textarea></td>
        </tr>
        <tr>
            <td>Education:</td>
            <td><textarea name="education"></textarea></td>
        </tr>
        <tr>
            <td>References:</td>
            <td><textarea name="references"></textarea></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Create Resume"></td>
        </tr>
    </table>
</form>
</body>
</html>
