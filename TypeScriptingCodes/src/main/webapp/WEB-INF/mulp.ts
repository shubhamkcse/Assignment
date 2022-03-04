
function displayType2<T, U>(id:T, name:U):void{
    console.log(typeof(id)+", "+typeof(name));
}

displayType2<number, string>(1,"shubham");
displayType2<string, number>("Shubham k",2);
 
function displayType1<T>(id:T, name:any):void{
    console.log(typeof(id)+", "+typeof(name));
}
displayType1<boolean>(true,"Shubham");
displayType1<string[]>(["Shubham", "Kavade"],2);
