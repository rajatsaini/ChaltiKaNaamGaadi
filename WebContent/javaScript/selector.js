var choices = ["Name", "Age", "Gender"];

function addInput(divName) {
    var newDiv = document.createElement('div');
    var selectHTML = "";
    selectHTML="<tr>";
    for(i = 0; i < choices.length; i = i + 1) {
        selectHTML += "<td><input type='text' name='"+choices[i]+"'placeholder='" + choices[i] + "'/>" + "</td>";
    }
    selectHTML += "</tr>";
    newDiv.innerHTML = selectHTML;
    document.getElementById(divName).appendChild(newDiv);
}