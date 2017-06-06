document.getElementById('Type').addEventListener('change', function(evt) {
  var type = this.selectedOptions[0].value;
  console.dir(this);
  document.getElementById('Value').setAttribute('name', type);
  document.getElementById('QueryName').textContent = type;
  this.form.action = type + ".php";
});