function displayType3<T, U>(id:T, name:U):void{
    id.toString();
    name.toString();
    //id.toFixed();  // No gaurentee to be a number
    //name.toUpperCase(); // No gaurentee to be a string
    console.log(typeof(id)+", "+typeof(name));
}
displayType3<string, number>("Dr. Tarkeshwar",5);
displayType3<number,string>(2,"Dr. Tarkeshwar");
displayType3<boolean,string>(true,"Tarkeshwar");
displayType3<string[],number>(["Dr. Tarkeshwar", "Barua"],2);