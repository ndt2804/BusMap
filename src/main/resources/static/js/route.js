var myLatlng = {lat:10.762622, lng:106.660172};
var mapOptision = {
    center: myLatlng,
    zoom: 15,
    mapTypeId: google.maps.MapTypeId.ROUDMAP
};
var map = new google.maps.Map(document.getElementById("googleMap"), mapOptision)

var directionsService = new google.maps.DirectionsService();

var directionsDisplay = new  google.maps.DirectionsRenderer();

directionsDisplay.setMap(map);

function calcRoute() {
    var request = {
        origin : document.getElementById("from").value,
        destination: document.getElementById("to").value,
        travelMode: google.maps.TravelMode.DRIVING,
        unitSystem: google.maps.UnitSystem.IMPERIAL
    }
    directionsService.route(request, (result, status) => {
        if (status == google.maps.DirectionsStatus.OK) {
            const output = document.querySelector('#output');
            output.innerHTML="<div class='alert-info'> Form: " + document.getElementById("Form").value + " .<br />To " + document.getElementById("To").value + ". <br /> Driving Distance <i class='fas fa-roud'></i>:" + result.routes[0].legs[0].distance.text + ".<br /> Duration <i class='fas fa-hourglass-start'></i>:" + result.routes[0].legs[0].duration.text + ".</div>";

            directionsDisplay.setDirections(result);
        }else {
            directionsDisplay.setDirections({ routes:[]});
            map.setCenter(myLatlng);

            output.innerHTML="<div class='alert-danger'><i class='fas fa-exclamation-triangle'></i> Could not driving distance. </div>";

        }
    });
}
var options = {
    types: ['(cities']
}
var input1 = document.getElementById("from");
var autocomplete1 = new google.maps.places.Autocomplete(intput1, options)
var input2 = document.getElementById("to");
var autocomplete2 = new google.maps.places.Autocomplete(intput2, options)
