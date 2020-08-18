node{
	stage('git checkout'){
		git 'https://github.com/kipu23/java-helloworld'
	}
	stage('compile-package'){
		sh 'mvn package'
	}
}