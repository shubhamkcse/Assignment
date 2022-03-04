 function displayType<T, U>(id:T, name:U):void{    console.log(typeof(id)+", "+typeof(name));
}
displayType<number, string>(1,"shubham");
displayType<string, number>("Kavade",2);