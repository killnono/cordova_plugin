function ProblemPlugin() {
}

ProblemPlugin.prototype.loadProblem = function (url, options) {
	options = options || {};
	cordova.exec(options.successCallback || null, options.errorCallback || null, "ProblemPlugin", "loadProblem", [url, options]);
};
ProblemPlugin.prototype.loadImage = function (url, options) {
	options = options || {};
	cordova.exec(options.successCallback || null, options.errorCallback || null, "ProblemPlugin", "loadImage", [url, options]);
};


ProblemPlugin.install = function () {
	if (!window.plugins) {
		window.plugins = {};
	}
	window.plugins.ProblemPlugin = new ProblemPlugin();
	return window.plugins.ProblemPlugin;
};