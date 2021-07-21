
  function enterTheCode(country){
    return new Promise(function(resolve,reject){
        let url = `https://api.openaq.org/v1/cities?country=${country}`;
        let xhr = new XMLHttpRequest();
        xhr.open('GET',url);
        xhr.send();
        xhr.onreadystatechange = function(){
            if(xhr.readyState ==4 && xhr.status ==200){
                let result = JSON.parse(xhr.responseText);
                resolve(result);
                let a = result.results[0].name
              document.getElementById("city-list").innerHTML ="<p>a/p>";
            }
            else
            {
                reject( JSON.stringify({error: `Failed to GET cities for ${country}`}));
            }
        };

    });
}
if (typeof exports !== "undefined") {
    module.exports = {
      enterTheCode,
    };
  }


//enterTheCode(countryCode);