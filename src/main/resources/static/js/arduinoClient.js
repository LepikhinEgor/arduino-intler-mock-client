function requestAddSensor(name, value) {
    var sensor = {
        name : name || "",
        value: value|| 0
    }

    $.ajax({
        type: "POST",
        url: "arduino-client/add",
        contentType: 'application/json',
        data: JSON.stringify(sensor),
        success: function(data) {
            console.log(data);
        }
    });
}

function requestDeleteSensor(id) {
    $.ajax({
        type: "GET",
        url: "arduino-client/delete/"+ id,
        contentType: 'application/json',
        success: function(data) {
            console.log(data);
        }
    });
}

function requestUpdateSensorValue(id, value) {
    $.ajax({
        type: "GET",
        url: "arduino-client/update/"+ id + "/" + value,
        contentType: 'application/json',
        success: function(data) {
            console.log(data);
        }
    });
}
