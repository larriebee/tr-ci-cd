node {
	// Mark the code checkout 'stage'....
	stage 'Checkout'

	// Get some code from a GitHub repository
	git url: 'https://github.com/miguelgonz/tr-ci-cd-fe.git'

	// Mark the code build 'stage'....
	stage 'Build'
	// Run the npm build
	sh "npm install"
}
