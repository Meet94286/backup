// if (typeof exports !== "undefined") {
//     module.exports = {
//       getCities,
//     };
//   }

  
  

//   function getCities(){
//       return new Promise(function(resolve, reject){
//         var xhr = new XMLHttpRequest();
//           var country_code =  document.getElementById("country").value;
        
//           var b = `https://api.openaq.org/v1/cities?country=${country_code}`;
         
//           xhr.open('GET',b,true);
//           xhr.send();
//           xhr.onreadystatechange = () =>{
//               if(xhr.readyState ==4 && xhr.status==200){
//                   resolve(xhr.response);
//               }
//               else{
//                   let err = JSON.stringify({error: "Failed to GET cities for <country-code>"} );
//                   reject(err);
//               }
//           }
//       })
//   }

//   getCities().then(function(data){
//       let d = JSON.parse(data);
//       for(var i=0;i<d.results.length;i++){
//          var add =  d.results ;
//            console.log(JSON.parse(add));
//           }
//   }).catch(err=>console.log(err))
// function getCities(){
//   let a = document.getElementById("country").value;
// fetch(`https://api.openaq.org/v1/cities?country=${a}`)
// .then((apidata)=>{
  
//  return apidata.json();
  
// })

// .catch(error=>
//   console.log(error));
// }
// getCities()

// fetch("https://travel-advisor.p.rapidapi.com/locations/v2/auto-complete?query=eiffel%20tower&lang=en_US&units=km", {
// 	"method": "GET",
// 	"headers": {
// 		"x-rapidapi-key": "e64884c8aamshdfb72ab55cb56c0p122fffjsn80ebf167af2b",
// 		"x-rapidapi-host": "travel-advisor.p.rapidapi.com"
// 	}
// })
// .then(response => {
// 	console.log(response);
// })
// .catch(err => {
// 	console.error(err);
// });
// fetch("https://travel-advisor.p.rapidapi.com/locations/search?query=delhi&limit=30&offset=0&units=km&location_id=1&currency=USD&sort=relevance&lang=en_US", {
// 	"method": "GET",
// 	"headers": {
// 		"x-rapidapi-key": "e64884c8aamshdfb72ab55cb56c0p122fffjsn80ebf167af2b",
// 		"x-rapidapi-host": "travel-advisor.p.rapidapi.com"
// 	}
// })
// .then(response => {
// 	console.log(response);
// })
// .catch(err => {
// 	console.error(err);
// });
// 

// var toAdd = document.getElementById("container");
// var i=1;
// while(i < 101){
//    var newLi = document.createElement('div');
//    newLi.id = 'Product'+i;
//    newLi.className = 'item';
//    newLi.innerHTML = "<p>hiii</p>"

//   // toAdd.appendChild(newLi);
//    i++;
// }

let a = "Hello World";
let b = a.split("");
console.log(b);