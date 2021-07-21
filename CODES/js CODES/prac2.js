

 document.getElementById('btn').addEventListener('click', click);
 function click(){
     alert('i am the best');
         }
document.getElementById('btn').addEventListener('click', counting);
var count = 0;
function counting(){
    document.getElementById('count').innerHTML = ++count;
}


var a = localStorage.getItem('a');
console.log(a);


//localStorage.setItem('a', 10);

// 
// 
// let printString = (string, callback) => {
//     return new Promise((resolve, reject) => {
//         setTimeout(() => {
//              console.log(string)
//              resolve(callback())
//          },
//          3000);
//     });
// }
       
// let printAll = () => {
//     printString("1", () => {console.log("callback")})
//            .then(() => {
//                return printString("2", () => {console.log("callback")});
//            })
//            .then(() => {
//                return printString("3", () => {console.log("callback")});
//            })
// }
// printAll();

// 
let loadImage1 = new Promise((resolve, reject) => {
    console.log("Example 1: Loading image...");
    setTimeout(() => {
        let imageUrl = "Desktop/image.png";
        resolve();
    }, 2000);
 });
 
 loadImage1.then(() => {
    console.log("Image loaded successfully!");
 }, ((error) => {
    console.log(new Error(error));
 }));
 
 // Example 2
 let loadImage2 = new Promise((resolve, reject) => {
    console.log("Example 2: Loading image...");
    setTimeout(() => {
        let imageUrl = "Desktop/image.png";
        reject(new Error("Error in loading image!"));
    }, 2000);
 });