// 
// setTimeout(()=>{ console.log("WALCOME TO UPGRAD")},3000);

// let add = (num1, num2,callback) => {
//    // let answer = result;
//    let answer = num1 + num2;
//     callback(answer);
//     }
//     let display = (answer)=> alert(`The sum is ${answer}.`);
//     add(1, 12,display);

// //
// let concept;
// concept1 = "101";

// const getConcept = (callback) => {
// setTimeout(() => {
//    concept1 = "Callback";
//    concept1 = "hii";
// callback();
// }, 0000);
// }
// const print = () => {
// console.log(`JavaScript  ${concept1}`);
// }
// getConcept(print);    
 



// let promise = new Promise(function(resolve, reject){
//     setTimeout (() => {
//         let contient = "asia";
        
       
//     }, 1000);
// })


// // let print = () => {
// //     console.log(contient);
// // }

// promise .then(data => console.log(data));
//         promise.catch(data => console.log(data));

// let promise = new Promise(function(resolve, reject){
//     setTimeout(()=>{
//       Email = "srishti.gupta@upgrad.com";
        
//         reject("hii");
//         resolve(Email);
//       },2000)
//     console.log("Getting email from server...");
// })
// promise.then(Email => {console.log(`Email  = ${Email}`);});

// promise.catch(data => {console.log(data);});



// let getCountries = (contient,callback )=> {
//         setTimeout(()=>{
//         let countries = ["india", "america", "japan", "spain"];
//         console.log(countries);
//         callback(countries);
//     },2000);
// };

// let getStates =(countries,callback) => {
//     setTimeout(()=>{
//         let states = ["gujarat", "MP","UP", "HP"];
//         console.log(states);
//         callback(states);
//     })
// };

// let getArea = (callback)=>{
//     setTimeout(()=>{
//         let area = "triveni";
//         console.log(area);
//         callback(area);
//     })
// };

// let getStreet = (callback)=>{
//     setTimeout(()=>{
//         let street = "101";
//         callback(street);
//     }, 1000);
// };



// getConients(contient => {
//     getCountries(contient, countries => {
//         getStates(countries,states => {
//            getArea(area =>{
//                getStreet(street=>{
//                    console.log(street);
//                })
//         })
      
//     })});
// })




















//let orderId = null;
 
// let placeOrder = (callback) => {
//   // console.log("Placing order");
//    setTimeout(() => {
//        orderId = "101";
//        callback();
//    }, 2000);
// }
 
// let printOrderID = () => {
//    console.log(`Order ID = ${orderId}`);
// }
 
// placeOrder(printOrderID);



let a = [1,2,3];
let b = console.log(a.reduce(function(num,num1){
    return num * num1;
}));