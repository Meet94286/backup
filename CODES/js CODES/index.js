var template = `<p>For attending our conference on Frontend Development.</p>
<p>Hop all of you found it informative!!!</p>
<p>We look foreard to see you all in future conferences.</p>
<p>Best Regards</p>
<h2>Team UpGrad</h2>
`;



document.getElementById('add-template').innerHTML = template;



//  let a;
// a = 99;  
// console.log(typeof a); 
// a = "ShaktiMan";
// console.log(typeof a);

// const greet1 = (name) => {
//     return console.log("Hello " + name);
//  }
 
//  const greet2 = name => {
//     return console.log("Hello " + name);
//  }
 
//  const greet3 = name => console.log("Hello " + name);
 
//  greet1("meet");

//  let score = [122,27,124];
// Math.max(...score);

// process.stdin.on('data', function(chunk) {
//     var lines = chunk.toString().split('\n');
//     var size = parseInt(lines[0]);
//     var input = [];
//     for(var i=1; i<=size; i++) {
//       input[i-1] = parseInt(lines[i]);
//     }
    
    
//     // write your code here
//     let output = input.filter(function(number){
//         return number % 10 === 0;
//     })
    
    
//     console.log(output);
//   });
const printOrderSummary = () => {
    // TODO: Write the message using template literals (template strings)
    let message = `Hi ${customer.firstName} ${customer.lastName}! Your order for ${order.items.length} items has been successfully placed. Thank you!`;

 
  console.log(message);
}

// object consisting details of the customer
const customer = {
    firstName: "Srishti",
    lastName: "Gupta",
    gender: "female"
};
const order = {
    id: "SG101",
    amount: 950,
    items: ["Apparel", "Shoes", "Bag"]
}

printOrderSummary(customer, order);

//Hi Srishti Gupta! Your order for 3 items has been successfully placed. Thank you!//