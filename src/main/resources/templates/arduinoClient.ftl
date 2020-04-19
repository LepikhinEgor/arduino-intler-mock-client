<#ftl encoding="UTF-8"/>
<!doctype html>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=Edge">
    <title>Arduino client</title>
    <link rel="stylesheet" href="css/arduinoClient.css"/>
    <script src="js/jquery-3.4.1.js" type="text/javascript"></script>
    <!--[if lt IE 9]>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>

<body>
<div class="top-panel">
    <div class="top_panel_name"><h1>Mock Arduino client</h1></div>
</div>
<div class="content-panel">
    <div class="content-panel-page">
        <table class="properties_table">
            <tr>
                <td><span>Login</span></td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td><span>Password</span></td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td><span>Device name</span></td>
                <td><input type="text"></td>
            </tr>
            <tr>
                <td><span>Request timeout</span></td>
                <td><input type="number"></td>
            </tr>
        </table>

        <h2>Sensors</h2>

        <table class="sensors_table">
            <tr class="table_head">
                <td>Name</td>
                <td>Value</td>
                <td>Remove</td>
            </tr>
            <tr>
                <td>ergerg</td>
                <td>rgetgg</td>
                <td>regreg</td>
            </tr>
            <tr>
                <td>ergerg</td>
                <td>rgetgg</td>
                <td>regreg</td>
            </tr>
            <tr>
                <td>ergerg</td>
                <td>rgetgg</td>
                <td>regreg</td>
            </tr>
            <tr>
                <td>ergerg</td>
                <td>rgetgg</td>
                <td>regreg</td>
            </tr>
            <tr class="add_sensor_tr">
                <td><input type="text"></td>
                <td><input type="number"></td>
                <td><button class="add_sensor_btn">Add</button></td>
            </tr>
        </table>
        <h2>Output</h2>
        <div class="output_console">
        </div>
    </div>
</div>
</body>
</html>