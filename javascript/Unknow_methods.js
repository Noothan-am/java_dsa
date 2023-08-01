
// Array Functions 

// Includes
const names = ["noothan", "sahana", "dikshit", "kushal"];
console.log(names.includes("noothan")); // returns true


// Match
const key = "r";
console.log(key.match("r")); // returns the index at which the k is present 
console.log(key.match(/^[a-r]$/)); // { /^[a-z]$/ } used to check from (a-z) similarly we can use /^[1-100]$/ for numbers


// every
const letters = ["r", "a", "m"];
const newletters = ["r", "a", "k"];
letters.every(letter => newletters.includes(letter)); // code inside every method return true for each value then every method returns true

