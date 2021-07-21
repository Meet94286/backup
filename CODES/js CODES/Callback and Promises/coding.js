// coding question -1

// let promise = new Promise(function(resolve, reject){
//     setTimeout(()=>{
//       Email = "srishti.gupta@upgrad.com";
//         resolve(Email);
//       },2000)
//     console.log("Getting email from server...");
// })
// promise.then(Email => {console.log(`Email  = ${Email}`);});

// promise.catch(data => {console.log(data);});


// 2. coding question

// let promise = new Promise(function(resolve, reject){
//     console.log("Getting email from server...");
//     setTimeout(()=>{
//   Email = "srishti.gupta@upgrad.com";
//   resolve(Email);
// reject("Could not get email from server!");
//     },2000);
// });
// promise.then((result) => {
//     console.log(`Email = ${result}`);
// }, (err) => {
//     console.log(err);
// });

// let getConients = callback => {
//         setTimeout(()=>{
//         let contient = "asia";
//         console.log(contient);
//         callback(contient);
//     },2000);

// };

//3. coding question

// let getUsername = validateUsername => {
//     console.log("Getting username...")
//     setTimeout(()=>{
//         let userName = "srishti";
//         console.log(`Username = ${userName}`);
//         validateUsername(userName);

//     }, 3000)
// };

// let validateUsername = (userName,callback)=>{
   
//     console.log("Validating username...");
 
//        if(userName !== undefined && userName !== null && userName !== "" ){
//            console.log("Valid Username!");
//           // getPassword(validatePassword);
//            callback();
        
         

//         } else{
//             console.log("Invalid Username! Please try again!");
//         }
        
    
// };

// let getPassword = (callback) => {
//     console.log("Getting password...");
//     setTimeout(()=>{
//         let password = "upgrad";
//         console.log(`Password = ${password}`);
//         callback(password);

//     },3000)
// };

// let validatePassword = (password,callback) => {
//     console.log("Validating password...");
//     if(password !== undefined && password !== null && password !== "" ){
//         console.log("Valid Password!");
//         callback();
//         //callback(password);
       
        
//      } else{
//          console.log("Invalid Password! Please try again!");
//      }

// };

// let done = () =>{
//     console.log("BOTH VALID!");
// };

// let login = ()=>{
//     getUsername(userName=>{
//         validateUsername(userName,()=>{
//             getPassword(password=>{
//                 validatePassword(password, ()=>{
//                     done();
//                 })
//             })
//         })
//     });
// }

// login();

// 6. coding question
// let promise = new Promise(function(resolve, reject){
//     console.log("Getting email from server...");
//     setTimeout(()=>{
//        Email = "srishti.gupta@upgrad.com";
//        console.log(`Email = ${Email}`);
//        resolve(Email);

//     }, 2000)
// });

//     async function foo(){
//     try{
//         let result = await promise;
//         async();
//     }
//     catch{
//         let err = await promise;
//         //console.log(err);
//     }
// }
// foo();

// let promise = new Promise(function(resolve, reject){
//     console.log("Getting email from server...");
//     setTimeout(()=>{
//        Email = "srishti.gupta@upgrad.com";
//        console.log(`Email = ${Email}`);
//        resolve(Email);

//     }, 2000)
// });

// async function foo(){
//     try{
//         let result = await promise;
        
//     }
//     catch(err){console.log(err);}
        
    
// }
// foo();

//header("Access-Control-Allow-Origin: *");

// function g(){
  // fetch(`https://api.openaq.org/v1/countries`)
  
  // .then(response=>response.json())
  // .then(json=>console.log(JSON.parse(json)))
  // .catch(ex=>console.log(ex))
  



// function getCountries (){
//   return new Promise(function(resolve, reject){
//     var xhr = new XMLHttpRequest();
//     xhr.open('GET',`https://api.openaq.org/v1/countries`,true)
//     xhr.send();
//     xhr.onreadystatechange = () =>{
//       if(xhr.readyState==4 && xhr.status==200){
//         resolve(xhr.response);
//       }
//       else{
//         let err = JSON.stringify({error: "no"})
//         reject(err);
//       }
//     }
//   })
// }

// getCountries().then(function(data){
//   let d = JSON.parse(data);
//   for(var i=0;i<d.results.length;i++){
//     var add = '<p>' + d.results[i].name + ' ' + d.results[i].code + '<p>';
//     document.getElementById("text-1").innerHTML += add;
//     }
// });

// if (typeof exports !== "undefined") {
//   module.exports = {
//    getCountries,
       
//    };
//   }

function generateAccessToken(username,password){
  var timestamp = new Date().toLocaleTimeString();
  var message = "";
  if(!username || !password){
    message = "Missing username and/or password!";
  } else{
    let a = window.btoa(`${username}${password}${timestamp}`);
    message = `Access Token :  ${a}`;
  }

  alert(message);
  return message;



}


