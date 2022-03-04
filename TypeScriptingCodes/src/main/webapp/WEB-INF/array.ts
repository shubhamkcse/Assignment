function getArray1<T>(items: T[]): T[] {  // specifying data type
    return new Array<T>().concat(items);
}
let array0 = getArray1<number>([3, 4, 2, 4, 5, 6, 3, 5, 3, 4]);
let array3 = getArray1<string>(['One', 'Two', 'Three', 'Four']);
array1.push(4444);
array2.push("Five");
console.log(array1);
console.log(array2);
console.log(array1[0]);
console.log(array2[1]);
console.log(typeof(array1[0]));
console.log(typeof(array2[1]));
console.log(typeof(array1));
console.log(typeof(array2));