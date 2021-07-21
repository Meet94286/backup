let generateAccessToken = (username, password) => {
  if (username.length == 0 || password.length == 0) {
    alert("Missing username and/or password!");
    return "Missing username and/or password!";
  } 
  else {
    let currDate = new Date().toLocaleTimeString();
    let stringToEncode = username + password + currDate;
    let accessToken = window.btoa(stringToEncode);
    alert("Access Token : " + accessToken);
    return "Access Token : " + accessToken;
  }
}

if (typeof exports !== "undefined") {
  module.exports = {
    generateAccessToken,
  };
}
