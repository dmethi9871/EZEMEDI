function load() {
	window.setInterval(function() {
		reloadframe1()
	}, 5000);
	function reloadframe1() {
		document.getElementById('iframe1').src = document.getElementById('iframe1').src;
	}
	window.setInterval(function() {
		reloadframe2()
	}, 5000);
	function reloadframe2() {
		document.getElementById('iframe2').src = document.getElementById('iframe2').src;
	}
	load();
}