if (typeof exports !== "undefined") {
    module.exports = {
      getBankDetails,
      getContactNumber,
    };
  }

 

 function getContactNumber(){
       document.getElementById("contactButton").style.display = "none";
       let obtainedContact = sessionStorage.getItem('bank-contact-details');
       document.getElementById("contact").innerText = window.atob(obtainedContact);
    }

   
    

  function getBankDetails(ifscCode){
    return new Promise(function(resolve,reject){
        let link = `https://ifsc.razorpay.com/${ifscCode}`;
          let  xhr = new XMLHttpRequest();
          xhr.open('GET',link);
          xhr.send();
          xhr.onreadystatechange = function(){
              if(xhr.status == 404){
              document.getElementById("invalidCode").innerHTML = `Invalid IFSC Code:${ifscCode}` ; 
              document.getElementById("contactButton").style.display = "none";

            }
             else if(xhr.readyState == 4 && xhr.status ==200)
              {
                  let res = JSON.parse(xhr.responseText);
                  resolve(res);
                  document.getElementById("invalidCode").style.display = "none"; 

                  document.getElementById("bankName").innerHTML = res.BANK;
                  document.getElementById("branchName").innerHTML = res.BRANCH;
                  document.getElementById("address").innerHTML = res.ADDRESS;
                  document.getElementById("city").innerHTML = res.CITY;
                  document.getElementById("state").innerHTML = res.STATE;
                  document.getElementById("micr").innerHTML = res.MICR;
                sessionStorage.setItem("bank-contact-details",window.btoa(res.CONTACT));
                }
                else
                {
                    reject({error: `Invalid IFSC Code:${ifscCode}`});
                 
                   
                }
          }
        });
    }
  


    

 
