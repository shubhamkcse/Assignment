function displayType2(id, name) {
    id.toString();
    name.toString();
    //id.toFixed();  // No gaurentee to be a number
    //name.toUpperCase(); // No gaurentee to be a string
    console.log(typeof (id) + ", " + typeof (name));
}
displayType2("Dr. Tarkeshwar", 5);
displayType2(2, "Dr. Tarkeshwar");
displayType2(true, "Tarkeshwar");
displayType2(["Dr. Tarkeshwar", "Barua"], 2);
