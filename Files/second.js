/*What’s the result of executing this code and why?*/

function test() {
  console.log(a);
  console.log(fun());

  var a = 1;
  function fun() {
    return 2;
  }
}

test();

/* Output:
undefined
2
*/

/*Why:
Due to hoisting behavior of JavaScript all the declarations are moved to the top.
And a declared variable has the value 'undefined' by default.
*/
