node{
	stage('git checkout'){
		git branch: 'master', credentialsId: 'github-kipu23', url: 'https://github.com/kipu23/java-helloworld.git'
	}
	stage('compile-package'){
			bat 'mvn compile'
	}
}
