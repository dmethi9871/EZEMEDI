"use strict";
var attempt = 3;
function validate() {
var email = document.getElementById("typeEmail").value;
var password = document.getElementById("typePassword").value;
var validate = 3;

if (email == "user1" && password == "123") {
  alert("Login Success for patient 1!");
  window.location.href = "/patient1";
  return false;
} else if (email == "user2" && password == "456") {
  alert("Login Success for patient 2!");
  window.location.href = "/patient1";
  return false;
} else if (email == "user3" && password == "789") {
  alert("Login Success for doctor 1!");
  window.location.href = "/patient1";
  return false;
} else {
  validate--;
  alert("Incorrect email or password. You have " + validate + " attempts left.");
  if (validate == 0) {
    document.getElementById("typeEmail").disabled = true;
    document.getElementById("typePassword").disabled = true;
    document.getElementById("submit").disabled = true;
    return false;
  }
}

  }

