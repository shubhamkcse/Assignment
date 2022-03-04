function getArray(items) {
    return new Array().concat(items);
}
var array1 = getArray([3, 4, 2, 4, 5, 6, 3, 5, 3, 4]);
var array2 = getArray(['One', 'Two', 'Three', 'Four']);
array1.push(4444);
array2.push("Five");
console.log(array1);
console.log(array2);
console.log(array1[0]);
console.log(array2[1]);
console.log(typeof (array1[0]));
console.log(typeof (array2[1]));
console.log(typeof (array1));
console.log(typeof (array2));
