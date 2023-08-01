
// 1. key may be calculated at run-time
let user = {
  name: "John",
  age: 30
};

let key = prompt("What do you want to know about the user?", "name");
alert( user[key] );

// Not Possible
let user = {
  name: "John",
  age: 30
};

let key = "name";
alert( user.key )

// 2. dynamic property
  let fruit = prompt("Which fruit to buy?", "apple");
  let bag = {
    [fruit]: 5, 
  };

// 3. reserved keywords possible
  let obj = {
    for: 1,
    let: 2,
    return: 3
  };

// 4. in operator
  let user = { name: "John", age: 30 };

  alert( "age" in user ); // true, user.age exists
  alert( "blabla" in user );

// object declared as const can be modified.The value of user is constant, it must always reference the same object, but properties of that object are free to change.TT

// 5. Object.assign()
  let user = {
    name: "John",
    age: 30
  };
  let clone = Object.assign({}, user);  // now user and clone are two different fields 

// 6. structureClone() // deep copy the object
  let user = {
  name: "John",
  sizes: {
    height: 182,
    width: 50
  }
};
let clone = structuredClone(user);

