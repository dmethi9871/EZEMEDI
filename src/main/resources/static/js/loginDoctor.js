"use strict";
var attempt = 3;
function validate() {
  var username = document.getElementById("typeUserName").value;
  var password = document.getElementById("typePassword").value;
  if (username == "Doctor" && password == "123") {
    alert("Login successfully");
    window.location.href = "/prescription1";
    return false;
  } else {
    attempt--;
    alert("You have left " + attempt + " attempt;");
    if (attempt == 0) {
      document.getElementById("typeUserName").disabled = true;
      document.getElementById("typePassword").disabled = true;
      document.getElementById("submit").disabled = true;
      return false;
    }
  }
}
